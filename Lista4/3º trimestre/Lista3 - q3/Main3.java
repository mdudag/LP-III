public class Main3 {
  public static void main(String args[]) {
    LampadaTresEstados2 lampada = new LampadaTresEstados2();

    lampada.inicializarLampada("Incandescente", 25, "pequena", 2.11f, 100);
    lampada.imprimirLampada();
    System.out.printf("\n");
    lampada.diminuirLuz();
    lampada.aumentarLuz();
    lampada.imprimirLampada();
  }
}
