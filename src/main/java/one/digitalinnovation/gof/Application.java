package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ProjetoSpring Boot gerado via Spring Initializr.
 * Os seguintes modulos fora selecionads:
 * -Spring Data JPA
 * -Spring Web
 * -H2 Database
 * -OpenFeign
 * 
 * @author thamires-oliveira
 */

@EnableFeignClients
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
