public class DataExample {
  public static void main(String args[]) {
    Data data1 = new Data(9, 3, 2000);
    Data data2 = new Data();
    Data data3 = new Data(data1);
    Data data4 = new Data(29, 2, 1600);

    prnDatas(data1, data2, data3, data4); 

    System.out.println("Quantidade de dias entre 09/03/200 e 29/02/1600: " + data1.howManyDays(data4));
    System.out.println("Quantidade de dias entre 09/03/200 e 29/02/1600: " + data1.howManyDays(29, 2, 1600));
    
    System.out.println("\n  Modificando as datas...\n");

    data1.setData(data4);
    prnDatas(data1, data2, data3, data4);

    data2.setData(3, 11, 2002);
    prnDatas(data1, data2, data3, data4);

    // data3.setData(75);
    // prnDatas(data1, data2, data3, data4);

    // data4.setData(8);
    // prnDatas(data1, data2, data3, data4);

    data3.setData(9);
    prnDatas(data1, data2, data3, data4);
  }

  private static void prnDatas(Data d1, Data d2, Data d3, Data d4) {
    System.out.println("   ----- Data -----\n");
    
    d1.imprimirData();
    d2.imprimirData();
    d3.imprimirData();
    d4.imprimirData();
    
    System.out.println();
  }
}
