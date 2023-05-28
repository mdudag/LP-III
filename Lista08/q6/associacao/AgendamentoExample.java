public class AgendamentoExample {
  public static void main(String args[]) {
    Data data = new Data(27, 5, 2023);
    TimeAsInt time = new TimeAsInt(0,0,45);
    Contato contato = new Contato("Maria", "maria@guedes.com", "73 912345678", 3, 11, 2002);
    
    Agendamento agend = new Agendamento(data, time, contato);

    System.out.println("Data: "+data.getData()+ "\nHora: "+time.getTime()+ 
                       "\n  --- Contato ---\n"+contato.getContato());
    Agendamento.prnNumAgend();
  }
}
