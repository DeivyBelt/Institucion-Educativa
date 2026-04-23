package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
	

	public static void main(String[] args) {
		List<Persona> listaPersonas =new ArrayList();
		
		Estudiante estudiante;
		estudiante =new Estudiante(102030,"Pachita",20,78898);
		
		listaPersonas.add(estudiante);
		
		estudiante =new Estudiante(10859,"Maria",18,8523);
		
		listaPersonas.add(estudiante);

		Docente docente;
		
		docente =new Docente(52035,"Pachito",66,"Ingeniero",40,180000);
		
		listaPersonas.add(docente);
		
		Administrativo administrativo;
		
		administrativo =new Administrativo(25698, "Gloria", 50, "IA", "Decano", 1000000);
		
		listaPersonas.add(administrativo);
		
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
		
		Persona estudiante1 =new Estudiante(1045230,"Juanita",190,8596);
		listaPersonas.add(estudiante1);
		
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}

	}

}
