package projeto;

public class PrintTabuleiro {
    private String print[];

    public PrintTabuleiro() {
        // "o": Local que não foi percorrido
        // "#": Local que foi percorrido ou onde o jogador se encontra
        // "@": Local onde há uma surpresa;

        String print[] = {"                 o",                             // nível 0
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
    }

    public void printTabuleiro(int nivel, int direcao) {
        //System.out.println("teste");
        switch(nivel) {
            case -1:                                    break; // Para impressão sem modificações no tabuleiro
            case 0: print[0] = modificaNivel0();        break;
            case 1: print[1] = modificaNivel1(direcao); break;
            case 2: print[2] = modificaNivel2(direcao); break;
            case 3: print[3] = modificaNivel3(direcao); break;
            case 4: print[4] = modificaNivel4(direcao); break;
            case 5: print[5] = modificaNivel5(direcao); break;
            case 6: print[6] = modificaNivel6(direcao); break;
            case 7: print[7] = modificaNivel7(direcao); break;
            case 8: print[8] = modificaNivel8(direcao); break;
        }
        //System.out.println("teste2");

        for (String i: print)
            System.out.println(i);

        //System.out.println("teste3");
    }

    private String modificaNivel0() {
        return "                 #";
    }

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
            case 0: return " #   o   o   o   o   o   o   o   o\n";
            case 1: return " o   #   o   o   o   o   o   o   o\n";
            case 2: return " o   o   #   o   o   o   o   o   o\n";
            case 3: return " o   o   o   @   o   o   o   o   o\n";
            case 4: return " o   o   o   o   #   o   o   o   o\n";
            case 5: return " o   o   o   o   o   #   o   o   o\n";
            case 6: return " o   o   o   o   o   o   #   o   o\n";
            case 7: return " o   o   o   o   o   o   o   @   o\n";
            default: return " o   o   o   o   o   o   o   o   #\n";
        }
    }
}
