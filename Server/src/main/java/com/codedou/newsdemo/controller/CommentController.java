package com.codedou.newsdemo.controller;

import com.codedou.newsdemo.entity.Comment;
import com.codedou.newsdemo.service.CommentService;
import com.codedou.newsdemo.vo.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CommentController {
//spring data jpa
    @Autowired
    private CommentService commentService;

    @GetMapping("/comment/{id}")
    public List<CommentVO> getCommentsByNewsId(@PathVariable("id") Integer id){
        System.out.println("查询评论成功");
        return commentService.getCommentsByNewsId(id);
    }

    @PostMapping("/comment")
    public void postComment(@RequestParam("nid") int nid,
                                 @RequestParam("uid") int uid,
                                 @RequestParam("text") String text){
        System.out.println("发表评论进来了");
        commentService.postComment(nid,uid,text);
    }
}
