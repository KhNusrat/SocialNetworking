/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.dao;

import com.social.entity.CommentLikes;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author B13
 */
public class CommentLikesDao implements CommentLikesDaoInterface{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCommentLikes(CommentLikes commentLikes) {
    }

    @Override
    public void updateCommentLikes(CommentLikes commentLikes) {
    }

    @Override
    public List<CommentLikes> listCommentLikes() {
         return null;
    }

    @Override
    public CommentLikes getCommentLikesById(Integer Id) {
         return null;
    }

    @Override
    public void removeCommentLikes(Integer Id) {
    }
    
}
