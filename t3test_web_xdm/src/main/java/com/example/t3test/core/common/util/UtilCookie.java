package com.example.t3test.core.common.util;


import com.example.t3test.core.common.constants.Constants;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

public class UtilCookie {
	
    public static Cookie createCookie(String name, String value) throws Exception {
        return new Cookie(name, URLEncoder.encode(value, "utf-8"));
    }
	
    
    public static void createCookie(String name, String value, String domain, String path, int maxAge) throws Exception {
    	HttpServletResponse httpServletResponse = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getResponse();
    	Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
        cookie.setDomain(domain);
        cookie.setPath(path);
        cookie.setMaxAge(maxAge);
        httpServletResponse.addCookie(cookie);
    }
    

    public static String getValue(String name) throws Exception {
    	HttpServletRequest httpServletRequest = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
    	Cookie[] cookies = httpServletRequest.getCookies();
    	
    	String rt = null;
    	
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(Constants.COOKIE_NAME_SEQ)) {
					rt = cookie.getValue();
				} else {
					//	by pass
				}
			}
		} else {
			//	by pass
		}
    	return rt;
    }
    

    public static void deleteCookie() throws Exception {
    	HttpServletResponse httpServletResponse = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getResponse();
       	Cookie cookie = new Cookie(Constants.COOKIE_NAME_SEQ, null);
       	cookie.setPath("/");
       	cookie.setDomain("");
        cookie.setMaxAge(0);
        httpServletResponse.addCookie(cookie);
    }
    
}
