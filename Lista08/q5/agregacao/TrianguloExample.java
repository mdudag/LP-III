import java.lang.Math;

public class TrianguloExample {
  public static void main(String args[]) {
    Ponto2D P1 = new Ponto2D(1, 1);
    Ponto2D P2 = new Ponto2D(1, 3);
    Ponto2D P3 = new Ponto2D(4, 1);

    Ponto2D P4 = new Ponto2D(1, 1);
    Ponto2D P5 = new Ponto2D(2, 4);
    Ponto2D P6 = new Ponto2D(3, 1);

    Ponto2D P7 = new Ponto2D(0, 0);
    float y = (float) (2 * Math.sqrt(3));
    Ponto2D P8 = new Ponto2D(2, y);
    Ponto2D P9 = new Ponto2D(4, 0);
    
    Triangulo trian1 = new Triangulo(P1, P2, P3);
    Triangulo trian2 = new Triangulo(P4, P5, P6);
    Triangulo trian3 = new Triangulo(P7, P8, P9);

    System.out.println(trian1.imprimeTriangulo());
    System.out.println(trian2.imprimeTriangulo());
    System.out.println(trian3.imprimeTriangulo());

    System.out.println("\nO triangulo: " + trian1.imprimeTriangulo() + " é retângulo? " + trian1.isTrianguloRetangulo());
    System.out.println("O triangulo: " + trian2.imprimeTriangulo() + " é retângulo? " + trian2.isTrianguloRetangulo());
    System.out.println("O triangulo: " + trian3.imprimeTriangulo() + " é retângulo? " + trian3.isTrianguloRetangulo());

    System.out.println("\nO triangulo: " + trian1.imprimeTriangulo() + " é isósceles? " + trian1.isTrianguloIssoceles());
    System.out.println("O triangulo: " + trian2.imprimeTriangulo() + " é isósceles? " + trian2.isTrianguloIssoceles());
    System.out.println("O triangulo: " + trian3.imprimeTriangulo() + " é isósceles? " + trian3.isTrianguloIssoceles());

    System.out.println("\nO triangulo: " + trian1.imprimeTriangulo() + " é retângulo? " + trian1.isTrianguloEquilatero());
    System.out.println("O triangulo: " + trian2.imprimeTriangulo() + " é retângulo? " + trian2.isTrianguloEquilatero());
    System.out.println("O triangulo: " + trian3.imprimeTriangulo() + " é retângulo? " + trian3.isTrianguloEquilatero());
  }
}
