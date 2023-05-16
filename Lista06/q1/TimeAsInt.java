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
  
  public TimeAsInt(int h, int m) {
    this(h, m, 0);
  }
  
  public TimeAsInt(int h) {
    this(h, 0, 0);
  }


  public TimeAsInt() {
    this(0, 0, 0);
  }

  public TimeAsInt(TimeAsInt time) {
    this(time.value/3600, (time.value%3600)/60, 
         (time.value%3600)%60);
  }


  private int TimeToSeconds(int hora, int min, int sec) {
    return hora*3600 + min*60 + sec;
  }

  private boolean validateTime(int timeValue) {
    return ((timeValue>=0) && (timeValue<86400)); //SegundosEmUmDia = 24*60*60 = 86400 
  }

  private String SecondsToTime() {
    String result = "";
    int hora;
    int min;
    int sec;

    hora = value/3600;
    min = (value % 3600)/60;
    sec = (value % 3600)%60;

    if (hora >= 24)
      hora -= 24;

    result = Integer.toString(hora) + ":"
            + Integer.toString(min) + ":"
            + Integer.toString(sec);

    return result;
  }

  public boolean isAm() {
    int aux = value/3600;
    
    if (aux > 24) aux -= 24;
    if (aux < 12) return true;

    return false;
  }

  public int cron(TimeAsInt outroValue) {
    int aux = outroValue.value - value;
    
    if (value <= outroValue.value) 
      return aux;

    return (24 * 3600) - Math.abs(aux);
  }

  public void addTime(int h, int m, int s) {
    value += TimeToSeconds(h, m, s);
  }

  public void addTime(TimeAsInt time) {
    value += time.value;
  }

  public void addTime(int h, int m) {
    addTime(h, m, 0);
  }

  public void addTime(int s) {
    value += s;
  }

  public String getTime() {
    String res = SecondsToTime();
    return res;
  }

  public void prnTime() {
    System.out.println(getTime());
  }
}
