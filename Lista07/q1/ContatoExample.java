public class ContatoExample {
  public static void main(String args[]) {
    Contato contato = new Contato("Maria", "maria@gmail.com", "73 912345678", 3, 11, 2002);
    Contato contato2 = new Contato("Jorge", "73 987654321", 14, 5, 1980);
    Contato contato3 = new Contato("Jorge", 14, 5, 1980);
    Contato contato4 = new Contato();
    Contato contato5 = new Contato("Jorge", "jorge@gmail.com", "73 987654321");

    Data data1 = new Data(6, 12, 1945);
    Contato contato6 = new Contato("Jorge", "jorge@gmail.com", "73 987654321", data1);

    contato.imprimirContato();
    contato2.imprimirContato();
    contato3.imprimirContato();
    contato4.imprimirContato();
    contato5.imprimirContato();
    contato6.imprimirContato();

    contato.prnTotalContatos();
    contato3.prnTotalContatos();
  }
}
