package br.com.projectservices;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ProjectServicesMysqlApplication {
	
	@RequestMapping("/teste")
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
