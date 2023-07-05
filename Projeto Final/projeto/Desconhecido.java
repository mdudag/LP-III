package projeto;

abstract public class Desconhecido {
    private int quantAjudas;

    public Desconhecido() { quantAjudas = 0; }

    public int pedirAjuda() {
        int i = MetodoStatic.getNumAleatorio(0, 1);

        System.out.println("Deseja ajudar?" + 
                           "\n  1 - Ajudar" + 
                           "\n  2 - Ignorar");
        int resp = MetodoStatic.respostaInt();

        return tipoDeDesconhecido(i, resp);
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

    public int tipoDeDesconhecido(int tipo, int resp) {
        int aux=0;
        
        switch (resp) {
        case 1: 
            int i = MetodoStatic.getNumAleatorio(10, 50);
            
            if (tipo==0) aux =  ladrao(i);
            else         aux =  pessoaFerida(i);

            if (++quantAjudas == 3) {
                System.out.println("\n+ VOCÊ GANHOU 50 MOEDAS!! +" +
                                   "\nRecompensa por escolher ajudar o desconhecido três vezes!");
                aux += 50;
            }
        
            break;

        default:
            if (tipo==0) 
                System.out.print("\nUfa! Escapou de uma armadilha, parece que aquele desconhecido era um ladrão!");
            
            else 
                System.out.print("\nPoxa, aquela era mesmo uma pessoa precisando de ajuda, você poderia ter ganhado uma recompensa.");

            break;     
        }

        System.out.println("\nSiga seu trajeto...");

        return aux;
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

    private int ladrao(int moedasPerdidas) {
        System.out.println("\nQue azar, o desconhecido não era uma pessoa ferida!" +
                           "\nEle levou " + moedasPerdidas + " moedas, mas não desanime.");
        return -moedasPerdidas;
    }
    
    private int pessoaFerida(int moedasGanhas) {
        System.out.print("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
        historia();
        System.out.println("\nBoa notícia, você foi recompensado com " + moedasGanhas + " moedas.");

        return moedasGanhas;
    }

    abstract public void historia();
}
