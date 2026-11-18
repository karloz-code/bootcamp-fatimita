package com.example.demo.fatimita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@SpringBootApplication
public class Application {

//	void main() {
//		IO.println("Hello, Modern Java!");
//		String cadena = "cadena";
//
//		IO.println("cadena: " + cadena);
//	}

	public static void main(String[] args) {
		String cadena = "cadena";

//		System.out.println("cadena: " + cadena);

		// TODO primitivos
		int calificacion = 10;
//		System.out.println("calificacion: " + calificacion);
		float precio = 0.9999f;
		double peso = 0.89999d;
		long altura = 90L;
		boolean flag = true;
		char caracter = 'c';

		//Objetos
		Integer calficacionInteger = 10;
		Float calficacionFloat =  10.0f;
		Double calficacionDouble = 9.99;
		Long calficacionLong = 10L;
		Boolean calficacionBoolean = true;
		Character calficacionCharacter = 'F';
		Instant instant = Instant.now();
		Date fecha = Date.from(instant);
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDate localDate = LocalDate.now();

		var hola = "hola";
		var hola2= 2;
		var hola3= 3.0;
		var hola4 = false;

		// conditionals, condicionales
		int edadFatimita = 1;
		// == -> equals (igual)
		// > -> mayor que
		// >= -> mayor o igual que
		// < -> menor que
		// <= -> menor o igual que
		// != -> no equals (no igual) (diferente)
		// && and (conjuncion) los dos terminos deben ser positivos para que la operacion sea positiva
		// || or (disyuncion) almenos uno de los terminos deber ser positivo para que la operacion sea positiva
		// ! not, (negacion) invierte la operacion
//		if(edadFatimita > 18){
//			System.out.println("Fatimita tiene mas de 18 años");
//		} else if (edadFatimita == 18){
//			System.out.println("Fatimita tiene 18 años");
//		} else {
//			System.out.println("Fatimita NO tiene mas de 18 años");
//		}

//		if(edadFatimita > 18 && edadFatimita < 25 ){
//			System.out.println("Te graduas");
//		} else {
//			System.out.println("No te graduas");
//		}

//		if(edadFatimita == 18 || edadFatimita == 19 ){
//			System.out.println("Le dan crednecial");
//		} else {
//			System.out.println("No Le dan crednecial");
//		}

//		if(edadFatimita != 1)
		if(!(edadFatimita == 1)){
			System.out.println("Ya no eres bebé");
		} else {
			System.out.println("Eres bebé");
		}

		//Ciclos, repeticiones
		//for

//		SpringApplication.run(Application.class, args);


	}

}
