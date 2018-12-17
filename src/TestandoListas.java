import java.util.*;

public class TestandoListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variáveis
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificacao Java SE 8 Programmer I";
		
		// array list
		ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		// ordena
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		// remover
		//cursos.remove(0);
		//System.out.println(cursos);
		
		// retornar apenas o primeiro array		
		//System.out.println(cursos.get(0));
		
		// imprimir arrays
		//for (int i=0;i<cursos.size();i++) {
			//System.out.println("Aula: " + cursos.get(i));
			//
		//}
		
		
		

	}

}
