import java.util.Scanner;

// a)
public class Quiz {
  public static void main(String[] args) {
    int [] antwort = {12,24,324,42};
    String [] frage = new String[4];
    frage[0] = "Wie viel gibt 2*6?";
    frage[1] = "Wie viele Stunden hat ein Tag?";
    frage[2] = "Wie hoch ist der Eiffelturm?";
    // c)
    frage[3] = "Was ist der Sinn des Lebens?";

    Scanner sc = new Scanner(System.in);
    double anzRichtige = 0;

    // b)
    for (int i = 0; i < frage.length; i++) {
      System.out.print("Frage " + (i + 1) + ": " + frage[i] + " ");
      // d)
      if (sc.nextInt() == antwort[i]) {
        System.out.println("Richtig\n");
        // f)
        anzRichtige++;
      } else {
        System.out.println("Falsch\n");
      }
    }
    sc.close();
    // f)
    printSummary(frage.length, anzRichtige);
  }

  // e)
  static void printSummary(double total, double richtig) {
    System.out.println("Richtig: " + richtig + " von " + total);

    // g)
    if (richtig <= total/3) {
      System.out.println("Du hast noch Potential!");
      return;
    }

    if (richtig <= total/3 * 2) {
      System.out.println("Nicht schlecht!");
      return;
    }

    System.out.println("Super, gratuliere!");
   }
}
