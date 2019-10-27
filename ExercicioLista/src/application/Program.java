package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Daniel");
		lista.add("Jose");
		lista.add(2, "Caroline");
		lista.add("Carlos");
		System.out.println(lista.size());
		for (String x : lista) {
			System.out.println(x);
		}

		System.out.println("----------------");
		lista.removeIf(x -> x.charAt(0) == 'D');
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("----------------");
		System.out.println("Posicao: " + lista.indexOf("Caroline"));
		System.out.println("----------------");
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		for (String x : resultado) {
			System.out.println(x);
		}		
	}

}