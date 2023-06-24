package q05;

public class ExampleLivro {
    public static void main(String args[]) {
        LivroBiblioteca lB1 = new LivroBiblioteca("O Hobbit: Uma jornada inesperada", 
                                         "Jude Fisher", 
                                        80, 
                                        2012, 
                                        false, 
                                        "HG123");

        LivroBiblioteca lB2 = new LivroBiblioteca("A Sociedade do Anel: O Senhor dos Anéis", 
                                         "John Ronald Reuel Tolkien", 
                                        608, 
                                        2022,
                                        true,
                                        "AT123");

        LivroBiblioteca lB3 = new LivroBiblioteca("Coraline", 
                                         "Neil Gaiman", 
                                        162, 
                                        2012,
                                        false,
                                        "BC123");

        printLivroBiblioteca(lB1, 1);
        printLivroBiblioteca(lB2, 2);
        printLivroBiblioteca(lB3, 3);
        System.out.println();
    } 

    static public void printLivroBiblioteca(LivroBiblioteca lB, int num) {
        System.out.println(String.format("\nLIVRO %d DA BIBLIOTECA\n", num));
        System.out.println(lB.toString() + "\n");

        System.out.println("Emprestando... ");
        lB.emprestar();
        System.out.print("Estado do livro: ");
        estadoLivro(lB.estaEmprestado());
        
        System.out.println("Devolvendo... ");
        lB.devolver();
        System.out.print("Estado do livro: ");
        estadoLivro(lB.estaEmprestado());

        System.out.println("\nDescrição Sumária:\n"+lB.descricaoSumaria());
    }

    static public void estadoLivro(boolean emprestado) {
        if (emprestado) System.out.println("emprestado");
        else System.out.println("na pratileira");
    }
}
