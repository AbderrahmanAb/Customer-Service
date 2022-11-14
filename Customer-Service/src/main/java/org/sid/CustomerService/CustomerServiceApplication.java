package org.sid.CustomerService;

import org.sid.CustomerService.entities.Customer;
import org.sid.CustomerService.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"ahmad","ahmad@gmail.com"));
			customerRepository.save(new Customer(null,"nada","nada@gmail.com"));
			customerRepository.save(new Customer(null,"simo","simo@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});



		};
	}

}
