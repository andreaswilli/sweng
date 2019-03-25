// c)
public class Offerte {
  private Kunde kunde;
  private String beschreibung;
  private double einkaufspreis;
  private String lieferzeit;
  private int nummer;

  public Offerte(Kunde kunde, String beschreibung, int nummer) {
    this.setKunde(kunde);
    this.setBeschreibung(beschreibung);
    this.setEinkaufspreis(1.0);
    this.setLieferzeit("undefined");
    this.setNummer(nummer);
  }

  public Kunde getKunde() {
    return kunde;
  }

  public void setKunde(Kunde kunde) {
    this.kunde = kunde;
  }

  public int getNummer() {
    return nummer;
  }

  public void setNummer(int nummer) {
    this.nummer = nummer;
  }

  public String getLieferzeit() {
    return lieferzeit;
  }

  public void setLieferzeit(String lieferzeit) {
    this.lieferzeit = lieferzeit;
  }

  public double getEinkaufspreis() {
    return einkaufspreis;
  }

  public void setEinkaufspreis(double einkaufspreis) {
    this.einkaufspreis = einkaufspreis;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  public void print() {
    kunde.print();
    System.out.println("Beschreibung: " + beschreibung);
    System.out.println("Einkaufspreis: " + einkaufspreis);
    System.out.println("Verkaufspreis: " + einkaufspreis * kunde.getMarge());
    System.out.println("Lieferzeit: " + lieferzeit);
  }
}
