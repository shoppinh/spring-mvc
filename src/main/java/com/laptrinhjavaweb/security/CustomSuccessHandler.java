package com.laptrinhjavaweb.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.util.SecurityUtil;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
	throws IOException{
		String targetURL = determineTargetUrl(authentication);
		if (response.isCommitted()) {
			return;
		}
		redirectStrategy.sendRedirect(request, response, targetURL);
	}

	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	private String determineTargetUrl(Authentication authentication) {
		String url ="";
		List<String> roles = SecurityUtil.getAuthorities();
		if(isAdmin(roles))
			url = "/quan-tri/trang-chu";
		else if(isUser(roles))
			url = "/trang-chu";
			
		
		return url;
	}
	public boolean isAdmin(List<String> roles) {
		if(roles.contains("ADMIN"))
			return true;
		else
			return false;
	}
	
	public boolean isUser(List<String> roles) {
		if(roles.contains("USER"))
			return true;
		else
			return false;
	}

}
