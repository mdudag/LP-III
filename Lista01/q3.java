import java.util.Scanner;

public class q3 {
  public static void main(String args[]) {
    int resp, dado1, dado2, soma, lanc=0, ponto=0;

    Scanner ler = new Scanner(System.in);

    for (;;) {
      System.out.print("\nJogue os dados\n\n (1) Jogar\n (0) Sair  ");
      resp = ler.nextInt();

      if (resp==0) break;

      // atribuindo valores aos dados e os somando
      dado1 = (int) (1 + Math.random() * 6);
      dado2 = (int) (1 + Math.random() * 6);
      soma = dado1 + dado2;

      System.out.printf("\nDado 1: %d   -   Dado 2: %d", dado1, dado2);

      // se passou de 1 lançamento, então entramos no 2º estágio
      if (++lanc > 1) 
        System.out.printf("\nJogada %d: %d\n",lanc-1, soma);

      switch (soma) {
      case 7:
        if (lanc==1) {
          System.out.print("\nParabéns!! Você venceu! :D");
          System.exit(1);
        }
        
        System.out.print("\nNão foi dessa vez, você perdeu :(");
        System.exit(1);
        
      case 11:
        if (lanc==1) {
          System.out.print("\nParabéns!! Você venceu! :D");
          System.exit(1);
        }
        
        break;

      case 2: case 3: case 12:
        if (lanc==1) {
          System.out.print("\nNão foi dessa vez, você perdeu :(");
          System.exit(1);
        }

        break;

      default:     // case 4: case 5: case 6: case 8: case 9: case 10:
        if (lanc==1) {
          ponto = soma;
          System.out.printf("\nPonto: %d\n\nIniciando estágio 2\n      ----", ponto);
        }
        else if (ponto == soma) {
          System.out.print("\nParabéns!! Você venceu! :D");
          System.exit(1);
        }
      }
    }
  }
}
