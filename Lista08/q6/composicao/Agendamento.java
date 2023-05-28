public class Agendamento {
  private Data data;
  private TimeAsInt time;
  private Contato contato;
  public static int numAgend = 0;

  public Agendamento(int d, int m, int a, int hora, int min, int sec, String nome, String email, String tel, int dNasc, int mNasc, int aNasc) {
    Data data = new Data(d, m, a);
    TimeAsInt time = new TimeAsInt(hora, min, sec);
    Contato contato = new Contato(nome, email, tel, dNasc, mNasc, aNasc);

    this.data = data;
    this.time = time;
    this.contato = contato;
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
