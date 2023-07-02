package projeto;

public class LagoNoCaminho {
    protected void desenhoDoLago() {
        System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t   ~      ~  ~    ~  ~     ~      ~  ~   "); 
        System.out.println("\t\t      ~ ~      ~ ~          ~ ~      ~ ~ ");
        System.out.println("\t\t ~         ~        ~ ~        ~      ~  "); 
        System.out.println("\t\t_________________________________________\n");
    }
    
    protected void darVoltaNoLago() {
        System.out.println("\nAndar em volta do lago tem seus perigos, cuidado com ladrões.");
        MetodoStatic.systemPause();
        
        int i = MetodoStatic.getNumAleatorio(0, 1);
        
        if (i==0) {
            i = MetodoStatic.getNumAleatorio(10, 20);
            System.out.println("Você foi roubado!! O ladrão levou " + i + " moedas.");

            if (JogoTabuleiro.nivelAtual != 8)
                System.out.println("Continue jogando para tentar recuperá-las!");
            }
            else {
            System.out.println("Você consegiu dar a volta no lago sem problemas! ");
            if (JogoTabuleiro.nivelAtual != 8)
                System.out.println("Continue seu trajeto.");
            System.out.println();
        }
    }

    protected void irNadando() {
        System.out.println("\nCuidado com inimigos próximos a você no lago, guarde bem suas moedas.");
        MetodoStatic.systemPause();
        
        int i = MetodoStatic.getNumAleatorio(0, 1);
        
        if (i==0) {
            i = MetodoStatic.getNumAleatorio(10, 20);
            System.out.println("Você saiu da água, mas levaram " + i + " moedas.");

            if (JogoTabuleiro.nivelAtual != 8)
                System.out.println("Continue jogando para tentar recuperá-las!");
        }
        else {
            System.out.println("Você consegiu sair do lago sem problemas! ");
            
            if (JogoTabuleiro.nivelAtual != 8)
                System.out.println("Continue seu trajeto.");
            System.out.println();
        }
    }

    protected void pedirAjudaNoLago() {
        System.out.println("\nHá alguém com uma canoa");
        desenhoCanoaNoLago();
        System.out.println("Ele irá te ajudar a atravessar o lago, mas pode ser que te cobre por isso...");
        MetodoStatic.systemPause();
        
        int i = MetodoStatic.getNumAleatorio(0, 1);

        if (i==0) {
            System.out.print("Você conseguiu atravessar o lago e nada foi cobrado! ");
            
            if (JogoTabuleiro.nivelAtual != 8)
            System.out.println("Continue jogando.");
            System.out.println();
        }
        else {
            i = MetodoStatic.getNumAleatorio(2, 10);
            System.out.println("Finalmente, você chegou do outro lado do lago! Porém perdeu algumas moedas...");
            System.out.println("\n | Moedas perdidas: " + i + " |\n");
            if (JogoTabuleiro.nivelAtual != 8)
            System.out.println("Continue jogando para tentar recuperá-las!");
        }
    }
    
    protected void desenhoCanoaNoLago() {
        System.out.println("\n\n\t\t                       _________ ");
        System.out.println("\t\t                       \\ - - - /  ");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
    }
}
