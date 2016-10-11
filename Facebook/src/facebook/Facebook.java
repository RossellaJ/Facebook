package facebook;

import java.util.ArrayList;
import java.util.List;

public class Facebook {
	
	//attributi
	
	private List<Utente> utenti =new ArrayList<Utente>();
	
	
    //getter setter
	
	public List<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}	
	
     //metodi
	
	//metodo registraUtente
	
	public void registraUtente(String nome, String cognome, int eta, char sesso, String email) {

		if (email.contains("@")) {
			
			for(Utente utemp : utenti){
				
				if(utemp.getNome().equals(nome) && utemp.getCognome().equals(cognome) && utemp.getEta() == eta){
					return;
				}
			}
			Utente u = new Utente(nome,cognome,eta,sesso,email);
			utenti.add(u);
			
		}
	}
	
	//metodo aggiungi l'utente agli amici:il metodo usa dei parametri nomecognome e ricerca l'utente nella lista utente di facebook
    // e assegna l'utente u1 in una cella della lista di amici di u2 e viceversa
	
	public void aggiungiAmici(String nomecognome1, String nomecognome2) {

		Utente u1 = null;
		Utente u2 = null;

		for (Utente u : utenti) {
			String strtemp = u.getNome() + " " + u.getCognome();
			if (nomecognome1.equals(strtemp)) {
				u1 = u;
			}
		}

		for (Utente u : utenti) {
			String strtemp = u.getNome() + " " + u.getCognome();
			if (nomecognome2.equals(strtemp)) {
				u2 = u;
			}
		}
		if (u1 != null && u2 != null) {

			u1.assegnaAmici(u2);
			u2.assegnaAmici(u1);
		}
	}
	   
	    /*metodo che verifica se u è contenuto nella lista utenti e restituisce la lista amici di quell'utente
	    
	     public List<Utente> getAmiciDiUtente(String nome, String cognome, int età, char sesso, String email){
			
	    	 Utente u = new Utente (nome,cognome,età,sesso,email); 
			
			if(utenti.contains(u)==true){
				return u.getAmici();
			}
			else return null;
						
		}
	*/
	    
	    // restituisce lista amici dell'utente e li stampa 
	    
	public List<Utente> getAmiciDiUtente(String nome, String cognome) {

		Utente utemp = null;

		for (Utente u : utenti) {
			if (u.getNome().equals(nome) && u.getCognome().equals(cognome)) {
				utemp = u;
			}
		}

		if(utemp==null){
			return null;
		}
		
		List<Utente> listastampaamici = utemp.getAmici();

		for (Utente u : listastampaamici) {

			System.out.println(u.getNome() + " " + u.getCognome());
		}
		return utemp.getAmici();
	}

	
	public String getAmiciDiAmici(String nome, String cognome){
	
		
		//ciclo la lista di utenti per verificare se il nome e cognome appartengono ad un utente registrato
		String strtemp="";
		List<Utente> amiciDiAmici = new ArrayList<Utente>();
		Utente u=null;
		for(Utente ut:utenti){
			if((ut.getNome().equals(nome)==true) && (ut.getCognome().equals(cognome)==true)){
				u=ut;
			}
		}
		
		if(u==null){
			return null;
		}
		
		//ciclo sui miei amici
		for(Utente amicoDiU : u.getAmici()){
				
		//per ogni amico del mio amico controllo che non sia contenuto già neimiei amici.
		//in quel caso aggiungo alla lista di amici di amici. Tolgo inoltre i duplicati
			
			for(Utente amicoDiAmico : amicoDiU.getAmici()){
				
				if(!amiciDiAmici.contains(amicoDiAmico)){
					amiciDiAmici.add(amicoDiAmico);
				}
					
			}
		}
			
	
		//rimuovo mestesso dalla lista di amici di amici
		amiciDiAmici.remove(u);
		
		for(Utente utente:amiciDiAmici){
			strtemp+=utente.getNome()+" "+utente.getCognome()+"\n";
		}
		
		return strtemp;
	}

	
	public String amiciInComune(String nomeCognome1, String nomeCognome2){
		
		Utente u1=null;
		Utente u2=null;
		
		for(Utente u:utenti){
			String strtemp= u.getNome()+" "+u.getCognome();
			if(nomeCognome1.equals(strtemp)==true){
				u1=u;
			}
		}
		for(Utente u:utenti){
			String strtemp= u.getNome()+" "+u.getCognome();
			if(nomeCognome2.equals(strtemp)==true){
				u2=u;
			}
		}
		String amiciInComune="";
		for(Utente amico1: u1.getAmici()){
			for(Utente amico2: u2.getAmici()){
				if(amico1.equals(amico2)){
					amiciInComune+=amico2+"\n";
				}
			}
		}
		
		return amiciInComune;
		
	}

}
