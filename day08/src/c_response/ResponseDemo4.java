package c_response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * content-type----服务器发送给浏览器的数据类型和数据编码格式
 */
public class ResponseDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置content-type响应
		//response.setHeader("content-type", "text/html;charset=utf-8");
		//response.setContentType("text/html;charset=utf-8");
		//两个表达式等价
		
		//设置数据类型
		response.setContentType("text/xml");	//告诉浏览器以什么样的格式来解析数据
		//response.setContentType("text/html");	//告诉浏览器以什么样的格式来解析数据
		//response.setContentType("image/jpg");	//告诉浏览器以什么样的格式来解析数据
		response.getWriter().write("<html><head><title>this is a title</title></head></html>");
	}

}
