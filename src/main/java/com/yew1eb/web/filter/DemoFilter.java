package com.yew1eb.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */

@WebFilter(filterName="demoFilter",urlPatterns="/*")
public class DemoFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(DemoFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOG.info("Demo filter init ...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        LOG.info("Demo filter run ...");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        LOG.info("Demo filter destroy ...");
    }
}
