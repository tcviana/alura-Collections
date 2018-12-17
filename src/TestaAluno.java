//import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        
        Aluno a1 = new Aluno("João",123);
        Aluno a2 = new Aluno("Teobaldo",321);
        Aluno a3 = new Aluno("Godofredo", 432);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.println("Está matriculado o "+a1+"?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		//
		System.out.println("Está matriculado o João?");
		System.out.println(javaColecoes.estaMatriculado(new Aluno("João",123)));	
		// teste nome nulo
		javaColecoes.matricula(new Aluno("Sebastião",45534));
		
	
    }
}
