public class DataHoraExample {
  public static void main(String args[]) {
    DataHora dataHora = new DataHora(1, 2, 2013, 8, 7, 45);
    DataHora dataHora2 = new DataHora(12, 4, 1996, 3, 7, 3);
    DataHora dataHora3 = new DataHora(12, 9, 1996, 3, 7, 3);
    DataHora dataHora4 = new DataHora(12, 4, 1996, 3, 7, 3);
    DataHora dataHora5 = new DataHora(1, 4, 2023, 12, 4, 8);

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
