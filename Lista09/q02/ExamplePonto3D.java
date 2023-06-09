package q02;

import q01.Ponto2D;

public class ExamplePonto3D {
    public static void main(String args[]) {
        Ponto2D p = new Ponto2D(2f, 0f);
        ComposiçãoPonto3D pC = new ComposiçãoPonto3D(2f, 0f, 12f);
        AgregaçãoPonto3D pA = new AgregaçãoPonto3D(p, 12f);
        HerançaPonto3D pH = new HerançaPonto3D(2f, 0f, 12f);

        // A implementação com composição e agregação deixa o código
        // mais complexo, dificultando a relação com a outra classe. 
        // Já com a herança, fica mais simples, ainda mais se os 
        // atributos forem protected. O código fica mais limpo e
        // não há necessidade de criar uma instância da outra classe 
        // na sua nova classe
        
        System.out.println("\n      --- Ponto2D ---");
        System.out.print(p.toString());
        p.localPonto();
        System.out.println("A distância entre o ponto p e (-2, 26) é " + p.distancia(-2, 26));

        System.out.println("\n     --- Composição ---");
        System.out.print(pC.toString());
        pC.localPonto();
        System.out.println("A distância entre o ponto pC e (-2, 26) é " + p.distancia(-2, 26));

        System.out.println("\n      --- Agregação ---");
        System.out.print(pA.toString());
        pA.localPonto();
        System.out.println("A distância entre o ponto pA e (-2, 26) é " + p.distancia(-2, 26));

        System.out.println("\n      --- Herança ---");
        System.out.print(pH.toString());
        pH.localPonto();
        System.out.println("A distância entre o ponto pH e (-2, 26) é " + p.distancia(-2, 26) + "\n");
    }
}
