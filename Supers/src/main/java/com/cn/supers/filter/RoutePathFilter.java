package com.cn.supers.filter;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import com.cn.supers.msg.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The type  configure.
 *
 * @author bdth
 */
@Configuration
@Slf4j
public class RoutePathFilter {


    /**
     * Gets sa servlet filter.
     *
     * @return the sa servlet filter
     */
    @Bean
    public SaServletFilter getSaServletFilter() {
        return new SaServletFilter()
                .addInclude("/**").addExclude("/favicon.ico")
                .setAuth(obj -> {
                    SaRouter
                            .match("/**")
                            .notMatch("/auth/**")
                            .notMatch("/super/api")
                            .check(r -> StpUtil.checkLogin());

                })
                .setError(e -> {
                    log.error(e.getMessage());
                    return Result.error("AuthConstants.LOGIN_FAILED");
                })
                .setBeforeAuth(r -> SaHolder.getResponse()
                        .setServer("sa-server")
                        .setHeader("X-Frame-Options", "SAMEORIGIN")
                        .setHeader("X-XSS-Protection", "1; mode=block")
                        .setHeader("X-Content-Type-Options", "nosniff"));
    }
}
