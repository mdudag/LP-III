package q06;

import q05.ItemBiblioteca;
import q05.LivroBiblioteca;

public class ExampleMapaELivroDeBiblioteca {
    public static void main(String args[]) {
        ItemBiblioteca lB1 = new LivroBiblioteca("A Sociedade do Anel: O Senhor dos Anéis", 
                                         "John Ronald Reuel Tolkien", 
                                        608, 
                                        2022,
                                        true,
                                        "AT123");

        ItemBiblioteca lB2 = new LivroBiblioteca("Coraline", 
                                         "Neil Gaiman", 
                                        162, 
                                        2012,
                                        false,
                                        "BC123");

        ItemBiblioteca mp1 = new MapaBiblioteca("MAPA MUNDI - PLANISFÉRIO POLÍTICO",
                                      2018,
                                      "1:25000000",
                                      "AlgumaDescriçãoSumária",
                                      false,
                                      "AAB56");

        ItemBiblioteca mp2 = new MapaBiblioteca("MAPA DO BRASIL",
                                      2022,
                                      "1:24000000",
                                      "AlgumaDescriçãoSumária2",
                                      false,
                                      "BAB56");

        printItemBiblioteca(lB1, 1);
        printItemBiblioteca(lB2, 2);
        printItemBiblioteca(mp1, 1);
        printItemBiblioteca(mp2, 2);

        System.out.println();
    } 

    static public void printItemBiblioteca(ItemBiblioteca item, int num) {
        if (item instanceof LivroBiblioteca)
            printLivroBiblioteca(item, num);
        else
            printMapaBiblioteca(item, num);
    }

    static public void printLivroBiblioteca(ItemBiblioteca lB, int num) {
        System.out.println(String.format("\nLIVRO %d DA BIBLIOTECA\n", num));
        System.out.println(lB.toString() + "\n");

        System.out.println("Emprestando... ");
        lB.emprestar();
        System.out.print("Estado do livro: ");
        estadoItemBiblioteca(lB.estaEmprestado());
        
        System.out.println("Devolvendo... ");
        lB.devolver();
        System.out.print("Estado do livro: ");
        estadoItemBiblioteca(lB.estaEmprestado());

        System.out.println("\nDescrição Sumária:\n"+lB.descricaoSumaria());
    }

    static public void printMapaBiblioteca(ItemBiblioteca mp, int num) {
        System.out.println(String.format("\nMAPA %d DA BIBLIOTECA\n", num));
        System.out.println(mp.toString() + "\n");

        System.out.println("Emprestando... ");
        mp.emprestar();
        System.out.print("Estado do mapa: ");
        estadoItemBiblioteca(mp.estaEmprestado());
        
        System.out.println("Devolvendo... ");
        mp.devolver();
        System.out.print("Estado do mapa: ");
        estadoItemBiblioteca(mp.estaEmprestado());

        System.out.println("\nDescrição Sumária:\n"+mp.descricaoSumaria());
    }

    static public void estadoItemBiblioteca(boolean emprestado) {
        if (emprestado) System.out.println("emprestado");
        else System.out.println("na pratileira");
    }
}
