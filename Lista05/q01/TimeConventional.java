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
    if((hora>=0) && (hora<=23))
      return true;
    
    return false;
  }

  private boolean validateMinOrSec(int param) {
    if((param>=0) && (param<60))
      return true;
      
    return false;
  }

  public boolean isAm() {
    if (hora < 12)
      return true;
    
    return false;
  }

  // ---------------------------------

  public int cron(TimeConventional outraHora) {
    int segs = cronHora(outraHora.getHora(), outraHora.getMin())
               + cronMin(outraHora.getMin(), outraHora.getSeg())
               + cronSeg(outraHora.getSeg());
    
    return segs;
  }
  
  private int cronHora(int outraHora, int outroMin) {
    // Distância entre as horas
    int h = (outraHora - hora);

    // Se as horas forem no mesmo dia
    if (hora <= outraHora) { 
      // Verifica se a diferença dos minutos é negativa
      if (verificaCronSegOuMinNeg(min, outroMin))
        h--;
      
      // Retorna a hora em segundos
      return  h * 3600;
    }

    // Verifica se a diferença dos minutos é negativa
    if (verificaCronSegOuMinNeg(min, outroMin))
      h++;   // Ocorre o incremento pois o cálculo está invertido
             // Isso é resolvido na linha abaixo

    // Retorna a hora em segundos
    return (24 - Math.abs(h)) * 3600;
  }

  private int cronMin(int outroMin, int outroSeg) {
    // Distância entre os minutos
    int m = (outroMin - min);

    // Se o valor do minuto for positivo
    if (m >= 0) {
      // Verifica se a diferença dos segundos é negativa
      if (verificaCronSegOuMinNeg(seg, outroSeg))
        m--;
      
      // Retorna os minutos em segundos
      return m * 60;
    }
    
    // Verifica se a diferença dos segundos é negativa
    if (verificaCronSegOuMinNeg(seg, outroSeg))
      m++;    // Ocorre o incremento pois o cálculo está invertido
              // Isso é resolvido na linha abaixo

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

  // ---------------------------------


  public void addSeconds(int segs) {
    int horaEmSeg = 3600;
    int minEmSeg = 60;
    int incrTime = segs / horaEmSeg;

    if (incrTime != 0) {
      hora += incrTime;
      segs %= horaEmSeg;
      incrTime = segs / minEmSeg;
    }
    
    if (incrTime != 0) {
      min += incrTime;
      segs %= minEmSeg;
    }

    // Se o valor dos segundos for inválido, no caso maior que 59
    if (validateMinOrSec(seg + segs) == false) {
      min++;
      
      // Atribui aos segundos seu valor correto
      seg += segs - 60;

      // Se o valor dos minutos for inválido, no caso maior que 59
      if (validateMinOrSec(min) == false) {
        hora++;
        
       // Atribui aos minutos seu valor correto
        min -= minEmSeg; 
      }
    }
      
    // Apenas incrementa os segundos
    else 
      seg += segs;

    if (hora > 23) 
      hora -= 24;
  }

  public String getTime() {
    String res = this.hora + ":" + this.min + ":" + this.seg;
    return res;
  }

  public void prnTime() {
    System.out.println(getTime());
  }
}
