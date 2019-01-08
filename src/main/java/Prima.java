import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prima {
	
	private List<String> estados = new ArrayList<>(Arrays.asList("Soltero/a", "Casado/a", "Divorciado/a", "Union libre"));
	private List<String> sexos = new ArrayList<>(Arrays.asList("M", "F"));
	
	public int getPrima(String edad, String sexo, String estado) {
		int prima = 200;
		
		if (edad.compareTo("17")>=1 && edad.compareTo("81")<=-1 && estados.contains(estado) && sexos.contains(sexo)) {
			if (edad.compareTo("29")<=-1) {
				prima+=200;
				if (sexo.equals("M")) {
					prima+=100;
				}
			} else if (edad.compareTo("60")>=1) {
				prima+=100;
			}
			if (estado.equals("Soltero/a")){
				prima+=100;
			}
			
			return prima;
		} 
		
		return -1;		
				
	}
}
