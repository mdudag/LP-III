public class Main {  
  public static void main(String args[]) {
    Data data1 = new Data();
    Data data2 = new Data();
    Data data3 = new Data();

    // Dados data 1
    
    data1.setDia(17);
    data1.setMes(13);
    data1.setAno(2000);

    print("\nData1: ");
    data1.imprimirData();
    print("\nData1 por extenso: ");
    data1.imprimirDataExtenso();
    print("\n");

    // Dados data 2

    data2.inicializarData(3, 11, 2002);
    
    print("\n\nData2: ");
    data2.imprimirData();
    print("\nData2 por extenso: ");
    data2.imprimirDataExtenso();
    print("\n");

    // Dados data 3

    data3.inicializarData(29, 2, 1600);
    
    print("\n\nData3: ");
    data3.imprimirData();
    print("\nData3 por extenso: ");
    data3.imprimirDataExtenso();
  }

  public static void print(String s) {
    System.out.print(s);
  }
}
