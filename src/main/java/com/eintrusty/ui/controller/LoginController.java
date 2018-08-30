/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eintrusty.ui.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eintrusty.ui.dto.UserBean;


/**
 *
 * @author user
 */
@Controller
@RequestMapping("Login")
public class LoginController {

    @RequestMapping()
    public String getLoginPage(Model model) {
      UserBean loginBean = new UserBean();
      model.addAttribute("loginBean", loginBean);
      return "Login";
    }  
    @RequestMapping("sumbit")
    public String cekLogin (@ModelAttribute("loginBean") UserBean loginBean,HttpSession session,Model model){
       String username = loginBean.getUsername();
       String password = loginBean.getPassword();
       Map<String,String> parameterLogin = new HashMap<String,String>();
       parameterLogin.put("username", username);
       parameterLogin.put("password", password);
       
      //UserDto userLogin = us.findActiveUserLogin(parameterLogin);
       //if(userLogin != null){
    	   //User
    	 //  session.setAttribute("user", userLogin);
    	   //model.addAttribute("data", userLogin);
    	   //mode
    	   //return "succeslogin"; 
       //}
      return "failedlogin";
    }
    
    
    
}
