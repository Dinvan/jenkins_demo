package com.cg.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/jenkins")
public class JenkinsRest {

	@GetMapping(path = "/hello_jenkins")
	public String hellowJenkins() {
		return "Hello Jenkins, thank you for CI";
	}
}
