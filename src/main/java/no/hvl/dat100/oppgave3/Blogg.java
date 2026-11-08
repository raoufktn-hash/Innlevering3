package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;

    public Blogg() {

        innleggtabell = new Innlegg[20];
        nesteledig = 0;
    }

    public Blogg(int lengde) {

        innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
    }

    public int getAntall() {
        return nesteledig;
    }

    public Innlegg[] getSamling() {
        return innleggtabell;

    }

    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

    public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
    }

    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;

    }

    public boolean leggTil(Innlegg innlegg) {

        if (!finnes(innlegg) && ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String tekst = nesteledig + "\n";
        for (int i = 0; i < nesteledig; i++) {
            tekst += innleggtabell[i].toString();
        }
        return tekst;
    }

    public void utvid() {

        Innlegg[] ny = new Innlegg[innleggtabell.length * 2];

        for (int i = 0; i < nesteledig; i++) {
            ny[i] = innleggtabell[i];
        }

        innleggtabell = ny;
    }

    public boolean slett(Innlegg innlegg) {

        int indeks = finnInnlegg(innlegg);

        if (indeks == -1) {
            return false;
        }

        for (int i = indeks; i < nesteledig - 1; i++) {
            innleggtabell[i] = innleggtabell[i + 1];
        }

        innleggtabell[nesteledig - 1] = null;
        nesteledig--;
        return true;
    }
}