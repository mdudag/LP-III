package projeto;

public class PrintTabuleiro {
    private String print[];
    private String stringAnterior;

    public PrintTabuleiro() {
        // "o": Local que não foi percorrido
        // "#": Local que foi percorrido ou onde o jogador se encontra
        // "@": Local onde há uma surpresa

        String print[] = {"                 #",                             // nível 0
                          "                / \\", 
                          "               o   o",                           // nível 1
                          "              / \\ / \\",
                          "             o   o   o",                         // nível 2
                          "            / \\ / \\ / \\",
                          "           o   o   o   o",                       // nível 3
                          "          / \\ / \\ / \\ / \\",
                          "         o   o   o   o   o",                     // nível 4
                          "        / \\ / \\ / \\ / \\ / \\ ",
                          "       o   o   o   o   o   o",                   // nível 5
                          "      / \\ / \\ / \\ / \\ / \\ / \\ ",
                          "     o   o   o   o   o   o   o",                 // nível 6
                          "    / \\ / \\ / \\ / \\ / \\ / \\ / \\ ",
                          "   o   o   o   o   o   o   o   o",               // nível 7
                          "  / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ ",     
                          " o   o   o   o   o   o   o   o   o\n"};          // nível 8

        this.print = print;
        stringAnterior = "";
    }

    public void printTabuleiro(int nivel, int direcao) {
        // Para retirar a setinha que aponta ao nível anterior neste momento
        if (nivel > 0 && stringAnterior != "")
            print[2*(nivel-1)] = stringAnterior;

        //System.out.println("teste");
        switch(nivel) {
            case 0:                                      break; // Apenas mostra o nível 0
            case 1: print[2] = modificaNivel1(direcao);  break;
            case 2: print[4] = modificaNivel2(direcao);  break;
            case 3: print[6] = modificaNivel3(direcao);  break;
            case 4: print[8] = modificaNivel4(direcao);  break;
            case 5: print[10] = modificaNivel5(direcao); break;
            case 6: print[12] = modificaNivel6(direcao); break;
            case 7: print[14] = modificaNivel7(direcao); break;
            case 8: print[16] = modificaNivel8(direcao); break;
            default: 
                System.out.println("\nErro! Esse nível não existe."); return;
        }
        //System.out.println("teste2");

        // Acrescenta uma setinha para identificar o nível no tabuleiro
        //if (nivel != 0) 
            stringAnterior = print[2*nivel];
        
            print[2*nivel] += "  <-";

            if (nivel == 8) print[16] += "\n"; 
        

        for (String i: print)
            System.out.println(i);

        //System.out.println("teste3");
    }

    public void printTabuleiro() {  // revisar
        printTabuleiro(0, 0);
    }

    // private String modificaNivel0() {
    //     return "                 #";
    // }

    private String modificaNivel1(int direcao) {
        switch(direcao) {
            case 0: return "               #   o";  
            default: return "               o   #";
        }
    }

    private String modificaNivel2(int direcao) {
        switch(direcao) {
            case 0: return "             @   o   o";
            case 1: return "             o   #   o";
            default: return "             o   o   #";
        }
    }

    private String modificaNivel3(int direcao) {
        switch(direcao) {
            case 0: return "           #   o   o   o";
            case 1: return "           o   #   o   o";
            case 2: return "           o   o   #   o";
            default: return "           o   o   o   @";
        }
    }

    private String modificaNivel4(int direcao) {
        switch(direcao) {
            case 0: return "         #   o   o   o   o";
            case 1: return "         o   #   o   o   o";
            case 2: return "         o   o   @   o   o";
            case 3: return "         o   o   o   #   o";
            default: return "         o   o   o   o   #";
        }
    }

    private String modificaNivel5(int direcao) {
        switch(direcao) {
            case 0: return "       @   o   o   o   o   o";
            case 1: return "       o   #   o   o   o   o";
            case 2: return "       o   o   @   o   o   o";
            case 3: return "       o   o   o   #   o   o";
            case 4: return "       o   o   o   o   @   o";
            default: return "       o   o   o   o   o   #";
        }
    }

    private String modificaNivel6(int direcao) {
        switch(direcao) {
            case 0: return "     #   o   o   o   o   o   o";
            case 1: return "     o   @   o   o   o   o   o";
            case 2: return "     o   o   #   o   o   o   o";
            case 3: return "     o   o   o   #   o   o   o";
            case 4: return "     o   o   o   o   @   o   o";
            case 5: return "     o   o   o   o   o   #   o";
            default: return "     o   o   o   o   o   o   @";
        }
    }

    private String modificaNivel7(int direcao) {
        switch(direcao) {
            case 0: return "   #   o   o   o   o   o   o   o";
            case 1: return "   o   #   o   o   o   o   o   o";
            case 2: return "   o   o   #   o   o   o   o   o";
            case 3: return "   o   o   o   #   o   o   o   o";
            case 4: return "   o   o   o   o   @   o   o   o";
            case 5: return "   o   o   o   o   o   @   o   o";
            case 6: return "   o   o   o   o   o   o   #   o";
            default: return "   o   o   o   o   o   o   o   #";
        }
    }

    private String modificaNivel8(int direcao) {
        switch(direcao) {
            case 0: return " #   o   o   o   o   o   o   o   o";
            case 1: return " o   #   o   o   o   o   o   o   o";
            case 2: return " o   o   #   o   o   o   o   o   o";
            case 3: return " o   o   o   @   o   o   o   o   o";
            case 4: return " o   o   o   o   #   o   o   o   o";
            case 5: return " o   o   o   o   o   #   o   o   o";
            case 6: return " o   o   o   o   o   o   #   o   o";
            case 7: return " o   o   o   o   o   o   o   @   o";
            default: return " o   o   o   o   o   o   o   o   #";
        }
    }
}
