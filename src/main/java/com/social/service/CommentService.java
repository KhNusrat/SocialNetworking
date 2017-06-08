/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.service;

import com.social.dao.CommentDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author B13
 */
public class CommentService {
     @Autowired
    private CommentDaoInterface commentDaoInt;
}
