package com.codedou.newsdemo.service;

import com.codedou.newsdemo.entity.Chapter;
import com.codedou.newsdemo.entity.News;
import com.codedou.newsdemo.repository.NewsRepository;
import com.codedou.newsdemo.vo.NewsPO;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsSpiderService {

    @Autowired
    private NewsRepository newsRepository;
//http://culture.ifeng.com/listpage/59664/1/list.shtml
    public void getChapterList() throws IOException {
        String url = "http://culture.ifeng.com/listpage/59668/1/list.shtml";
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String s = EntityUtils.toString(response.getEntity());
        Document doc = Jsoup.parse(s);
        List<Chapter> list = new ArrayList<Chapter>();
        Elements elements = doc.select(".box_list.clearfix h2 a");
        for (Element e: elements
             ) {
            list.add(new Chapter(e.text(),e.attr("href")));
        }

        List<News> newsList = new ArrayList<News>();

        for (Chapter c: list
             ) {
            System.out.println(c.getUrl());
            httpGet = new HttpGet(c.getUrl());
            response = httpClient.execute(httpGet);
            s = EntityUtils.toString(response.getEntity(),"utf-8");
            doc = Jsoup.parse(s);
            String text = doc.select("#main_content").toString();
            String title = doc.select("title").text().replace("_娱乐频道_凤凰网","");
            String info = doc.select(".dy_box.ss_none p").text();
            String img = doc.select(".detailPic img").first().attr("src");
            String author = doc.select(".ss03").text();
            long timeStamp = System.currentTimeMillis();
            newsList.add(new News(4,author,title,info,img,timeStamp,text,0));
            newsRepository.save(newsList);
        }

    }

    public void getHotChapterList() throws IOException, InterruptedException {
        String url = "http://news.ifeng.com/listpage/11502/0/1/rtlist.shtml";
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String s = EntityUtils.toString(response.getEntity());
        Document doc = Jsoup.parse(s);
        List<Chapter> list = new ArrayList<Chapter>();
        Elements elements = doc.select(".newsList ul li a");
        for (Element e: elements
                ) {
            System.out.println(e.attr("href"));
            list.add(new Chapter(e.text(),e.attr("href")));
        }

        List<News> newsList = new ArrayList<News>();

        for (Chapter c: list
                ) {

            httpGet = new HttpGet(c.getUrl());
            response = httpClient.execute(httpGet);
            s = EntityUtils.toString(response.getEntity(),"utf-8");
            doc = Jsoup.parse(s);
            String text = doc.select("#main_content").toString();
            String title = doc.select("#artical_topic").text();
            String info = doc.select(".dy_box.ss_none p").text();
            String img = doc.select(".detailPic img").first().attr("src");
            String author = doc.select(".ss03").text();
            long timeStamp = System.currentTimeMillis();
            System.out.println(img);
            newsList.add(new News(2,author,title,info,img,timeStamp,text,0));
            newsRepository.save(newsList);
            Thread.sleep(20000);
        }

    }
}
