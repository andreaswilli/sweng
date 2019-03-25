import java.util.HashMap;

// a)
public class Offertenmanager {
  private HashMap<Integer, Offerte> alleOfferten;
  private Kundenmanager kundenmanager;
  private int nextOffertenNummer;

  public Offertenmanager(Kundenmanager k) {
    alleOfferten = new HashMap<>();
    kundenmanager = k;
    nextOffertenNummer = 1;
  }

  public void addOfferte(int kNummer, String beschreibung) {
    alleOfferten.put(nextOffertenNummer, new Offerte(kundenmanager.getKunde(kNummer), beschreibung, kNummer));
    nextOffertenNummer++;
  }

  public Offerte getOfferte(int oNummer) {
    return alleOfferten.get(oNummer);
  }

  public void printAllOfferten() {
    alleOfferten.forEach((nummer, offerte) -> {
      System.out.println("---------------------------");
      System.out.println("Offerten-Nummer: " + nummer);
      offerte.print();
    });
  }
}
