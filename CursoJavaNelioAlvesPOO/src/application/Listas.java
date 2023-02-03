package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		// Integer -> wrapper class do int
		// Double -> wrapper class do double
		// <> -> generics
		// List<String> list = new ArrayList<String>();

		List<String> list = new ArrayList<>();

		list.add("BMW X6");
		list.add("Alfa Romeo");
		list.add("Fusca");
		list.add("Ferrari");
		list.add("500");

		// se eu quiser adicionar um elemento a partir de um posição
		list.add(2, "Palio");

		System.out.println("Tamanho da lista: " + list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------------------------------");

		// remover elemento
		list.remove("500");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------------------------------");

		for (String x : list) {
			System.out.println(x);
		}

		// remover outro elemento
		list.remove(1); // Alfa Romeo

		System.out.println("----------------------------------------------");

		for (String x : list) {
			System.out.println(x);
		}

		// remoção com predicados
		// no caso x (String) tal que todo elemento comece com F (função lambda -> essa
		// se chama predicado)
		// irá retornar em verdadeiro ou falso
		// pega um elemento x e me devolve verdadeiro ou falso, de acordo com a
		// expressão, nesse caso, o que começar com F

		System.out.println("----------------------------------------------");

		list.removeIf(x -> x.charAt(0) == 'F');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------------------------------");

		// procurar a posição de um elemento existente
		System.out.println("Index of Ferrari: " + list.indexOf("Palio"));

		// procurar a posição de um elemento inexistente
		System.out.println("Index of Porsche: " + list.indexOf("Porsche"));

		System.out.println("----------------------------------------------");

		// esse exemplo filtra elementos que começam com determinado elemento
		// preciso criar uma nova lista
		// no final é necessário converter pra collect, pois stream não é compatível com
		// list (antigo)
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());

		for (String r : result) {
			System.out.println(r);
		}

		System.out.println("----------------------------------------------");

		// se não encontrar retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(name);

		name = list.stream().filter(x -> x.charAt(0) == 'W').findFirst().orElse(null);
		System.out.println(name);

	}

}
