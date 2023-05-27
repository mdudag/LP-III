public class SegmentoRetaExample {
  public static void main(String args[]) {
    Ponto2D P1 = new Ponto2D(2.6f, 4f);
    Ponto2D P2 = new Ponto2D(5f, 6f);
    Ponto2D P3 = new Ponto2D(1f, 1f);
    Ponto2D P4 = new Ponto2D(4f, 7f);
    Ponto2D P5 = new Ponto2D(3.5f, 4f);
    Ponto2D P6 = new Ponto2D(10.6f, 5.2f);
    
    SegmentoReta segReta1 = new SegmentoReta(P1, P2);
    SegmentoReta segReta2 = new SegmentoReta(P3, P4);
    SegmentoReta segReta3 = new SegmentoReta(P5, P6);

    System.out.println(segReta1.imprimeSegmentoReta());
    System.out.println(segReta2.imprimeSegmentoReta());
    System.out.println(segReta3.imprimeSegmentoReta());
  }
}
