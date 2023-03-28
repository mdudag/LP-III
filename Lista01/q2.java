import java.util.Scanner;

public class q2 {
  public static void main(String args[]) {
    final int N = 10;
    double medVolt[], media=0, desvPadr=0;
    int i;

    // array para guardar os valores medidos para usar no cálculo do desvio padrão posteriormente
    medVolt = new double[N];

    System.out.printf("\nMedições de Voltagem\n\n");

    // atribuindo valores aleatórios as posições do array e os somando na variável media
    for (i=0; i<N; i++) {
      media += medVolt[i] = Math.random() * 1000;
      System.out.printf(" %dº V: %f\n", i+1, medVolt[i]);
    } 

    media /= N;
    System.out.printf("\nMEDIA: %f", media);

    // cálculo do desvio padrão
    for (i=0; i<N; i++) 
      desvPadr += (medVolt[i] - media) * (medVolt[i] - media);
    desvPadr = Math.sqrt((desvPadr/N));
    
    System.out.printf("\nDESVIO PADRÃO: %f\n", desvPadr);

    // se o desvio padrão for maior que 10% da média, temos um multímetro defeituoso
    if (desvPadr > (media * 0.1)) 
      System.out.println("\nO multímetro encontra-se defeituoso");
    else System.out.println("\nO multímetro encontra-se operacional");
  }
}
