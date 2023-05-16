public class TimeAsIntExample {
  public static void main(String[] args) {
    TimeAsInt hora1 = new TimeAsInt(1, 2, 3);
    TimeAsInt hora2 = new TimeAsInt();
    TimeAsInt hora3 = new TimeAsInt(4);
    TimeAsInt hora4 = new TimeAsInt(21, 45);
    TimeAsInt hora5 = new TimeAsInt(hora1);

    System.out.printf("\n   ------ Hora ------\n\n");
    hora1.prnTime();
    hora2.prnTime();
    hora3.prnTime();
    hora4.prnTime();
    hora5.prnTime();

    hora1.addTime(2, 50, 16);
    hora2.addTime(hora4);
    hora3.addTime(2, 50);
    hora4.addTime(16);

    System.out.printf("\n   ------ Hora ------\n\n");
    hora1.prnTime();
    hora2.prnTime();
    hora3.prnTime();
    hora4.prnTime();
    hora5.prnTime();
  } 
}
