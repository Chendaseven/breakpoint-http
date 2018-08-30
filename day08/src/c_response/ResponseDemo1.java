package c_response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ʹ��HttpServletResponse�޸���Ӧ����
 */
public class ResponseDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //1��tomcat�������ṩ��һ��HttpServletResponse�������ڸ��������޸���Ӧ����
	//2��ͨ��service������response�����뵽servlet�� 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3.1 ��Ӧ�У�����״̬��
//		response.setStatus(404);
//		response.sendError(404);
//		//3.2��Ӧͷ
//		response.setHeader("server","weblogic");	//���ķ���������
		
		//3.3 ʵ�����ݣ�����������岿�ֿ��Կ���
		//response.getWriter().write("this is contents");			//���ַ�����ʽ����
		response.getOutputStream().write("this is contents".getBytes());	//���ֽ������ͣ�write����ֻ�ܵ���һ��
	}

}
