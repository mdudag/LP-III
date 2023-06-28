package projeto;

import java.util.Scanner;
import java.lang.Math;

public class Local {   // Classe de serviços ou utilitária: apresenta apenas métodos
    // quando passar por um caminho, limpar console

    // Outros Métodos

    static public void systemPause() {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nPressione enter...");
        String resp = ler.nextLine();
        return;
    }

    public int ganhaQuatroMoedas(String jogador) {
        System.out.printf("\n+-------  %s ganhou 4 moedas!  -------+\n", jogador);
        return 4;
    }

    public void localVazio() {
        System.out.println("\nLocal vazio, siga em frente.");
    }

    public int supresa(int num, String jogador, int moedas, int moedasAdv) {
        switch(num) {
        case 0:
            System.out.printf("\n+-------  %s ganhou o dobro de moedas!  -------+\n", jogador);
            return moedas*2;
        case 1:
            System.out.printf("\n+-------  %s ganhou a metade das suas moedas!  -------+\n", jogador);
            return moedas + (moedas/2);
        case 2:
            System.out.printf("\n+-------  %s ganhou a quantidade do adversário!  -------+\n", jogador);
            return moedas + moedasAdv;
        case 3:
            Scanner ler = new Scanner(System.in);

            System.out.println("\nSem saber quantas moedas seu adversário possui, você pode escolher"+
                               "\nse deseja trocar as suas moedas pelas dele ou não." + 
                               "\n   1 - Trocar pelas do adversário"+
                               "\n   2 - Continuar com minhas moedas");
            int resp = ler.nextInt();

            if (resp == 1) return moedasAdv;
            else return moedas;
            
        case 4:
            System.out.printf("\n+-------  %s perdeu todas as moedas. Siga em frente para recuperá-las  -------+\n", jogador);
            return 0;
        default:
            System.out.printf("\n+-------  %s perdeu metade das suas moedas. Ainda não acabou, continue em frente  -------+\n", jogador);
            return moedas/2;
        }
    }

    public void lagoNoCaminho(int num) {
        switch(num) {
        case 0:
            Scanner ler = new Scanner(System.in);

            System.out.println("\nHá um lago no caminho, você precisa atravessá-lo." + 
                               "\nPeça ajuda para chegar do outro lado, lá tem algo para você!");
            systemPause();
            System.out.println("Deseja pedir ajuda?\n  1 - Pedir ajuda\n  2 - Perder algumas moedas para escapar"); 
            int resp = ler.nextInt(); 

            if (resp == 1) System.out.println("Pediu ajuda e passou");
            else System.out.println("Perdeu moedas");
            break;
        case 1:
            System.out.println("Você caiu no lago! Melhor pedir ajuda.");
            break;
        }
    }

    public void suspeitoNoCaminho(int num) {
        System.out.println("Tem alguém à frente. Parece ferido. Deseja ajudar?");

        switch(num) {
        case 0:
            System.out.println("Era um ladrão.");
            break;
        case 1:
            System.out.println("Era uma pessoa ferida.");
            break;
        }
    }
}
