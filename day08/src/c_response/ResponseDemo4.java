package c_response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * content-type----���������͸���������������ͺ����ݱ����ʽ
 */
public class ResponseDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����content-type��Ӧ
		//response.setHeader("content-type", "text/html;charset=utf-8");
		//response.setContentType("text/html;charset=utf-8");
		//�������ʽ�ȼ�
		
		//������������
		response.setContentType("text/xml");	//�����������ʲô���ĸ�ʽ����������
		//response.setContentType("text/html");	//�����������ʲô���ĸ�ʽ����������
		//response.setContentType("image/jpg");	//�����������ʲô���ĸ�ʽ����������
		response.getWriter().write("<html><head><title>this is a title</title></head></html>");
	}

}
