public class Main3 {
  public static void main(String args[]) {
    Lampada lampada = new Lampada();

    lampada.inicializarLampada("Incandescente", 25, "pequena", 2.11f, true);
    lampada.imprimirLampada();
    System.out.printf("\n");
    lampada.acender();
    lampada.imprimirLampada();
  }
}
