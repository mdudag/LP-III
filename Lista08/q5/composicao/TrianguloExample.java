import java.lang.Math;

public class TrianguloExample {
  public static void main(String args[]) {
    Triangulo trian1 = new Triangulo(1, 1, 1, 3, 4, 1);
    Triangulo trian2 = new Triangulo(1, 1, 2, 4, 3, 1);
    
    float y = (float) (2 * Math.sqrt(3));
    Triangulo trian3 = new Triangulo(0, 0, 2, y, 4, 0);

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
