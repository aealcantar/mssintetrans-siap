package mx.gob.imss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "mx.gob.imss")
public class ConsultaMatricula {

    public static void main(String[] args) {
        SpringApplication.run(ConsultaMatricula.class, args);
    }

}
