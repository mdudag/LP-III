package q05;

public class ExampleHerançaAluno {
    AlunoGraduacao alunoG = new AlunoGraduacao("Maria Guedes", 
                                          123456789, 
                                            10, 3, 2023, 
                                           1, 
                                          "Letras", 
                                          true);

    AlunoPosgraduação alunoPG = new AlunoPosgraduação("Maria Guedes", 
                                                 123456789, 
                                                   10, 3, 2023, 
                                                  1, 
                                                 "Letras", 
                                                 true,
                                            "Ismar Santos",
                                         "UmTituloQualquer",
                                                     'M');

    AlunoMestrado alunoM = new AlunoMestrado("Maria Guedes", 
                                        123456789, 
                                        10, 3, 2020, 
                                        1, 
                                        "Letras", 
                                        true,
                                "Ismar Santos",
                                "UmTituloQualquer");

    AlunoMestrado alunoD = new AlunoMestrado("Maria Guedes", 
                                        123456789, 
                                        10, 3, 2020, 
                                        1, 
                                        "Letras", 
                                        true,
                                "Ismar Santos",
                                "UmTituloQualquer");

    System.out.println(alunoG.toString() + "\n");
    System.out.println(alunoPG.toString() + "\n");
    System.out.println(alunoM.toString() + "\n");
    System.out.println(alunoD.toString() + "\n");
}
