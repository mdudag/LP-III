public class DataExample {  
  public static void main(String args[]) {
    Data data1 = new Data(9, 3, 2000);

    // Dados data 1

    print("\nData1: ");
    data1.imprimirData();
    print("\nData1 por extenso: ");
    data1.imprimirDataExtenso();
    print("\n");

    // Dados data 2

    Data data2 = new Data(3, 11, 2002);
    
    print("\n\nData2: ");
    data2.imprimirData();
    print("\nData2 por extenso: ");
    data2.imprimirDataExtenso();

    System.out.println("\nA data passada é anterior a data 1? " + data1.isPrevious(data2));
    
    System.out.print("Quantidade de dias de "); 
    data1.imprimirData(); 
    System.out.print(" até "); 
    data2.imprimirData();
    System.out.println(": " + data1.howManyDays(data2, data1));

    System.out.print("Na data "); 
    data2.imprimirData();
    System.out.println(" é " + data2.dayOfWeek(data2)); 

    // Dados data 3

    Data data3 = new Data(29, 2, 1600);
    
    print("\n\nData3: ");
    data3.imprimirData();
    print("\nData3 por extenso: ");
    data3.imprimirDataExtenso();

    System.out.println("\nA data passada é anterior a data 1? " + data1.isPrevious(data3));

    System.out.print("Quantidade de dias de "); 
    data1.imprimirData(); 
    System.out.print(" até "); 
    data3.imprimirData();
    System.out.println(": " + data1.howManyDays(data3, data1));

    System.out.print("Na data "); 
    data3.imprimirData();
    System.out.println(" é " + data3.dayOfWeek(data3)); 
  }

  public static void print(String s) {
    System.out.print(s);
  }
}
