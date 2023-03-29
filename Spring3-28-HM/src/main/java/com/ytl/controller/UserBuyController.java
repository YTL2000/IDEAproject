package com.ytl.controller;

import com.ytl.service.UserBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @version 1.0
 * @auther YTL
 * @className UserBuyController
 * since 1.0
 */
@Controller
public class UserBuyController {
    @Autowired
    UserBuyService userBuyService;
   public void userBuyProduct(Integer uId,Integer pNum,Integer pId){
       userBuyService.userBuyProduct(uId,pNum,pId);
   };
}
