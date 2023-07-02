package projeto;

abstract public class Desconhecido {
    private int quantAjudas;

    public Desconhecido() {
        quantAjudas = 0;
    }

    public void pedirAjuda() {
        int i = MetodoStatic.getNumAleatorio(0, 1);

        System.out.println("Deseja ajudar?" + 
                           "\n  1 - Ajudar" + 
                           "\n  2 - Ignorar");
        int resp = MetodoStatic.resposta();

        tipoDeDesconhecido(i, resp);
    }

    public void desenhoDesconhecido() {
        System.out.println("\n\t     ___ ");
        System.out.println("\t    / ? \\");        
        System.out.println("\t    \\   /");      
        System.out.println("\t   _.\" \"._");           
        System.out.println("\t  /       \\");    
        System.out.println("\t |         |");         
        System.out.println("\t ||       ||");       
        System.out.println("\t ||       ||");        
        System.out.println("\t ||       ||");        
        System.out.println("\t \\'._____,'/");
    }

    public void tipoDeDesconhecido(int tipo, int resp) {
        switch (resp) {
        case 1: 
            int i = MetodoStatic.getNumAleatorio(10, 50);

            if (tipo==0) ladrao(i);
            else         pessoaFerida(i);

            if (++quantAjudas == 3) 
                System.out.println("\n+ VOCÊ GANHOU 50 MOEDAS!! +" +
                                   "\nRecompensa por escolher ajudar o desconhecido três vezes!");
        
            break;

        default:
            if (tipo==0) 
                System.out.print("\nUfa! Escapou de uma armadilha, parece que aquele desconhecido era um ladrão!");
            
            else 
                System.out.print("\nPoxa, aquela era mesmo uma pessoa precisando de ajuda, você poderia ter ganhado uma recompensa.");

            break;     
        }

        System.out.println("\nSiga seu trajeto...");
        MetodoStatic.systemPause();
    }

    public void desenhoArvore() {
        System.out.println("\t\t         .{{}}}}}}.                                  .{{}}}}}}.");   
        System.out.println("\t\t        {{{{{{(`)}}}.                               {{{{{{(`)}}}.");
        System.out.println("\t\t       {{{(`)}}}}}}}}}                             {{{(`)}}}}}}}}}");
        System.out.println("\t\t      }}}}}}}}}{{(`){{{                           }}}}}}}}}{{(`){{{");
        System.out.println("\t\t      }}}}{{{{(`)}}{{{{                           }}}}{{{{(`)}}{{{{"); 
        System.out.println("\t\t     {{{(`)}}}}}}}{}}}}}                         {{{(`)}}}}}}}{}}}}}");  
        System.out.println("\t\t    {{{{{{{{(`)}}}}}}}}}}                       {{{{{{{{(`)}}}}}}}}}}");
        System.out.println("\t\t    {{{{{{{}{{{{(`)}}}}}}                       {{{{{{{}{{{{(`)}}}}}}");
        System.out.println("\t\t     {{{{{(`)   {{{{(`)}'                        {{{{{(`)   {{{{(`)}'");    
        System.out.println("\t\t      `\"\"'\" |   | \"'\"'`                           `\"\"'\" |   | \"'\"'`");
        System.out.println("\t\t      (`)  /     \\                                     /     \\");
        System.out.println("\t\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        MetodoStatic.systemPause();
    }

    private void ladrao(int moedasPerdidas) {
        System.out.println("\nQue azar, o desconhecido não era uma pessoa ferida!" +
                           "\nEle levou " + moedasPerdidas + " moedas, mas não desanime.");
    }
    
    private void pessoaFerida(int moedasGanhas) {
        System.out.print("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
        historia();
        System.out.println("\nBoa notícia, você foi recompensado com " + moedasGanhas + " moedas.");
    }

    abstract public void historia();
}
