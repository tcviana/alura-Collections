import java.util.HashMap;
import java.util.Map;

public class Exercicio {

	public static void main(String[] args) {
		Map<String,Integer> pessoa = new HashMap<>();
		
		pessoa.put("Godofredo", 123);
		pessoa.put("Jofreneias", 321);
		pessoa.put("Gerisvalda", 234);
		pessoa.put("Astrogilda", 654);
		
		pessoa.keySet().forEach(idade ->{
			System.out.println(pessoa.get(idade));
		});
				
	}
	

}
