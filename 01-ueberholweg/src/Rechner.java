public class Rechner {
  public static void main(String[] args) {

    // b)
    double fzA = 5;
    double fzB = 15;
    double vA = 80;
    double vB = 70;
    System.out.println("Geschwindigkeit A: " + vA);
    System.out.println("Geschwindigkeit B: " + vB);
    System.out.println("Länge A: " + fzA);
    System.out.println("Länge B: " + fzB);

    // c)
    double sA = vA / 2;
    double sB = vB / 2;
    System.out.println("Sicherheitsabstand 1: " + sA);
    System.out.println("Sicherheitsabstand 2: " + sB);

    // d)
    double streckeRelativ = fzA + sA + fzB + sB;
    System.out.println("Relative Strecke: " + streckeRelativ + " Meter");

    // e)
    double vRelativ = vA - vB;
    System.out.println("Relative Geschwindigkeit: " + vRelativ);

    // f)
    double t = streckeRelativ * 3.6 / vRelativ;
    System.out.println("Benötigte Zeit: " + t + " Sekunden");

    // g)
    double ueberholweg = t * vA / 3.6;
    System.out.println("Ueberholweg: " + ueberholweg + " Meter");
  }
}
