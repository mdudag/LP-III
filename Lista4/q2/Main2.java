public class Main2 {
  public static void main(String args[]) {
    Contato contato = new Contato();

    contato.inicializarContato("Maria", "maria@gmail.com", "73 912345678", 3, 11, 2002);
    contato.imprimirContato();
    System.out.printf("\nIdade: %d anos\n\n", contato.calcularIdade(26, 4, 2023)); 

    Contato contato2 = new Contato();

    contato2.inicializarContato("Jorge", "jorge@gmail.com", "73 987654321", 14, 5, 1980);
    contato2.imprimirContato();
    System.out.printf("\nIdade: %d anos", contato2.calcularIdade(26, 4, 2023)); 
  }
}
