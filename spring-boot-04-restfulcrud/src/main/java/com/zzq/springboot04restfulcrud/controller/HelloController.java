package com.zzq.springboot04restfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import java.util.Map;

/**
 * @author ZZQ
 * @date 2018/8/30 16:24
 */
@Controller
@RequestMapping("/user")
public class HelloController {


    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request){

        String ip2 = HelloController.getIp2(request);
        System.out.println(ip2);
        if(username.equals("username") && "password".equals(password)){
            request.getSession().setAttribute("username",username);
            return  "redirect:/main.html" ;
        }else {
            request.setAttribute("msg","用户名密码错误");
            return  "login";
        }



    }




         public static   String getIp2(HttpServletRequest request) {
                    String ip = request.getHeader("X-Forwarded-For");
                   if(ip!=null && !"unKnown".equalsIgnoreCase(ip)){
                           //多次反向代理后会有多个ip值，第一个ip才是真实ip
                       int index = ip.indexOf(",");if(index != -1){
                           return ip.substring(0,index);
                }else{
                           return ip;
                                }
                       }ip = request.getHeader("X-Real-IP");
                   if(ip!=null && !"unKnown".equalsIgnoreCase(ip)){
                            return ip;
                        }
                    return request.getRemoteAddr();
                }




}
