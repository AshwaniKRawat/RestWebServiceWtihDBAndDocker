package com.ashwani.restwebservicedocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {
 @RequestMapping(method = RequestMethod.GET, path="/welcome")
  String helloWorld()
  {
	 //return "<h1><center>Hello World from docker</center</h1><br>This page is coming from docker<br>Created by Ashwani";
	 return "<html>\r\n"
	 		+ "<head>\r\n"
	 		+ "<meta charset=\"ISO-8859-1\">\r\n"
	 		+ "<title>Spring web application</title>\r\n"
	 		+ "</head>\r\n"
	 		+ "<body>\r\n"
	 		+ "	<table border=1 style=\"height: 100%; width: 100%; background-color: black; color: white;\">\r\n"
	 		+ "		<tr style=\"height: 10%\">\r\n"
	 		+ "			<td></td>\r\n"
	 		+ "			<td><center>\r\n"
	 		+ "					<h1>Hello Docker</h1>\r\n"
	 		+ "					<br><p><h3>Hello Maven + Spring MVC + Jenkins + Docker Example</h3></p><br>\r\n"
	 		+ "				</center></td>\r\n"
	 		+ "			<td></td>\r\n"
	 		+ "		</tr>\r\n"
	 		+ "		<tr  style=\"height: 80%\">\r\n"
	 		+ "			<td></td>\r\n"
	 		+ "			<td><center>\r\n"
	 		+ "					<h2>Hello this page is coming from spring web application developed by  Ashwani Rawat.</h2> \r\n"
	 		+ "				</center></td>\r\n"
	 		+ "			<td></td>\r\n"
	 		+ "		</tr>\r\n"
	 		+ "		<tr  style=\"height: 10%\">\r\n"
	 		+ "			<td></td>\r\n"
	 		+ "			<td><center>\r\n"
	 		+ "					@Ashwani 4 April 2023\r\n"
	 		+ "				</center></td>\r\n"
	 		+ "			<td></td>\r\n"
	 		+ "		</tr>\r\n"
	 		+ "	</table>\r\n"
	 		+ "</body>\r\n"
	 		+ "</html>";
  }
}
