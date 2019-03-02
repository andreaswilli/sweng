public class Tour {
  // a), c)
  private String ziel;
  // d)
  private String datum;

  // b)
  public Tour(String ziel) {
    this.ziel = ziel;
    // d)
    datum = "1.1.2019";
  }

  // c)
  public String getZiel() {
    return ziel;
  }

  // d)
  public String getDatum() {
    return datum;
  }

  // e)
  public void setDatum(String datum) {
    this.datum = datum;
  }

  // f)
  public void print() {
    // d)
    System.out.println("Tour vom " + datum);
    // c)
    System.out.println("Ziel: " + ziel);
  }
}
