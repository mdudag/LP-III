import java.lang.Math;
import java.util.Date;
import java.text.SimpleDateFormat;

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
  
  // public TimeAsInt(int h) {
  //   this(h, 0, 0);
  // }


  public TimeAsInt() {
    this(0, 0, 0);
  }

  public TimeAsInt(TimeAsInt time) {
    this(time.value/3600, (time.value%3600)/60, 
         (time.value%3600)%60);
  }

  public TimeAsInt(int value) {
    this(value/3600, (value%3600)/60, 
         (value%3600)%60);
  }

  public int getValue() {
    return value;
  }

  public static TimeAsInt diffTime(TimeAsInt t1, TimeAsInt t2) {
    // Retorna um objeto TimeAsInt que tem como parametro para o 
    // construtor a diferença das horas
    return new TimeAsInt(Math.abs(t1.value - t2.value));
  }
  
  public static TimeAsInt diffTime(TimeAsInt t) {
    Date dataHoraAtual = new Date();
    String hora = new SimpleDateFormat("HH").format(dataHoraAtual);
    String min = new SimpleDateFormat("mm").format(dataHoraAtual);
    String sec = new SimpleDateFormat("ss").format(dataHoraAtual);

    int h = (Integer.parseInt(hora)) - 3;
    int m = Integer.parseInt(min);
    int s = Integer.parseInt(sec);

    TimeAsInt t2 = new TimeAsInt(h, m, s);

    return diffTime(t, t2);
  }
  
  public static boolean isAm(TimeAsInt t) {
    // Retorna verdadeiro se a hora for anterior ao meio-dia
    if ((t.value/3600) < 12)
      return true;
    return false;
  }
  
  public static boolean isPm(TimeAsInt t) {
    // Retorna verdadeiro se a hora for posterior dao meio-dia
    if ((t.value/3600) > 12)
      return true;
    return false;
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

    String h = Integer.toString(hora);
    String m = Integer.toString(min);
    String s = Integer.toString(sec);

    // Para que haja o formato convencional do horário hh:mm:ss, sempre com dois números
    if (hora <= 9)
      h = "0" + h;
    if (min <= 9)
      m = "0" + m;
    if (sec <= 9)
      s = "0" + s;

    return (h + ":" + m + ":" + s);
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
