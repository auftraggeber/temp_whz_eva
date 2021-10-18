package whz.pti.eva.praktikum_02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GradeCalculatorNurseyitGuentherLangnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradeCalculatorNurseyitGuentherLangnerApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return (evt) -> System.out.println("Hallo Welt");
    }
}
