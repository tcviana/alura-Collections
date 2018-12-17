import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		// criação dos objetos
		Aula a1 = new Aula("Revistando as ArrayLists",21);
		Aula a2 = new Aula("Lista de Objetos",20);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		// criação da lista
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		// impressão
		System.out.println(aulas);
		
		// ordenação por título
		Collections.sort(aulas);
		System.out.println(aulas);
		
		// orndenação por tempo
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
