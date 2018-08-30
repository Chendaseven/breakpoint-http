package b_request;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo5
 */
public class RequestDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * ��ȡget�ύ�Ĳ���(URL����Ĳ�������)
		 */
		request.setCharacterEncoding("utf-8");
		String params = request.getQueryString();
		System.out.println(params);		
		/**
//		 * ͨ�õĻ�ȡ�����ķ�����get��postͨ�ã�
//		 * request.getParameter("name")		��ȡһ��ֵ�Ĳ���
//		 * request.getParameterNames()		��ȡ���в����б�
//		 * request.getParameterValues("hobits")	��ȡ����������ֵ
//		 * request.getParameterMap()		��ȡ���������map��ֵ��
//		 */
//		//����һ�����ݲ������ƻ�ȡ����ֵ���������ƾ��Ǳ���name���ԣ�
//		String name = request.getParameter("name");
//		System.out.println(name);
//		System.out.println("===================");
//		//���������������еĲ���,��������ʽ
//		Enumeration<String> enums = request.getParameterNames();//��ȡ���в��������б�
//		while(enums.hasMoreElements()){
//			String paraName = enums.nextElement();
//			String paraValue = request.getParameter(paraName);
//		}
//		System.out.println("===================");
//		//��������
//		Map<String,String[]> map = request.getParameterMap();		//��ȡ��������������Map���ϣ�
//		/**
//		 *ÿ��Map�������һ�������������������ƺͲ���ֵ�� 
//		 *key����������	��ֻ�ܻ�ȡ�����ϣ�map.keyset();ͨ��get(key)������ȡ����ֵ
//		 *value������ֵ��ֻ�ܻ�ȡֵ���ϣ����ܵõ�����map.values();
//		 *Map�ı�����
//		 *entryset():��ȡ��ֵ�Լ���;map.entryset();getkey()��ȡ����getvalue()��ȡֵ
//		 *keyset()����������	��ֻ�ܻ�ȡ�����ϣ�map.keyset();ͨ��get(key)������ȡ����ֵ
//		 *values()������ֵ��ֻ�ܻ�ȡֵ���ϣ����ܵõ�����map.values();
//		 */
//		
//		/**
//		 * ���ݲ������ƻ�ȡ�������ֵ
//		 */
//		
//	
		String[] hobits = request.getParameterValues("hobit");
		for (String string : hobits) {
			System.out.println(string);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * ��ȡpost�ύ�Ĳ�����ʵ�����ݣ�
		 */
		request.setCharacterEncoding("utf-8");	//ֻ��post�����ύ�Ĳ�����Ч
		ServletInputStream in = request.getInputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=in.read(buf))!=-1){
			String str = new String(buf,0,len);
			System.out.println(str);
		}
	}
	

	
	

}
