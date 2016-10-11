package test;

import java.util.ArrayList;
import java.util.List;

import rubrica.Rubrica;
import rubrica.Voce;


public class Test {

	public static void main(String[] args) {
    
		//CREO TRE OGGETTI DI TIPO VOCE E INIZIALIZZO GRAZIE AL METODO COSTRUTTORE
		
		Voce v1 = new Voce("mmm","sss","023");
		Voce v2 = new Voce("fff","hhh","998");
		Voce v3 = new Voce("lll","uuu","755");
		
		//CREO UN OGGETTO DI TIPO RUBBRICA 
		
		Rubrica r = new Rubrica ();
		
		//RICHIAMO IL METODO COSTRUTTORE PER INSERIRE UNA VOCE ALLA VOLTA ALL'OGGETTO RUBRICA
		
		r.inserisciOggetti(v1);
		r.inserisciOggetti(v2);
		r.inserisciOggetti(v3);

		/*STAMPARE LE VOCI DELLA LISTA. NON POSSO ACCEDERE A UNA LISTA CHE è DENTRO LA RUBRICA
		DEVO PRIMA CREARE UN RIFERIMENTO IN CUI RICHIAMO LA LISTA CON CON METODO GET.
		*/
		
	    List <Voce> oggettoLista = new ArrayList<Voce>();
	    	    
	    oggettoLista=r.getListaVoci ();
	    
		for( Voce v : oggettoLista){
			
			System.out.println(v.getNome()+" "+v.getCognome()+" "+v.getTelefono());	
		}
		
		
		
		
		
		
		
		
	}

}
