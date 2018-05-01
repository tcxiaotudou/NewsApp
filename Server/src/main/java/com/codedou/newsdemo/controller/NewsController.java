package com.codedou.newsdemo.controller;


import com.codedou.newsdemo.entity.News;
import com.codedou.newsdemo.service.NewsService;
import com.codedou.newsdemo.vo.NewsVo;
import com.codedou.newsdemo.vo.SimpleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/indexNews")
    public Page<News> getIndexNews(){
        return newsService.findIndexNews();
    }

    @RequestMapping("/news")
    public List<News> News(){
        List<News> newsList = newsService.findAllNews();
        return newsList;
    }

    @RequestMapping("news/{id}")
    public NewsVo getNewsById(@PathVariable("id") Integer id){
        return newsService.getNewsVoById(id);
    }

    @GetMapping("news/{type}/all")
    public List<News> getNewsByType(@PathVariable("type") String type){
        if(type.equals("star")) {
            return newsService.getNewsByType(1);
        }else if(type.equals("hot")){
            return newsService.getNewsByType(2);
        }else if(type.equals("fun")){
            return newsService.getNewsByType(3);
        }else if(type.equals("life")){
            return newsService.getNewsByType(4);
        }
        return null;
    }

    @PostMapping("/news/{id}/zan")
    public SimpleObject reflushNewsZan(@PathVariable("id") Integer id){
        News news =  newsService.getNewsById(id);
        Integer zan = news.getZan();
        news.setZan(zan+1);
        newsService.saveNews(news);
        return new SimpleObject(200,"点赞成功");
    }
}
