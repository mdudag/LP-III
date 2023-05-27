public class DataHora {
  private Data data;
  private TimeAsInt hora;

  public DataHora(Data data, TimeAsInt hora) {
    this.data = data;
    this.hora = hora;
  }

  // public String toString() {
  //   return "Data: " + data.getData() + ", Hora: " + hora.getTime();
  // }

  public boolean isEqual(long dataVal, long outraDataVal, int horaVal, int outraHoraVal) {
    // Se os objetos forem iguais
    if (dataVal == outraDataVal &&
        horaVal == outraHoraVal)
      return true;
    
    return false;
  }

  public boolean isGreather(long dataVal, long outraDataVal, int horaVal, int outraHoraVal) {
    // Se o objeto eviado como parâmetro for maior
    if (dataVal < outraDataVal &&
        horaVal < outraHoraVal)
      return true;
    
    return false;
  }

  public boolean isLower(long dataVal, long outraDataVal, int horaVal, int outraHoraVal) {
    // Se o objeto eviado como parâmetro for menor
    if (dataVal > outraDataVal &&
        horaVal > outraHoraVal)
      return true;
    
    return false;
  }
}
