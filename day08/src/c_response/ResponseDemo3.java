package c_response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * refresh----定时刷新或每隔n秒跳转页面
 */
public class ResponseDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");	//服务器发送给浏览器的数据类型和数据编码格式
		//设置refresh响应头
		response.setHeader("refresh", "2");
		//设置refresh
		response.getWriter().write("注册成功，3秒后自动返沪页面。");
		response.setHeader("refresh", "3;/day08/adv.html");
	}

}
