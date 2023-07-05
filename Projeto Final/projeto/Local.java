package projeto;

import java.util.Scanner;
import java.lang.Math;

public class Local {  
    
    static Scanner ler = new Scanner(System.in);
    LagoNoCaminho lago;

    public Local() {
        lago = new LagoNoCaminho();
    }

    public int ganhaQuatroMoedas(String jogador) {
        System.out.printf("\n\n+-------  %s ganhou 4 moedas!  -------+\n", jogador);
        return 4;
    }

    public void localVazio() {
        System.out.println("\n\n === Local vazio, siga em frente. ===");
    }

    public int surpresa(int num, String jogador, int moedas, int moedasAdv) {
        switch(num) {
        case 0:
            System.out.printf("\n\n+-------  %s ganhou o dobro de moedas!  -------+\n", jogador);
            return moedas*2;
        case 1:
            System.out.printf("\n\n+-------  %s ganhou a metade das suas moedas!  -------+\n", jogador);
            return moedas + (moedas/2);
        default:
            System.out.printf("\n\n+-------  %s ganhou a quantidade do adversário!  -------+\n", jogador);
            return moedas + moedasAdv;
        }
    }

    public int lagoNoCaminho(int num) {
        lago.desenhoDoLago();
        int resp;

        switch(num) {
        case 0:
            System.out.println("\n\nHá um lago no caminho, você precisa atravessá-lo.");
            MetodoStatic.systemPause();
            System.out.println("Você tem duas opções:\n"+
                               "  1 - Dar a volta no lago\n"+
                               "  2 - Pedir ajuda"); 
            resp = Local.ler.nextInt(); 

            if (resp == 1) return lago.darVoltaNoLago();
            else           return lago.pedirAjudaNoLago(); 
            
        default:
            System.out.println("\n\nNossa! Você caiu em um lago, precisa atravessá-lo.");
            MetodoStatic.systemPause();
            System.out.println("Você tem duas opções:\n"+
                               "  1 - Ir nadando\n"+
                               "  2 - Pedir ajuda"); 
            resp = Local.ler.nextInt(); 

            if (resp == 1) return lago.irNadando();
            else           return lago.pedirAjudaNoLago();
        }
    }

    public int desconhecidoNoCaminho(int num) {
        Desconhecido pessoa;  

        switch(num) {
            case 0: pessoa = new IndigenaFerido(); break;
            default: pessoa = new AventureiroFerido(); break;
        }

        System.out.println("\n\nTem alguém à frente...");
        pessoa.desenhoDesconhecido();

        MetodoStatic.systemPause();
        System.out.print("Acho que está ferido. ");
        return pessoa.pedirAjuda();
    }
}
