public class LampadaTresEstadosExample {
  public static void main(String args[]) {
    LampadaTresEstados lampada = new LampadaTresEstados("Incandescente", 25, "pequena", 2.11f, false, true);

    lampada.imprimirLampada();
    System.out.printf("\n");
    lampada.apagar();
    lampada.imprimirLampada();
  }
}
