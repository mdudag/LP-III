public class TimeExample {
  public static void main(String[] args) {
    TimeConventional time1 = new TimeConventional(22, 55, 20);

    System.out.printf("\n\t--- Hora Convencional ---\n");
    System.out.printf("\nHora: ");
    time1.prnTime();
    System.out.println("A hora informada é antes de 12:00? " + time1.isAm());

    TimeConventional time2 = new TimeConventional(10, 45, 14);
    
    System.out.printf("\nOutra hora: ");
    time2.prnTime();
    System.out.println("Quantidade de segundos transcorridos: " + time1.cron(time2) + " segundos");

    TimeConventional time3 = new TimeConventional(1, 0, 45);
    
    System.out.printf("\nOutra hora: ");
    time3.prnTime();
    System.out.println("Quantidade de segundos transcorridos: " + time1.cron(time3) + " segundos");
    
    int segs = 43789;
    
    time1.addSeconds(segs);
    System.out.printf("\nAcrescentando %d segundos em hora 1\nHora 1 atualizada: %s\n", segs, time1.getTime()); 

    // --------------------------------------------
    
    TimeAsInt time4 = new TimeAsInt(22, 55, 20);

    System.out.printf("\n\t--- Hora como Inteiro ---\n");
    System.out.printf("\nHora: ");
    time4.prnTime();
    System.out.println("A hora informada é antes de 12:00? " + time4.isAm());

    TimeAsInt time5 = new TimeAsInt(10, 45, 14);
    
    System.out.printf("\nOutra hora: ");
    time5.prnTime();
    System.out.println("Quantidade de segundos transcorridos: " + time4.cron(time5) + " segundos");

    TimeAsInt time6 = new TimeAsInt(1, 0, 45);
    
    System.out.printf("\nOutra hora: ");
    time6.prnTime();
    System.out.println("Quantidade de segundos transcorridos: " + time4.cron(time6) + " segundos"); 
    
    time4.addSeconds(segs);
    System.out.printf("\nAcrescentando %d segundos em hora 1\nHora 1 atualizada: %s\n", segs, time4.getTime()); 
  } 
}
