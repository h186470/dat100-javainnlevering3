package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		this.innleggstabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return this.nesteledig;
	}

	public Innlegg[] getSamling() {
		return this.innleggstabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = -1;
		int indeks = 0;
		while (!funnet && indeks<this.nesteledig) {
			if (innleggstabell[indeks].getId()==innlegg.getId()) {
				funnet = true;
				pos = indeks;
			} else {
				indeks++;
			}
		}
		return pos;
	}

	public boolean finnes(Innlegg innlegg) {

		int indeks = 0;
		while (indeks<this.nesteledig) {
			if (innleggstabell[indeks].getId()==innlegg.getId()) {
				return true;
			} else {
				indeks++;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		if(this.nesteledig<this.innleggstabell.length) {
			return true;
		}
		return false;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean innlagt = false;
		boolean ny =finnInnlegg(innlegg) == -1;
		if (ny && this.ledigPlass()) {
			innleggstabell[nesteledig]=innlegg;
			nesteledig++;
			innlagt = true;
		}

		return innlagt;
	}

	public String toString() {
		String utskrift = this.getAntall()+"\n";
		for (int i = 0; i<nesteledig; i++) {
			utskrift += innleggstabell[i].toString() + "\n";
		}
		return utskrift;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}