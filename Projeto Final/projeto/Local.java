package projeto;

import java.util.Scanner;
import java.lang.Math;

public class Local extends LagoNoCaminho {   // Classe de serviços ou utilitária: apresenta apenas métodos
    // quando passar por um caminho, limpar console
    static Scanner ler = new Scanner(System.in);
    // Outros Métodos

    public int ganhaQuatroMoedas(String jogador) {
        System.out.printf("\n+-------  %s ganhou 4 moedas!  -------+\n", jogador);
        return 4;
    }

    public void localVazio() {
        System.out.println("\n === Local vazio, siga em frente. ===");
    }

    public int surpresa(int num, String jogador, int moedas, int moedasAdv) {
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

            System.out.println("\nSem saber quantas moedas seu adversário possui, você pode escolher"+
                               "\nse deseja trocar as suas moedas pelas dele ou não." + 
                               "\n   1 - Trocar pelas do adversário"+
                               "\n   2 - Continuar com minhas moedas");
            int resp = ler.nextInt();

            if (resp == 1) return moedasAdv;
            else return moedas;
            
        case 4:
            System.out.printf("\n+-------  %s perdeu todas as moedas.  -------+\n", jogador);

            if (JogoTabuleiro.nivelAtual != 8)
                System.out.println(" Siga em frente para recuperá-las.");

            return 0;
        default:
            System.out.printf("\n+-------  %s perdeu metade das suas moedas.  -------+\n", jogador);

            if (JogoTabuleiro.nivelAtual != 8)
                System.out.println(" Ainda não acabou, continue em frente."); 

            return moedas/2;
        }
    }

    public void lagoNoCaminho(int num) {
        desenhoDoLago();
        int resp;

        switch(num) {
        case 0:
            System.out.println("\nHá um lago no caminho, você precisa atravessá-lo.");
            MetodoStatic.systemPause();
            System.out.println("Você tem duas opções:\n"+
                               "  1 - Dar a volta no lago\n"+
                               "  2 - Pedir ajuda"); 
            resp = Local.ler.nextInt(); 

            if (resp == 1) darVoltaNoLago();
            else           pedirAjudaNoLago();
            break;
        case 1:
            System.out.println("\nNossa! Você caiu em um lago, precisa atravessá-lo.");
            MetodoStatic.systemPause();
            System.out.println("Você tem duas opções:\n"+
                               "  1 - Ir nadando\n"+
                               "  2 - Pedir ajuda"); 
            resp = Local.ler.nextInt(); 

            if (resp == 1) irNadando();
            else           pedirAjudaNoLago();
            break;
        }
        
        MetodoStatic.systemPause();
    }

    public void desconhecidoNoCaminho(int num) {
        Desconhecido pessoa;  // Polimorfismo de subclasse

        switch(num) {
            case 0: pessoa = new IndigenaFerido(); break;
            default: pessoa = new AventureiroFerido(); break;
        }

        System.out.println("Tem alguém à frente...");
        pessoa.desenhoDesconhecido();

        MetodoStatic.systemPause();
        System.out.print("Acho que está ferido. ");
        pessoa.pedirAjuda();
    }
}
