public class Main3 {
  public static void main(String args[]) {
    Lampada2 lampada = new Lampada2();

    lampada.inicializarLampada("Incandescente", 25, "pequena", 2.11f, true);
    lampada.imprimirLampada();
    System.out.printf("\n");
    lampada.acender();
    System.out.println("A lâmpada está ligada agora? " + lampada.estaLigada());
    lampada.imprimirLampada();
  }
}
