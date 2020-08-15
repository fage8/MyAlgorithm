package com.myWrittenTestCode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * (��ȷ����)
 * URL����Ϊ��
 * scheme://host:port/path?query#fragment
 * (1).scheme:ͨ��Э�飬���õ�http��ftp��matito�ȣ��������http��https��û�ṩʱĬ��http.
 * (2).host:����������������ϵͳ��������ip��ַ
 * (3).port:�˿ںţ���������ѡ��ʡ��ʱʹ�÷�����Ĭ�϶˿ڣ���http��Ĭ�϶˿�Ϊ80��httpsΪ443.
 * (4).path:·�������������/�����Ÿ������ַ�����һ��������ʾ�����ϵ�һ��Ŀ¼���ļ���ַ��
 * (5).query:��ѯ����ѡ�����ڸ���̬��ҳ����ʹ��CGI��ISAPI��PHP/JSP/ASP/ASP.NET�ȼ�����������ҳ�����ݲ�����
 * ���ж���������á�&�����Ÿ�����ÿ������������ֵ�á�=�����Ÿ�����
 * (6).fragment:��ϢƬ�Σ��ַ���������ָ��������Դ�е�Ƭ�Ρ�����һ����ҳ���ж�����ʽ��ͣ�������fragmentֱ�Ӷ�λ��ĳһ���ʽ��ͣ�Ҳ��Ϊê�㣩
 * ����������
 * ����URL��׼���ַ���
 * ���������
 * Ҫ�����host��port��path��query����
 * ����
 * localhost/my/test/path
 * ���
 * localhost 80 /my/test/path
 * ����
 * https://10.10.10.10/my/test/path2
 * ���
 * 10.10.10.10 443 /my/test/path2
 * @author Administrator
 *
 */
public class QushikejiTi2 {


	public static String[] splitUrl(String url) {
		// 1.�ж��Ƿ�Ϊ��
		if (url == "") {
			return new String[0];
		}
		String s = new String();
		String[] res = new String[4];
		if (url.substring(0,7).equals("http://")) {
			s = url.substring(7,url.length());
			res[1] = "80";
		}else if (url.substring(0,8).equals("https://")) {
			s = url.substring(8,url.length());
			res[1] = "443";
		}else {//û��ǰ׺ʱ��ֻ��ip����������
			s = url;
			res[1] = "80";
		}

		res[0] = s.split("/",2)[0];//host
		String path = s.split("/",2)[1];
		if (path.contains("?")) {
			res[2] =  "/" + path.split("\\?",2)[0];//path,?��Ҫ\\����ת��
			String query =  path.split("\\?",2)[1];
			if (query.contains("#")) {
				res[3] = query.split("#",2)[0];
			}else {
				res[3] = query;
			}
		}else {
			res[2] = "/" + path;//path
		}

		return res;
	}
	
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String url = scanner.nextLine();//ǰ��������Ϸ�
			for (String s : splitUrl(url)) {
				if (s != null) {
					System.out.print(s + " ");
				}
			}
		}
	}

}
