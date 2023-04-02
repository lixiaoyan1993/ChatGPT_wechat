package com.cn.supers.filter;

import cn.dev33.satoken.stp.StpInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The type Auth interface.
 *
 * @author bdth
 */
@Component
@RequiredArgsConstructor
public class AuthInterfaceFilter implements StpInterface {


    /**
     * Gets role list.
     *
     * @param o the o
     * @param s the s
     * @return the role list
     */
    @Override
    public List<String> getRoleList(Object o, String s) {
        return null;
    }

    /**
     * Gets permission list.
     *
     * @param o the o
     * @param s the s
     * @return the permission list
     */
    @Override
    public List<String> getPermissionList(Object o, String s) {
        return null;
    }


}
