/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.dao;

import com.social.entity.CommentLikes;
import java.util.List;

/**
 *
 * @author B13
 */
public interface CommentLikesDaoInterface {
    public void addCommentLikes(CommentLikes commentLikes);

    public void updateCommentLikes(CommentLikes commentLikes);

    public List<CommentLikes> listCommentLikes();

    public CommentLikes getCommentLikesById(Integer Id);

    public void removeCommentLikes(Integer Id);
}
