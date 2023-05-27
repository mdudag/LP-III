public class SegmentoRetaExample {
  public static void main(String args[]) {
    SegmentoReta segReta1 = new SegmentoReta(2.6f, 4f, 5f, 6f);
    SegmentoReta segReta2 = new SegmentoReta(1f, 1f, 4f, 7f);
    SegmentoReta segReta3 = new SegmentoReta(3.5f, 4f, 10.6f, 5.2f);

    System.out.println(segReta1.imprimeSegmentoReta());
    System.out.println(segReta2.imprimeSegmentoReta());
    System.out.println(segReta3.imprimeSegmentoReta());
  }
}
