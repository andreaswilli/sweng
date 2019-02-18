import java.util.Scanner;

public class Offertenvergleich {
  public static void main(String[] args) {
    double preisA;
    double preisB;
    int lZeitA;
    int lZeitB;
    
    // b)
    Scanner sc = new Scanner(System.in);
    System.out.print("Preis A: ");
    preisA = sc.nextDouble();
    System.out.print("Preis B: ");
    preisB = sc.nextDouble();
    System.out.print("Lieferzeit A: ");
    lZeitA = sc.nextInt();
    System.out.print("Lieferzeit B: ");
    lZeitB = sc.nextInt();
    sc.close();

    System.out.println("A: " + preisA + " CHF, " + lZeitA + " Tage");
    System.out.println("B: " + preisB + " CHF, " + lZeitB + " Tage");

    // c)
    if (lZeitA > 14 && lZeitB > 14) {
      System.out.println("Nichts bestellen.");
      return;
    }

    if (preisA == preisB && lZeitA <= 14 && lZeitB <= 14) {
      System.out.println("Freie Wahl des Lieferanten.");
      return;
    }

    if (preisA < preisB) {
      if (lZeitA <= 14) {
        System.out.println("Bei A bestellen.");
      } else {
        System.out.println("Bei B bestellen.");
      }
    } else {
      if (lZeitB <= 14) {
        System.out.println("Bei B bestellen.");
      } else {
        System.out.println("Bei A bestellen.");
      }
    }
  }
}
