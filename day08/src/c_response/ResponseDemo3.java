package c_response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * refresh----��ʱˢ�»�ÿ��n����תҳ��
 */
public class ResponseDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");	//���������͸���������������ͺ����ݱ����ʽ
		//����refresh��Ӧͷ
		response.setHeader("refresh", "2");
		//����refresh
		response.getWriter().write("ע��ɹ���3����Զ�����ҳ�档");
		response.setHeader("refresh", "3;/day08/adv.html");
	}

}
