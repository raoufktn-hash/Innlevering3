package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

import javax.imageio.metadata.IIOMetadata;
//a)
public abstract class Innlegg {

    private int id;
    private String bruker;
    private String dato;
    private int likes;


	//b)
	public Innlegg(int id, String bruker, String dato) {
        this .id=id;
        this.bruker=bruker;
        this.dato=dato;
        this.likes=0;


	}

	public Innlegg(int id, String bruker, String dato, int likes) {
        this .id=id;
        this.bruker=bruker;
        this.dato=dato;
        this.likes=likes;

	}
	//c)
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker=bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato=dato;
	}

	public int getId() {
		return id;

	}

    public void setId(int id) {
        this.id = id;
    }

    public int getLikes() {
		return likes;

	}
	
	public void doLike () {
        likes ++;

	}
	
	public boolean erLik(Innlegg innlegg) {
		return this.id==innlegg.id;

	}
	
	@Override
	public String toString() {
        return id + "\n" + bruker + "\n" +dato +"\n" + likes +"\n";

	}
	

}
