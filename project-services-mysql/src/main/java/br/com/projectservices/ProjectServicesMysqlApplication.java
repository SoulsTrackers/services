package br.com.projectservices;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
public class ProjectServicesMysqlApplication {
	
	@RequestMapping("/testeApp")
	@ResponseBody
	public String index(){
		String a = "";
		if (StringUtils.isNotBlank(a)) {
			return "Olá";
		}
		
		return "falha tecnica";
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjectServicesMysqlApplication.class, args);
	}
}
