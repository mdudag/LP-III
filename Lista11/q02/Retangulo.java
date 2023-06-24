package q02;

public class Retangulo implements Shape2D {
    protected Ponto2D p;
    protected float base;
    protected float altura;

    public Retangulo(float x, float y, float b, float a) {
        if (validaRetangulo(b, a)) {
            p = new Ponto2D(x, y);
            base = b;
            altura = a;
        }
        else {
            System.out.println("Retângulo inválido!");
            iniciaRetangulo();
        }
    }

    public Retangulo(Retangulo retang) {
        this(retang.p.x, retang.p.y, retang.base, retang.altura);
    }

    public Retangulo() {
        this(0, 0, 1, 1);
    }

    // Método Getter

    public Ponto2D getCentro() {
        return p;
    }

    public float getBase() {
        return base;
    }

    public float getaltura() {
        return altura;
    }

    // Outros Métodos

    protected boolean validaRetangulo(float r, float r2) {
        if (r>0 && r2>0) return true;
        return false;
    }

    protected void iniciaRetangulo() {
        p = new Ponto2D();
        base = altura = 1;
    }

    @Override
    public String toString() {
        return "\n  --- Retângulo ---\n" +
               p.toString() +
               "\nBase: " + base +
               "\nAltura: " + altura;
    }
    
    @Override
    public float calculaArea() {
        return base*altura;
    }

    @Override
    public float calculaPerimetro() {
        return 2*(base+altura);
    }
}
