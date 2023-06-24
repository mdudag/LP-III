package q02;

public class Triangulo implements Shape2D {
    protected Ponto2D p;
    protected float lado1, lado2, lado3;

    public Triangulo(float x, float y, float l1, float l2, float l3) {
        if (validaTriangulo(l1, l2, l3)) {
            p = new Ponto2D(x, y);
            lado1 = l1;
            lado2 = l2;
            lado3 = l3;
        }
        else {
            System.out.println("Triângulo inválido!");
            iniciaTriangulo();
        }
    }

    public Triangulo(Triangulo triang) {
        this(triang.p.x, triang.p.y, triang.lado1, triang.lado2, triang.lado3);
    }

    public Triangulo() {
        this(0, 0, 1, 1, 1);
    }

    // Método Getter

    public Ponto2D getCentro() {
        return p;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    // Outros Métodos

    protected boolean validaTriangulo(float l1, float l2, float l3) {
        if (l1>0 && l2>0 && l3>0) return true;
        return false;
    }

    protected void iniciaTriangulo() {
        p = new Ponto2D();
        lado1 = lado2 = lado3 = 1;
    }

    @Override
    public String toString() {
        return "\n  --- Triângulo ---\n" +
               p.toString() +
               "\nLado 1: " + lado1 +
               "\nLado 2: " + lado2 +
               "\nLado 3: " + lado3;
    }

    @Override
    public float calculaArea() {
        return lado1*lado2/2;
    }

    @Override
    public float calculaPerimetro() {
        return 3*lado1;
    }
}
