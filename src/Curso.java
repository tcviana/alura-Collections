import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int tempoTotal() {
		//int tempo=0;
		//for (Aula aula : aulas) {
		//	tempo += aula.getTempo();
		//}
		return aulas.stream().mapToInt(Aula::getTempo).sum();		
	}
	
	@Override
	public String toString() {
		return ("[Curso: "+this.nome+", Tempo total: "+tempoTotal()+
				", Aulas: ["+aulas+"] ]");
	}
	
	public void matricula(Aluno nome) {
		this.alunos.add(nome);
		this.matriculaParaAluno.put(nome.getNumeroMatricula(), nome);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int num) {
		if (!this.matriculaParaAluno.containsKey(num)) 
			throw new NoSuchElementException("Não existe aluno com esta matrícula.");
		return this.matriculaParaAluno.get(num);
	}

}
