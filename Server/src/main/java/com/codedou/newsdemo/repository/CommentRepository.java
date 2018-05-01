package com.codedou.newsdemo.repository;

import com.codedou.newsdemo.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {

    List<Comment> findCommentsByNid(Integer cid);
}
