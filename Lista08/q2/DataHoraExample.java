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

    System.out.println("Hora1: " + dataHora.toString());
    System.out.println("Hora2: " + dataHora2.toString());
    System.out.println("Hora3: " + dataHora3.toString());
    System.out.println("Hora4: " + dataHora4.toString());
    System.out.println("Hora5: " + dataHora5.toString());

    System.out.println("\n" + dataHora2.toString() + " é igual a " + dataHora3.toString() + "? " + dataHora2.isEqual(dataHora3));
    System.out.println(dataHora2.toString() + " é igual a " + dataHora4.toString() + "? " + dataHora2.isEqual(dataHora4));

    System.out.println("\n" + dataHora2.toString() + " é menor que " + dataHora3.toString() + "? " + dataHora2.isGreather(dataHora3));
    System.out.println(dataHora2.toString() + " é menor que " + dataHora5.toString() + "? " + dataHora2.isGreather(dataHora5));

    System.out.println("\n" + dataHora2.toString() + " é maior que " + dataHora3.toString() + "? " + dataHora2.isLower(dataHora3));
    System.out.println(dataHora5.toString() + " é maior que " + dataHora2.toString() + "? " + dataHora5.isLower(dataHora2));
  }
}
