package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImPrimirObjetos { 
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando o foreach...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Interato....");
		Iterator<String> interator = aprovados.iterator();
		while(interator.hasNext()) {
			System.out.println(interator.next());
		}
		
		System.out.println("\nUsando Stream....");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}
	

}
