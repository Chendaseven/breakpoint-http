package c_response;
/**
 * location+302 �����ض���,��ת������ҳ��
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
		//����302״̬��
		response.setStatus(302);
		//����location��Ӧͷ
		response.setHeader("location", "/day08/adv.html");	//	"/day08/adv.html" �����뵽�������ַ���ĵ�ַ�������ļ��е�ַ
		//����Ϊ��Ӧͷ�򻯰汾
		response.sendRedirect("/day08/adv.html");
		
		
	}

}
