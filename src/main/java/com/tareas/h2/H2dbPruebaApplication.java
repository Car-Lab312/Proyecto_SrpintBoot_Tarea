package com.tareas.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class H2dbPruebaApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(H2dbPruebaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		template.execute("DROP TABLE TAREAS IS EXISTS");
		template.execute("CREATE TABLE TAREAS (ID INT AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(45),DESCRIPCION VARCHAR(50))");
		
		for (int i = 0; i < 3; i++) {
			template.update("insert into tareas(nombre, descripcion)values('Nombre tarea 00"+i+"', 'Tarea 00"+i+"')");
		}
	
	}

}
