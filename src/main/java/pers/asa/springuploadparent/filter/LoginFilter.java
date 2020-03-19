package pers.asa.springuploadparent.filter;

import org.springframework.context.annotation.Configuration;
import pers.asa.springuploadparent.support.Loggable;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * @version 1.0.0
 * @author: rongbin.xie
 * @date: 2020/3/19
 * @CopyRight: COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
@Configuration
public class LoginFilter implements Filter, Loggable {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("--------------->login filter start:{}", new Date());
        filterChain.doFilter(servletRequest, servletResponse);
        logger.info("--------------->login filter end:{}", new Date());
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
