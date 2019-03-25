// a)
public class Geschaeftskunde extends Kunde {
  private String uid;

  // b)
  public Geschaeftskunde(String name, String adresse, int nummer, String uid) {
    super(name, adresse, nummer);
    this.uid = uid;
  }

  // b)
  public String getUid() {
    return uid;
  }

  // b)
  public void setUid(String uid) {
    this.uid = uid;
  }

  // b)
  public void print() {
    super.print();
    System.out.println("UID: " + uid);
  }
}
