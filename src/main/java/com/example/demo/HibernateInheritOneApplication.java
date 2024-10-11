package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Session;


@SpringBootApplication
public class HibernateInheritOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritOneApplication.class, args);
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSoruces(ssr).getMetadataBuilder().build();
		
		SessionFactory factory= meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		
		
	}

}
