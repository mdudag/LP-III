package projeto;

public class AventureiroFerido extends Desconhecido {
    @Override
    public void historia() {
        System.out.println("\n   Tomás era um aventureiro destemido, sempre em busca de novas experiências e"+
                           "\n paisagens impressionantes. Em sua jornada solitária, ele se deparou com uma árvore"+
                           "\n majestosa, com raízes retorcidas e um dossel frondoso.");
        desenhoArvore();
        MetodoStatic.systemPause();
        
        System.out.println("\n   Enquanto caminhava ao redor da árvore, Tomás pisou em uma pedra solta e torceu o"+
                           "\n tornozelo. A dor o dominou, tornando difícil continuar seu caminho."+
                           "\n\n Ele está muito agradecido pela ajuda!!");

        MetodoStatic.systemPause();
    }
}
