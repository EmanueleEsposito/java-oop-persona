package jana60.persona;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome ");
		String nomeUtente = scan.nextLine();
		System.out.println("Inserisci il tuo cognome ");
		String cognomeUtente = scan.nextLine();
		System.out.println("Inserisci il tuo indirizzo ");
		String indirizzoUtente = scan.nextLine();
		Persona nuovaPersona = new Persona(nomeUtente, cognomeUtente, indirizzoUtente);

		scan.close();
	}

}
