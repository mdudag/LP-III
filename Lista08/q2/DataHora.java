public class DataHora {
  private Data data;
  private TimeAsInt hora;

  public DataHora(Data data, TimeAsInt hora) {
    this.data = data;
    this.hora = hora;
  }

  public String toString() {
    return "Data: " + data.getData() + ", Hora: " + hora.getTime();
  }

  public boolean isEqual(DataHora outroObjeto) {
    // Se os objetos forem iguais
    if (data.dataEmValor(data) == outroObjeto.data.dataEmValor(outroObjeto.data) &&
        hora.getValue() == outroObjeto.hora.getValue())
      return true;
    
    return false;
  }

  public boolean isGreather(DataHora outroObjeto) {
    // Se o objeto eviado como parâmetro for maior
    if (data.dataEmValor(data) < outroObjeto.data.dataEmValor(outroObjeto.data) &&
        hora.getValue() < outroObjeto.hora.getValue())
      return true;
    
    return false;
  }

  public boolean isLower(DataHora outroObjeto) {
    // Se o objeto eviado como parâmetro for menor
    if (data.dataEmValor(data) > outroObjeto.data.dataEmValor(outroObjeto.data) &&
        hora.getValue() > outroObjeto.hora.getValue())
      return true;
    
    return false;
  }
}
