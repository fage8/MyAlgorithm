package com.myWrittenTestCode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * (正确做法)
 * URL构成为：
 * scheme://host:port/path?query#fragment
 * (1).scheme:通信协议，常用的http，ftp，matito等，这里仅限http和https，没提供时默认http.
 * (2).host:主机，服务器域名系统主机名或ip地址
 * (3).port:端口号，整数，可选，省略时使用方案的默认端口，如http的默认端口为80，https为443.
 * (4).path:路径，由零或多个“/”符号隔开的字符串，一般用来表示主机上的一个目录或文件地址。
 * (5).query:查询，可选，用于给动态网页（如使用CGI、ISAPI、PHP/JSP/ASP/ASP.NET等技术制作的网页）传递参数，
 * 可有多个参数，用“&”符号隔开，每个参数的名和值用“=”符号隔开。
 * (6).fragment:信息片段，字符串，用于指定网络资源中的片段。例如一个网页中有多个名词解释，可以用fragment直接定位到某一名词解释（也称为锚点）
 * 输入描述：
 * 符合URL标准的字符串
 * 输出描述：
 * 要求输出host，port，path，query部分
 * 输入
 * localhost/my/test/path
 * 输出
 * localhost 80 /my/test/path
 * 输入
 * https://10.10.10.10/my/test/path2
 * 输出
 * 10.10.10.10 443 /my/test/path2
 * @author Administrator
 *
 */
public class QushikejiTi2 {


	public static String[] splitUrl(String url) {
		// 1.判断是否为空
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
		}else {//没有前缀时，只有ip或者主机名
			s = url;
			res[1] = "80";
		}

		res[0] = s.split("/",2)[0];//host
		String path = s.split("/",2)[1];
		if (path.contains("?")) {
			res[2] =  "/" + path.split("\\?",2)[0];//path,?需要\\进行转义
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
			String url = scanner.nextLine();//前提是输入合法
			for (String s : splitUrl(url)) {
				if (s != null) {
					System.out.print(s + " ");
				}
			}
		}
	}

}
