/**
 * refere ����
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
		//����������Դ�ļ�
		//referer��ʾ��ǰ������������
		String referer = request.getHeader("referer");
		System.out.println(referer);
		if(referer == null || !referer.contains("/adv.html")){
			response.getWriter().write("�㵱ǰ�ǷǷ�������ת����ҳ��<a href='/day08/adv.html'>��ҳ</a>");
		}else{
			response.getWriter().write("��Դ��������");
		}
		
		
		
		
		
	}


}
