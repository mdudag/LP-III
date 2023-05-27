public class DataHoraExample {
  public static void main(String args[]) {
    Data data = new Data(1, 2, 2013);
    Data data2 = new Data(12, 4, 1996);
    Data data3 = new Data(12, 9, 1996);
    Data data4 = new Data(12, 4, 1996);
    Data data5 = new Data(1, 4, 2023);
    
    TimeAsInt hora = new TimeAsInt(8, 7, 45);
    TimeAsInt hora2 = new TimeAsInt(3, 7, 3);
    TimeAsInt hora3 = new TimeAsInt(3, 7, 3);
    TimeAsInt hora4 = new TimeAsInt(3, 7, 3);
    TimeAsInt hora5 = new TimeAsInt(12, 4, 8); 
    
    DataHora dataHora = new DataHora(data, hora);
    DataHora dataHora2 = new DataHora(data2, hora2);
    DataHora dataHora3 = new DataHora(data3, hora3);
    DataHora dataHora4 = new DataHora(data4, hora4);
    DataHora dataHora5 = new DataHora(data5, hora5);

    System.out.println("dataHora1: Data: " + data.getData() + ", Hora: " + hora.getTime());
    System.out.println("dataHora2: Data: " + data2.getData() + ", Hora: " + hora2.getTime());
    System.out.println("dataHora3: Data: " + data3.getData() + ", Hora: " + hora3.getTime());
    System.out.println("dataHora4: Data: " + data4.getData() + ", Hora: " + hora4.getTime());
    System.out.println("dataHora5: Data: " + data5.getData() + ", Hora: " + hora5.getTime());

    System.out.println("\ndataHora2 é igual a dataHora3? " + dataHora2.isEqual(data2.dataEmValor(data2), data3.dataEmValor(data3), hora2.getValue(), hora3.getValue()));
    System.out.println("dataHora2 é igual a dataHora3? " + dataHora2.isEqual(data2.dataEmValor(data2), data4.dataEmValor(data4), hora2.getValue(), hora4.getValue()));

    System.out.println("\ndataHora2 é menor que dataHora3? " + dataHora2.isGreather(data2.dataEmValor(data2), data3.dataEmValor(data3), hora2.getValue(), hora3.getValue()));
    System.out.println("dataHora2 é menor que dataHora5? " + dataHora2.isGreather(data2.dataEmValor(data2), data5.dataEmValor(data5), hora2.getValue(), hora5.getValue()));

    System.out.println("\ndataHora2 é maior que dataHora3? " + dataHora2.isLower(data2.dataEmValor(data2), data3.dataEmValor(data3), hora2.getValue(), hora3.getValue()));
    System.out.println("dataHora5 é maior que dataHora2? " + dataHora5.isLower(data5.dataEmValor(data5), data2.dataEmValor(data2), hora5.getValue(), hora2.getValue()));
  }
}
