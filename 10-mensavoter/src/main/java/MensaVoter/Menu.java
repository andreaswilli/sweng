package MensaVoter;

public class Menu {

    private String type;
    private String title;
    private String description;
    private double[] prices;

    public Menu(String type, String title, String description) {
        this.type = type;
        this.title = title;
        this.description = description;
        prices = new double[3];
    }

    public void setPrice(double stud, double intern, double extern) {
        prices[0] = stud;
        prices[1] = intern;
        prices[2] = extern;
    }

    public void printMenu() {
        System.out.println("\nTyp: " + type);
        System.out.println("Titel: " + title);
        System.out.println("Beschreibung: " + description);
        System.out.println("Preise: " + prices[0] + " STUD, " + prices[1] + " INT, " + prices[2] + " EXT");
    }
}
