public class Main3 {
  public static void main(String args[]) {
    LampadaTresEstados lampada = new LampadaTresEstados();

    lampada.inicializarLampada("Incandescente", 25, "pequena", 2.11f, false, true);
    lampada.imprimirLampada();
    System.out.printf("\n");
    lampada.apagar();
    lampada.imprimirLampada();
  }
}
