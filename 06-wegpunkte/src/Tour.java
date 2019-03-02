import java.util.ArrayList;

public class Tour {

  private String ziel;
  private String datum;
  // i)
  private ArrayList<Wegpunkt> wegpunkte = new ArrayList<>();

  public Tour(String ziel) {
    this.ziel = ziel;
    datum = "1.1.2019";
  }

  public String getZiel() {
    return ziel;
  }

  public String getDatum() {
    return datum;
  }

  public void setDatum(String datum) {
    this.datum = datum;
  }

  // i)
  public void saveWegpunkt(double hoehe) {
    wegpunkte.add(new Wegpunkt(hoehe));
  }

  public void print() {
    System.out.println("Tour vom " + datum);
    System.out.println("Ziel: " + ziel);
    // i)
    for(Wegpunkt wp : wegpunkte) {
      System.out.println("Zeit: " + wp.getFormattedZeit() + " Höhe: " + wp.getHoehe());
    }
  }
}
