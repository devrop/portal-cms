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
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.URI;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.eintrusty.ui.dto.UserBean;
import com.eintrusty.ui.dto.UserDto;
import com.eintrusty.ui.utiity.StringUtility;


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
       String enpassword = StringUtility.encrypt(loginBean.getPassword());
       System.out.println("password" + enpassword);
       HttpHeaders headers = new HttpHeaders();
   	   headers.setContentType(MediaType.APPLICATION_JSON);
       RestTemplate restTemplate = new RestTemplate();
       UserDto userDto = new UserDto();
       userDto.setUsername(username);
       userDto.setPassword(enpassword);
	   String url = "http://localhost:8080/login";
       HttpEntity<UserDto> requestEntity = new HttpEntity<UserDto>(userDto, headers);
       ResponseEntity<UserDto> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, UserDto.class);
       UserDto userGet = responseEntity.getBody();
       if(userGet ==null){
    	   
       }
       
       //URI uri = restTemplate.postForLocation(url, requestEntity);
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
