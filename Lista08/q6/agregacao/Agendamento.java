public class Agendamento {
  private Data data;
  private TimeAsInt time;
  private Contato contato;
  public static int numAgend = 0;

  public Agendamento(Data d, TimeAsInt t, Contato c) {
    data = d;
    time = t;
    contato = c;
    numAgend++;
  }

  public String getAgendamento() {
    return "Data: "+data.getData()+ "\nHora: "+time.getTime()+ 
           "\n  --- Contato ---\n"+contato.getContato();
  }

  public static void prnNumAgend() {
    System.out.println("Número de agendamentos: " + numAgend);
  }
}
