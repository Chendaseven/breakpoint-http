package b_request;
/**
 * ʹ��user-agent����ͷ,�ܹ�ʶ�������������
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
		
		String userAgent = request.getHeader("user-agent");		//ʹ��getHeader()�����������ͷ�ؼ��֣����Եõ����������
		System.out.println(userAgent);
		if(userAgent.contains("Firefox")){
			response.getWriter().write("������ʹ�û�������");
		}else if(userAgent.contains("Chrome")){
			response.getWriter().write("������ʹ�ùȸ������");
		}else if(userAgent.contains("Trident")){
			response.getWriter().write("������ʹ��IE�����");
		}else{
			response.getWriter().write("����ʶ��������");
		}
		
		
	}

}
