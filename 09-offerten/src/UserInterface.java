import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Kundenmanager kMan = new Kundenmanager();
		Offertenmanager oMan = new Offertenmanager(kMan);

		String cmdInput = "";
		Scanner keyScan = new Scanner(System.in);
		while (!cmdInput.equals("exit")) {
			System.out.print("\nCMD>");
			cmdInput = keyScan.nextLine();
			if (cmdInput.equals("addKunde")) {
				System.out.print("Name>");
				String name = keyScan.nextLine();
				System.out.print("Adresse>");
				String adresse = keyScan.nextLine();
				System.out.print("UID>");
				String uid = keyScan.nextLine();
				kMan.addKunde(name, adresse, uid);
			} else if (cmdInput.equals("setMarge")) {
				System.out.print("Kundennummer>");
				int kundenNo = keyScan.nextInt();
				keyScan.nextLine();
				System.out.print("Marge>");
				double marge = keyScan.nextDouble();
				keyScan.nextLine();
				
				// c)
				kMan.getKunde(kundenNo).setMarge(marge);

			} else if (cmdInput.equals("printKunden")) {
				kMan.printAllKunden();
			} else if (cmdInput.equals("addOfferte")) {
				System.out.print("Kundennummer>");
				int kundenNo = keyScan.nextInt();
				keyScan.nextLine();
				System.out.print("Beschreibung>");
				String beschreibung = keyScan.nextLine();
				
				// c)
				oMan.addOfferte(kundenNo, beschreibung);
				
			} else if (cmdInput.equals("setLieferzeit")) {
				System.out.print("Offerten-Nummer>");
				int oNumber = keyScan.nextInt();
				keyScan.nextLine();
				System.out.print("Lieferzeit>");
				String lieferzeit = keyScan.nextLine();	
				
				// c)
				oMan.getOfferte(oNumber).setLieferzeit(lieferzeit);
				
			} else if (cmdInput.equals("setEinkaufspreis")) {
				System.out.print("Offerten-Nummer>");
				int oNumber = keyScan.nextInt();
				keyScan.nextLine();
				System.out.print("Einkaufspreis>");
				double preis = keyScan.nextDouble();
				keyScan.nextLine();
				
				// c)
				oMan.getOfferte(oNumber).setEinkaufspreis(preis);

			} else if (cmdInput.equals("printOfferten")) {
				
				// c)
				oMan.printAllOfferten();
				
			}
		}
		keyScan.close();
	}
}
