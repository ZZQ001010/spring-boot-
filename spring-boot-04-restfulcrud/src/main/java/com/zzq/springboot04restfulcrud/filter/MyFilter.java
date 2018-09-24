package com.zzq.springboot04restfulcrud.filter;

import javax.servlet.*;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.net.SocketAddress;

/**
 * @author ZZQ
 * @date 2018/9/3 11:22
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...............");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter...............");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy......");
    }
}
