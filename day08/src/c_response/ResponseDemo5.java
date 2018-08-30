package c_response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * content-Disposition   以下载的方式打开资源
 */
public class ResponseDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//告诉浏览器以下载的方式打开
		response.setHeader("content-disposition", "attachment;filename=G:/Javaweb/CSS/mm.jpg");
		
		
		//1）读取本地文件
		FileInputStream in = new FileInputStream("G:/Javaweb/CSS/mm.jpg");
		
		//2)写出到浏览器
		OutputStream out = response.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		//边读边写
		while((len=in.read(buf))!=-1){
			out.write(buf, 0, len);
		}
		out.close();
		in.close();
	}


}
