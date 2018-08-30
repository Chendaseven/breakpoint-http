package c_response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * content-Disposition   �����صķ�ʽ����Դ
 */
public class ResponseDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��������������صķ�ʽ��
		response.setHeader("content-disposition", "attachment;filename=G:/Javaweb/CSS/mm.jpg");
		
		
		//1����ȡ�����ļ�
		FileInputStream in = new FileInputStream("G:/Javaweb/CSS/mm.jpg");
		
		//2)д���������
		OutputStream out = response.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		//�߶���д
		while((len=in.read(buf))!=-1){
			out.write(buf, 0, len);
		}
		out.close();
		in.close();
	}


}
