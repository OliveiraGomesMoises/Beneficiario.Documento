package br.com.beneficiario.documento.beneficiario.documento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Application {
	@GetMapping
	public String getHometeste(){
		return "beneficiario documento -API HOME";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
