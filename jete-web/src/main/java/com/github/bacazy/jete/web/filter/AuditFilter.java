package com.github.bacazy.jete.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
@Order(1)
public class AuditFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(AuditFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        long t = System.currentTimeMillis();
        logger.info("[{}]: {}", request.getMethod(), request.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        logger.info("[{}]: {}, use time: {}ms", request.getMethod(), request.getRequestURI(), System.currentTimeMillis() - t);
    }
}
