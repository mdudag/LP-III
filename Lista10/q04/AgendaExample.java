package q04;

public class AgendaExample {
    public static void main(String args[]) {
        Data d = new Data(3, 12, 1981);

        PessoaFisica pessoaFisica1 = new PessoaFisica("Ana", 
                                                    "Rua 1", 
                                                    "12345678", 
                                                  "ana@email.com", 
                                                    "00011122234", d);
                                                  
        PessoaFisica pessoaFisica2 = new PessoaFisica("Jorge", 
                                                    "Rua 2", 
                                                    "12345678", 
                                                  "jorge@email.com", 
                                                    "00011122234", d);

        PessoaFisica pessoaFisica3 = new PessoaFisica("Carolina", 
                                                    "Rua 3", 
                                                    "12345678", 
                                                  "carolina@email.com", 
                                                    "00011122234", d);

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Pedro", 
                                                          "Rua 4", 
                                                          "12345678", 
                                                        "pedro@email.com", 
                                                         "00011122234", 
                                                          10000.8f);

        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Caio", 
                                                          "Rua 5", 
                                                          "12345678", 
                                                        "caio@email.com", 
                                                         "00011122234", 
                                                          12050.60f);

      Agenda agenda = new Agenda();

      agenda.addNaAgenda(pessoaFisica1);
      agenda.addNaAgenda(pessoaFisica2);
      agenda.addNaAgenda(pessoaFisica3);
      agenda.addNaAgenda(pessoaJuridica1);
      agenda.addNaAgenda(pessoaJuridica2);
      
      agenda.listarContatos();
      agenda.buscaPessoaFisica(pessoaFisica3, "00011122234");
      agenda.buscaPessoaJuridica(pessoaJuridica1, "00011122234");
    }
}
