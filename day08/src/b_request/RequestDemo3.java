package b_request;
/**
 * 使用user-agent请求头,能够识别浏览器的类型
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo3
 */
public class RequestDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/heml;charset=utf-8");
		
		String userAgent = request.getHeader("user-agent");		//使用getHeader()方法获得请求头关键字，可以得到浏览器类型
		System.out.println(userAgent);
		if(userAgent.contains("Firefox")){
			response.getWriter().write("你正在使用火狐浏览器");
		}else if(userAgent.contains("Chrome")){
			response.getWriter().write("你正在使用谷歌浏览器");
		}else if(userAgent.contains("Trident")){
			response.getWriter().write("你正在使用IE浏览器");
		}else{
			response.getWriter().write("不能识别的浏览器");
		}
		
		
	}

}
