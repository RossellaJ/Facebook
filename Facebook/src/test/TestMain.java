package test;


import java.util.List;

import facebook.Facebook;
import facebook.Utente;



public class TestMain {

	public static void main(String[] args) {
		
//creo oggetto facebook
		
		Facebook f = new Facebook();
		
//creo oggetti utente e con metodo costruttore inizializzo subito
		
		Utente u1 = new Utente ("aaaa","AAAA",28,'M',"aaaa@alfa.com");
		Utente u2 = new Utente ("bbbb","BBBB",28,'M',"bbbb@alfa.com");
		Utente u3 = new Utente ("cccc","CCCC",18,'F',"cccc@alfa.com");
		
//richiamo il metodo per registrare utente
		
		
		f.registraUtente(u1.getNome(),u1.getCognome(),u1.getEta(),u1.getSesso(),u1.getEmail());
		f.registraUtente(u2.getNome(),u2.getCognome(),u2.getEta(),u2.getSesso(),u2.getEmail());
		f.registraUtente(u3.getNome(),u3.getCognome(),u3.getEta(),u3.getSesso(),u3.getEmail());
	
		
		 List <Utente> oggettoLista =f.getUtenti();
		    
			for( Utente u : oggettoLista){
				
				System.out.println(u.getNome()+" "+u.getCognome()+" "+u.getEta()+" "+u.getSesso()+" "+u.getEmail());	
			}
			

			
		f.aggiungiAmici("aaaa AAAA","bbbb BBBB");
		f.aggiungiAmici("aaaa AAAA","cccc CCCC");
		f.aggiungiAmici("cccc CCCC","bbbb BBBB");
		
		List<Utente> amiciDiUtente = f.getAmiciDiUtente("aaaa","AAAA");
		if(amiciDiUtente!=null){
			int numamici = amiciDiUtente.size();
			System.out.println(numamici);
		}
		
		amiciDiUtente = f.getAmiciDiUtente("bbbb","BBBB");
		if(amiciDiUtente!=null){
			int numamici = amiciDiUtente.size();
			System.out.println(numamici);
		}

		String amiciDiAmici = f.getAmiciDiAmici("ASDF", "BBBASDB");
		if(amiciDiAmici!=null){
			System.out.println(amiciDiAmici);
		}else{
			System.out.println("Lista vuota!");
		}
		amiciDiAmici = f.getAmiciDiAmici("bbbb", "BBBB");
		if(amiciDiAmici!=null){
			System.out.println(amiciDiAmici);
		}else{
			System.out.println("Lista vuota!");
		}
	}
 

}