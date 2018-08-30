package c_response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用HttpServletResponse修改响应数据
 */
public class ResponseDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //1）tomcat服务器提供了一个HttpServletResponse对象，用于给开发者修改响应数据
	//2）通过service方法把response对象传入到servlet中 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3.1 响应行：设置状态码
//		response.setStatus(404);
//		response.sendError(404);
//		//3.2响应头
//		response.setHeader("server","weblogic");	//更改服务器类型
		
		//3.3 实体内容，在浏览器主体部分可以看到
		//response.getWriter().write("this is contents");			//以字符流方式发送
		response.getOutputStream().write("this is contents".getBytes());	//以字节流发送，write方法只能调用一次
	}

}
