public class DataExample {
  public static void main(String args[]) {
    Data data1 = new Data(18, 5, 2023);
    Data data2 = new Data();
    Data data3 = new Data(data1);
    Data data4 = new Data(29, 2, 1600);

    System.out.println("Quantidade de dias entre 18/05/2023 e o fim do ano: " + Data.howManyDaysUntilEndYear(data1));
    System.out.println("Quantidade de dias entre 29/02/1600 e o fim do ano: " + Data.howManyDaysUntilEndYear(data4));
    System.out.println("Quantidade de dias entre 18/05/2023 e o fim do mes: " + Data.howManyDaysUntilNextMonth(data1));
    System.out.println("O ano 1600 é bissexto? " + Data.isBissexto(data4));
    System.out.println("\nDia da semana da data 18/05/2023: " + Data.dayOfWeek(data1));
    System.out.println("Data: " + Data.dayToPrintShort(data1));
    System.out.println("Data: " + Data.dayToPrintLong(data1));
  }
}
