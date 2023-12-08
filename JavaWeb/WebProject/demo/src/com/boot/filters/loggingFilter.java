package com.boot.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bin
 * @date 2023-12-08 9:13
 */

/**
 * 1.实现Filter接口
 * 2.重写过滤方法
 * 3.配置过滤器
 *      web.xml
 *      注解
 */
@WebFilter(
        filterName = "loggingFilter",
        urlPatterns = {"/*", "/session"},
        servletNames = {"session"}
)
public class loggingFilter implements Filter {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

    /*
        过滤请求的和响应的方法
            1. 请求到达目标资源之前，先经过该方法
            2. 该方法有能力控制请求是否继续向后到达目标资源 可以在该方法内直接向客户端做响应处理
            3. 请求到达目标资源后，响应之前，还会经过该方法
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        /*
            1.请求到达目标资源之前的功能代码
                判断是否登录
                校验权限是否满足
            2.放行代码
            3.响应之前是否修改响应报文
         */

        // 请求到达目标资源之前的代码
        System.out.println("过滤器 loggingFilter before filterChain.doFilter invoked");

        /*HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String requestURI = request.getRequestURI();
        String dataTime = dateFormat.format(new Date());
        System.out.println(requestURI + "在" + dataTime + "被访问了");
        long t1 = System.currentTimeMillis();*/


        // 放行
        filterChain.doFilter(servletRequest, servletResponse);

        // 响应之前的功能代码
        System.out.println("过滤器 loggingFilter after filterChain.doFilter invoked");
        // long t2 = System.currentTimeMillis();
        // System.out.println("请求耗时" + (t2-t1) + "ms");
    }

}
