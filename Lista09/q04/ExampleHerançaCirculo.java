package q04;

public class ExampleHerançaCirculo {
    public static void main(String args[]) {
        Cone cone = new Cone(0, 0, 10, 15);

        System.out.println("\n       ------ CONE ------\n\n" + cone.toString());
        System.out.println(String.format("\nVolume: %.2f", cone.calculaVolume()));
        System.out.println(String.format("Área Superficial: %.2f\n", cone.calculaAreaSuperficial()));

        Cilindro cilindro = new Cilindro(0, 0, 10, 15);

        System.out.println("\n     ------ CILINDRO ------\n\n" + cilindro.toString());
        System.out.println(String.format("\nVolume: %.2f", cilindro.calculaVolume()));
        System.out.println(String.format("Área Superficial: %.2f\n", cilindro.calculaAreaSuperficial()));
    }
}
