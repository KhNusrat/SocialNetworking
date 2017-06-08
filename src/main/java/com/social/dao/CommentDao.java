/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.dao;

import com.social.entity.Comment;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author B13
 */
public class CommentDao implements CommentDaoInterface{
      @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addComment(Comment comment) {
    }

    @Override
    public void updateComment(Comment comment) {
    }

    @Override
    public List<Comment> listComment() {
        return null;
    }

    @Override
    public Comment getCommentById(Integer Id) {
        return null;
    }

    @Override
    public void removeComment(Integer Id) {
    }
    
}
