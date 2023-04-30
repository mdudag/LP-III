import java.lang.Math;

public class TimeAsInt {
  private int value;

  public TimeAsInt(int h, int m, int s) {
    int value = TimeToSeconds(h, m, s);

    if (validateTime(value))
      this.value = value;
    else
      this.value = 0;
  }

  private boolean validateTime(int timeValue) {
    return ((timeValue>0) && (timeValue<86401)); //SegundosEmUmDia = 24*60*60 = 86400 
  }

  private int TimeToSeconds(int hora, int min, int sec) {
    return hora*3600 + min*60 + sec;
  }

  private String SecondsToTime() {
    String result = "";
    int hora;
    int min;
    int sec;

    hora = value/3600;
    min = (value % 3600)/60;
    sec = (value % 3600)%60;

    if (hora > 24)
      hora -= 24;

    result = Integer.toString(hora) + ":"
            + Integer.toString(min) + ":"
            + Integer.toString(sec);

    return result;
  }

  public boolean isAm() {
    if ((value/3600) < 12) 
      return true;

    return false;
  }

  public int cron(TimeAsInt outroValue) {
    int aux = outroValue.value - value;
    
    if (value <= outroValue.value) 
      return aux;

    return ((24 * 3600) - Math.abs(aux));
  }

  public void addSeconds(int secs) {
    value += secs;
  }

  public String getTime() {
    String res = SecondsToTime();
    return res;
  }

  public void prnTime() {
    System.out.println(getTime());
  }
}
