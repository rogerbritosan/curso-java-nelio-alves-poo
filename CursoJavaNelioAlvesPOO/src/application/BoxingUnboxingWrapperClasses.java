package application;

import entities.Aluno;

public class BoxingUnboxingWrapperClasses {
	
	public static void main(String[] args) {
		
//		Wrapper classes
//		- São classes equivalentes aos tipos primitivos
//		- boxing e unboxing é natural na linguagem
//		- uso comum: campos de entidades em sistemas de informação (importante), 
//		pois são tipos referência (classes) aceitam valor null (útil para banco de dados)
//		e usufruem dos recursos OO
		
		// exemplo 1
		
		// Boxing
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		// Unboxing
		
		int y = (int) obj;
		System.out.println(y);
		
				
		// exemplo 2
		
		// Boxing
		Integer j = 30;
		
		System.out.println(j);
		
		// Unboxing
		
		int w = j * 2; // não foi necessário realizar o casting
		System.out.println(w);
		
		
		Integer z = null;
		System.out.println(z);
		
	}

}
