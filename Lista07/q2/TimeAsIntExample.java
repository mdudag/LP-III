public class TimeAsIntExample {
  public static void main(String[] args) {
    TimeAsInt hora1 = new TimeAsInt(1, 2, 3);
    TimeAsInt hora2 = new TimeAsInt();
    //TimeAsInt hora3 = new TimeAsInt(4);
    TimeAsInt hora4 = new TimeAsInt(21, 45);
    TimeAsInt hora5 = new TimeAsInt(hora1);
    TimeAsInt hora6;

    System.out.printf("\n   ------ Hora ------\n\n");
    hora1.prnTime();
    hora4.prnTime();

    hora6 = TimeAsInt.diffTime(hora1, hora4);
    hora6.prnTime();

    System.out.println("\nA hora1 é anterior ao meio-dia? " + TimeAsInt.isAm(hora1));
    System.out.println("A hora4 é posterior ao meio-dia? " + TimeAsInt.isPm(hora4) + "\n");

    System.out.printf("\n   ------ Hora ------\n\n");
    hora1.prnTime();

    hora6 = TimeAsInt.diffTime(hora1);
    hora6.prnTime();
  }
}
