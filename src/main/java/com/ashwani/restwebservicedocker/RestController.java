package com.ashwani.restwebservicedocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {
 @RequestMapping(method = RequestMethod.GET, path="/welcome")
  String helloWorld()
  {
	 return "<h1><center>Hello World from docker</center</h1><br>This page is coming from docker<br>Created by Ashwani";
  }
}
