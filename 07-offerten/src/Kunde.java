public class Kunde {
  private String name;
  private String adresse;
  private double marge;
  private int nummer;

  public Kunde(String name, String adresse, int nummer) {
    this.name = name;
    this.adresse = adresse;
    this.marge = 2;
    this.nummer = nummer;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  // b)
  public double getMarge() {
    return marge;
  }

  // b)
  public void setMarge(double marge) {
    this.marge = marge;
  }

  // b)
  public int getNummer() {
    return nummer;
  }

  public void setNummer(int nummer) {
    this.nummer = nummer;
  }

  // a)
  public void print() {
    System.out.println("\nKunde: " + name);
    System.out.println("Adresse: " + adresse);
    System.out.println("Kundennummer: " + nummer);
    System.out.println("Marge: " + marge);
  }
}
