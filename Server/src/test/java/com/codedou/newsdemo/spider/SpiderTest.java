package com.codedou.newsdemo.spider;

import com.codedou.newsdemo.service.NewsSpiderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpiderTest {

    @Autowired
    private NewsSpiderService newsSpiderService;

    @Test
    public void testSpider() throws IOException {
        newsSpiderService.getChapterList();
    }

    @Test
    public void testHotNewsSpider() throws IOException, InterruptedException {
        newsSpiderService.getHotChapterList();
    }
}
