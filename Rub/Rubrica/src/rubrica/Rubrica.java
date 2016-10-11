package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	private Map<String,Voce> voci = new TreeMap<String,Voce>();
	
	
	public Voce aggiungiVoce(String nome, String cognome, String telefono) throws VoceGiaEsiste{
		
		if(voci.containsKey(nome+" "+cognome)){
			throw new VoceGiaEsiste ("La voce esiste");
			
			//voci.put(nome+" "+cognome, v);
		}
		Voce v = new Voce(nome, cognome, telefono);
		
		return null;
	}

}
