public class AgendamentoExample {
  public static void main(String args[]) {
    Agendamento agend = new Agendamento(27, 5, 2023, 0,0,45, "Maria", "maria@guedes.com", "73 912345678", 3, 11, 2002);

    System.out.println(agend.getAgendamento());
    Agendamento.prnNumAgend();
  }
}
