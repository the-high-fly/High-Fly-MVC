package it.thehighfly.the_high_fly.config;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthManager implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String xHeader = request.getHeader("Authorization");
		boolean permission = checkAuth(xHeader); // getPermission(xHeader);
		
		if (permission) {
			return true;
		} else {
			response.setStatus(HttpStatus.UNAUTHORIZED.value());
			return false;
			// Above code will send a 401 with no response body.
			// If you need a 401 view, do a redirect instead of
			// returning false.
			// response.sendRedirect("/401"); // assuming you have a handler mapping for 401

		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	private boolean checkAuth(String xHeader) {
		
		if(xHeader != null) {
			String base64Credentials = xHeader.substring("Basic".length()).trim();
		    byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
		    String credentials = new String(credDecoded, StandardCharsets.UTF_8);
		    // credentials = username:password
		    final String[] values = credentials.split(":", 2);
		    return true;
		}
		return false;
	}
}