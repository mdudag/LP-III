package projeto;

public class IndigenaFerido extends Desconhecido {
    @Override
    public void historia() {
        desenhoArvore();
        
        System.out.println("\n   Enquanto caminhava por entre a vegetação densa, o indígena chamado Cauã avistou"+
                            "\n uma árvore majestosa, cujas raízes se estendiam pelo chão, formando um intricado"+
                            "\n emaranhado. Impulsionado pela curiosidade, ele decidiu escalá-la para obter uma"+
                            "\n visão mais ampla do terreno.");

        MetodoStatic.systemPause();
        
        System.out.println("\n   No entanto, no meio da subida, uma das raízes se soltou, fazendo com que "+
                            "\n Cauã perdesse o equilíbrio e caísse de uma altura considerável. Cauã acordou"+
                            "\n dolorido e confuso, encontrando-se em uma clareira desconhecida. Sua perna"+
                            "\n direita estava ferida e ele mal conseguia colocar peso sobre ela."+
                            "\n\n Ele está muito agradecido pela ajuda!!");

        MetodoStatic.systemPause();
    }
}
