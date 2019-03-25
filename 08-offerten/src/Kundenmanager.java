import java.util.HashMap;

// c)
public class Kundenmanager {
  private HashMap<Integer, Kunde> alleKunden;
  private int nextKundenNummer;

  public Kundenmanager() {
    alleKunden = new HashMap<>();
    nextKundenNummer = 100;
  }

  public HashMap<Integer, Kunde> getAlleKunden() {
    return alleKunden;
  }

  public void setAlleKunden(HashMap<Integer, Kunde> alleKunden) {
    this.alleKunden = alleKunden;
  }

  public int getNextKundenNummer() {
    return nextKundenNummer;
  }

  public void setNextKundenNummer(int nextKundenNummer) {
    this.nextKundenNummer = nextKundenNummer;
  }

  public void addKunde(String name, String adresse, String uid) {
    if (uid == "") {
      alleKunden.put(nextKundenNummer, new Privatkunde(name, adresse, nextKundenNummer));
    } else {
      alleKunden.put(nextKundenNummer, new Geschaeftskunde(name, adresse, nextKundenNummer, uid));
    }
    nextKundenNummer++;
  }

  public Kunde getKunde(int kNumber) {
    return alleKunden.get(kNumber);
  }

  public void printAllKunden() {
    alleKunden.forEach((nummer, kunde) -> {
      System.out.println("---------------------------");
      kunde.print();
    });
  }

}
