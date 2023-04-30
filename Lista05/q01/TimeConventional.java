import java.lang.Math;

public class TimeConventional {
  private int hora;
  private int min;
  private int seg;

  public TimeConventional(int hora, int min, int seg) {
    if (validateTime(hora, min, seg)) {
      this.hora = hora;
      this.min = min;
      this.seg = seg;
    }
    else 
      this.hora = this.min = this.seg = 0; 
  }

  // Método Getter

  private int getHora() {
    return hora;
  }
  
  private int getMin() {
    return min;
  }
  
  private int getSeg() {
    return seg;
  }

  private boolean validateTime(int hora, int min, int seg) {
    return validateHour(hora) && 
           validateMinOrSec(min) && 
           validateMinOrSec(seg);
  }

  private boolean validateHour(int hora) {
    if((hora>=0) && (hora<=24))
      return true;
    
    return false;
  }

  private boolean validateMinOrSec(int param) {
    if((param>=0) && (param<=60))
      return true;
      
    return false;
  }

  public boolean isAm() {
    if (hora < 12)
      return true;
    
    return false;
  }

  public int cron(TimeConventional outraHora) {
    int segs = cronHora(outraHora.getHora(), outraHora.getMin())
               + cronMin(outraHora.getMin(), outraHora.getSeg())
               + cronSeg(outraHora.getSeg());
    
    return segs;
  }
  
  private int cronHora(int outraHora, int outroMin) {
    // Distância entre as horas
    int h = (outraHora - hora);

    // Verifica se a diferença dos minutos é negativa
    if (verificaCronSegOuMinNeg(min, outroMin))
      h--;

    // Se as horas forem no mesmo dia
    if (hora <= outraHora)
      // Retorna a hora em segundos
      return  h * 3600;

    // Retorna a hora em segundos
    return (24 - Math.abs(h)) * 3600;
  }

  private int cronMin(int outroMin, int outroSeg) {
    // Distância entre os minutos
    int m = (outroMin - min);

    // Verifica se a diferença dos segundos é negativa
    if (verificaCronSegOuMinNeg(seg, outroSeg))
      m--;

    // Se o valor do minuto for positivo
    if (m >= 0) 
      // Retorna os minutos em segundos
      return m * 60;

    // Retorna os minutos em segundos
    return (60 - Math.abs(m)) * 60;
  }

  private int cronSeg(int outroSeg) {
    // Distância entre os segundos
    int s = (outroSeg - seg);

    // Se o valor dos segundos for positivo
    if (s >= 0)
      // Retorna os segundos
      return s;

    // Retorna os segundos
    return (60 - Math.abs(s));
  }

  private boolean verificaCronSegOuMinNeg(int t,int outroT) {
    // Se a diferença for negativa
    if ((outroT - t) < 0)
      return true;
    
    return false;
  }

  public void addSeconds(int segs) {
    int horaEmSeg = 3600;
    int minEmSeg = 60;
    int aux = segs + seg;

    if ((aux / horaEmSeg) != 0) {
      hora += (segs / horaEmSeg);
      segs %= horaEmSeg;
      aux = segs + seg;
    }
    
    if ((aux / minEmSeg) != 0) {
      min += (segs / minEmSeg);
      segs %= minEmSeg;
      aux = segs + seg;
    }

    if (validateMinOrSec(seg + segs) == false) {
      min++;
      seg = aux % minEmSeg;

      if (min >= minEmSeg) {
        hora++;
        min -= minEmSeg; 
      }
    }
    else 
      seg += segs;

    if (hora > 23) 
      hora = (hora % 23) - 1;
  }

  public String getTime() {
    String res = this.hora + ":" + this.min + ":" + this.seg;
    return res;
  }

  public void prnTime() {
    System.out.println(getTime());
  }
}
