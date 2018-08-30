package c_response;
/**
 * location+302 请求重定向,跳转到其他页面
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseDemo2
 */
public class ResponseDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置302状态码
		response.setStatus(302);
		//设置location响应头
		response.setHeader("location", "/day08/adv.html");	//	"/day08/adv.html" 是输入到浏览器地址栏的地址，不是文件夹地址
		//以下为响应头简化版本
		response.sendRedirect("/day08/adv.html");
		
		
	}

}
