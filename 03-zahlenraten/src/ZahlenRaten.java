import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    Random rn = new Random();
    int zahl = rn.nextInt(101);
    System.out.println("Rate eine Zahl zwischen 0 und 100.");

    int guess = 101;
    int numberOfGuesses = 0;
    while (guess != zahl) {
      guess = keyScan.nextInt();
      numberOfGuesses++;
      if (guess < zahl) {
        System.out.println("Zu klein.");
      } else if (guess > zahl) {
        System.out.println("Zu gross.");
      } else {
        System.out.println("Richtig. Du hast " + numberOfGuesses + " Versuche benötigt.");
      }
    }
  }
}
