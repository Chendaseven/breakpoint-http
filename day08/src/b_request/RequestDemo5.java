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
		 * 获取get提交的参数(URL后面的参数数据)
		 */
		request.setCharacterEncoding("utf-8");
		String params = request.getQueryString();
		System.out.println(params);		
		/**
//		 * 通用的获取参数的方法（get和post通用）
//		 * request.getParameter("name")		获取一个值的参数
//		 * request.getParameterNames()		获取所有参数列表
//		 * request.getParameterValues("hobits")	获取参数的所有值
//		 * request.getParameterMap()		获取参数对象的map键值对
//		 */
//		//方法一：根据参数名称获取参数值（参数名称就是表单的name属性）
//		String name = request.getParameter("name");
//		System.out.println(name);
//		System.out.println("===================");
//		//方法二：遍历所有的参数,迭代器方式
//		Enumeration<String> enums = request.getParameterNames();//获取所有参数名称列表
//		while(enums.hasMoreElements()){
//			String paraName = enums.nextElement();
//			String paraValue = request.getParameter(paraName);
//		}
//		System.out.println("===================");
//		//方法三：
//		Map<String,String[]> map = request.getParameterMap();		//获取参数对象列名（Map集合）
//		/**
//		 *每个Map对象就是一个参数（包含参数名称和参数值） 
//		 *key：参数名称	，只能获取键集合，map.keyset();通过get(key)方法获取键的值
//		 *value：参数值；只能获取值集合，不能得到键；map.values();
//		 *Map的遍历：
//		 *entryset():获取键值对集合;map.entryset();getkey()获取键；getvalue()获取值
//		 *keyset()：参数名称	，只能获取键集合，map.keyset();通过get(key)方法获取键的值
//		 *values()：参数值；只能获取值集合，不能得到键；map.values();
//		 */
//		
//		/**
//		 * 根据参数名称获取多个参数值
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
		 * 获取post提交的参数（实体内容）
		 */
		request.setCharacterEncoding("utf-8");	//只对post方法提交的参数有效
		ServletInputStream in = request.getInputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=in.read(buf))!=-1){
			String str = new String(buf,0,len);
			System.out.println(str);
		}
	}
	

	
	

}
