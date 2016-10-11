package rubrica;
import java.util.ArrayList;
import java.util.List;


public class Rubrica {
	
	 //ATTRIBUTI: NOME E LISTA DI CELLE TIPO VOCE
	private String nomeRubrica;
	private List<Voce> listaVoci = new ArrayList <Voce> ();
	
    //METODI GETTER E SETTER
	public String getNomeRubrica() {
		return nomeRubrica;
	}

	public void setNomeRubrica(String nomeRubrica) {
		this.nomeRubrica = nomeRubrica;
	}

	public List<Voce> getListaVoci() {
		return listaVoci;
	}

	public void setListaVoci(List<Voce> listaVoci) {
		this.listaVoci = listaVoci;
	}
	
	//METODO COSTRUTTORE PER INSERIRE OGGETTO DENTRO ARRAY LISTA
	
	public void inserisciOggetti(Voce v) {
		
		listaVoci.add(v);
		}

    //METODO COSTRUTORE PER STAMPARE 
	public String toString() {
		return "Rubrica [nomeRubrica=" + nomeRubrica + ", listaVoci="
				+ listaVoci + "]";
	}
	
		
	
	
	}
