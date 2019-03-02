import java.text.SimpleDateFormat;
import java.util.Date;

// h)
public class Wegpunkt {

  private double hoehe;
  private long zeit;

  public Wegpunkt(double hoehe) {
    this.hoehe = hoehe;
    zeit = System.currentTimeMillis();
  }

  public double getHoehe() {
    return hoehe;
  }

  public long getZeit() {
    return zeit;
  }

  // i)
  public String getFormattedZeit() {
    SimpleDateFormat fTime = new SimpleDateFormat("HH:mm:ss");
    return fTime.format(new Date(zeit));
  }
}
