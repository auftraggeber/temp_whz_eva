package whz.pti.eva.praktikum_02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GradeCalculatorNurseyitGuentherLangnerApplication {

	//private static final Logger log = LoggerFactory.getLogger(GradeCalculatorNurseyitGuentherLangnerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(GradeCalculatorNurseyitGuentherLangnerApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner init() {
		return (evt) -> System.out.println("Hello world!");
	}
	
	

}
