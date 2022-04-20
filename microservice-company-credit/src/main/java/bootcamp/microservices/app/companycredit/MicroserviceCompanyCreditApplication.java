package bootcamp.microservices.app.companycredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroserviceCompanyCreditApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCompanyCreditApplication.class, args);
	}

}
