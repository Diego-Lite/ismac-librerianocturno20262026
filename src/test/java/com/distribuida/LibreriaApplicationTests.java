package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibreriaApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplicationTests.class, args);
		System.out.println("HOLA MUNDO DESDE SPRING BOOT....");
		Cliente cliente = new Cliente(
				1
				,"1701234579"
				,"alan"
				,"Brito"
				,"Quito"
				,"09456464"
				,"abritp@correo.com"
				);

	}
}


