/**
 * refere 案例
 */
package b_request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/heml;charset=utf-8");
		//代表下载资源文件
		//referer表示当前请求来自哪里
		String referer = request.getHeader("referer");
		System.out.println(referer);
		if(referer == null || !referer.contains("/adv.html")){
			response.getWriter().write("你当前是非法请求，请转到首页。<a href='/day08/adv.html'>首页</a>");
		}else{
			response.getWriter().write("资源正在下载");
		}
		
		
		
		
		
	}


}
