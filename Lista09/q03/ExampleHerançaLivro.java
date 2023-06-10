package q03;

public class ExampleHerançaLivro {
    public static void main(String args[]) {
        Livro l = new Livro("A Sociedade do Anel: O Senhor dos Anéis", 
                             "John Ronald Reuel Tolkien", 
                            608, 
                            2022);

        LivroBiblioteca lB = new LivroBiblioteca("A Sociedade do Anel: O Senhor dos Anéis", 
                                                  "John Ronald Reuel Tolkien", 
                                                 608, 
                                                 2022,
                                                 true,
                                                 12, 6, 2023);

        LivroLivraria lL = new LivroLivraria("A Sociedade do Anel: O Senhor dos Anéis", 
                                              "John Ronald Reuel Tolkien", 
                                             608, 
                                             2022,
                                              26.48f,
                                            1000);
        
        System.out.println(l.toString() + "\n");
        System.out.println(lB.toString() + "\n");
        System.out.println(lL.toString() + "\n");
    }
}
