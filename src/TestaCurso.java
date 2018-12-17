import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestaCurso {
   public static void main(String[] args) {
     Curso javaColecoes = new Curso("Dominando as coleções do Java","Tiago Viana");
     List<Aula> aulasImutaveis = javaColecoes.getAulas();
     
     javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
     javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
     javaColecoes.adiciona(new Aula("Modelando com coleções", 22));     
     System.out.println(aulasImutaveis);
     
     // imprimir em ordenação
     List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
     Collections.sort(aulas);
     System.out.println(aulas);     
     
     // imprimir tempo da aula
     System.out.println(javaColecoes);
     
     Collections.singletonList(aulas);     
     System.out.println(aulas);     
   }
}
