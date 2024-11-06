package no.hvl.dat100.oppgave4;
import java.util.Scanner.*;

import java.io.*;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean status = false;
		PrintWriter skriver = null;
		try{
			File fil = new File (filnavn);
			skriver = new PrintWriter(fil);
			skriver.println(samling.toString());
			status = true;
		}
		catch (FileNotFoundException e){
			System.out.println("Fil ikke funnet");
		}
		finally {
			skriver.close();
			status = true;
			return status;
		}
	}

}

