package com.codedou.newsdemo.service;

import com.codedou.newsdemo.entity.Comment;
import com.codedou.newsdemo.repository.CommentRepository;
import com.codedou.newsdemo.vo.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserService userService;

    public List<CommentVO> getCommentsByNewsId(Integer id){
        List<Comment> list = commentRepository.findCommentsByNid(id);
        System.out.println(list);
        List<CommentVO> voList = new ArrayList<CommentVO>();
        for (Comment comment:list
             ) {
            String userName = userService.getUerById(comment.getUid()).getUserName();
            System.out.println(userName);
            long timeStamp = comment.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
            voList.add(new CommentVO(userName,comment.getText(),sd));
        }
        return voList;
    }

    public void postComment(int nid,int uid,String text){
        long timeStamp = System.currentTimeMillis();
        Comment comment = new Comment(nid,uid,text,timeStamp);
        System.out.println("发表评论成功");
        commentRepository.save(comment);
    }
}
