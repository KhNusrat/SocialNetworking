/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.dao;

import com.social.entity.Comment;
import java.util.List;

/**
 *
 * @author B13
 */
public interface CommentDaoInterface {
      public void addComment(Comment comment);

    public void updateComment(Comment comment);

    public List<Comment> listComment();

    public Comment getCommentById(Integer Id);

    public void removeComment(Integer Id); 
}
