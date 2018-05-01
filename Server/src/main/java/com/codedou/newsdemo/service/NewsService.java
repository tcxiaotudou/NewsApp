package com.codedou.newsdemo.service;

import com.codedou.newsdemo.entity.News;
import com.codedou.newsdemo.repository.NewsRepository;
import com.codedou.newsdemo.vo.NewsVo;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> findAllNews(){
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        return newsRepository.findAll(sort);
    }

    public NewsVo getNewsVoById(Integer id){
        News news = newsRepository.findOne(id);
        long timeStamp = news.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));

        NewsVo newsVo = new NewsVo(news.getId(),news.getCid(),news.getAuthor(),news.getTitle(),news.getInfo(),news.getImg(),news.getTime(),sd,news.getText(),news.getZan());
        return newsVo;
    }

    public News getNewsById(Integer id){
        return newsRepository.findOne(id);
    }

    public List<News> getNewsByType(Integer cid){
        return newsRepository.findAllByCid(cid);
    }

    public Page<News> findIndexNews(){
        Sort sort=new Sort(Sort.Direction.DESC,"zan");
        Pageable pageable = new PageRequest(0, 8, sort);
        return newsRepository.findAll(pageable);
    }

    public void saveNews(News news){
        newsRepository.save(news);
    }
}
