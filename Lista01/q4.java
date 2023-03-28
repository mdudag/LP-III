import java.util.Scanner;

public class q4 {
  public static void main(String args[]) {
    /* 
      TAM é a quantidade de coordenadas e o tamanho do tabuleiro
      tamVet é o tamanho do vetor que serão guardadas as coordenadas, linha e coluna, nessa ordem
    */
    final int TAM = 5, tamVet = TAM*2;             
    int i, j=0, k, iguais;
    int p1[] = {0, 3, 1, 1, 2, 3, 3, 2, 4, 0}, p2[] = {0, 1, 0, 4, 1, 1, 2, 4, 3, 2};   
    String tabul1[][], tabul2[][];

   
    // Criando dois arrays do tipo int
    // p1 = new int[tamVet];
    // p2 = new int[tamVet];
    
    // Criando dois arrays bidimensionais de strings
    tabul1 = new String[TAM][TAM];
    tabul2 = new String[TAM][TAM];

    Scanner ler = new Scanner(System.in);
    
    System.out.printf("Welcome to Battleship!!!\n      -----------\n");
    System.out.printf("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.\n\n"); 

    // Atribue as coordenadas informadas pelo player 1 no vetor p1
    /* for (i=0; i < tamVet;) {
      
      // Como o i é incrementado de 2 em 2, ele é dividido por 2 para se ter a ordem correta, de 1 em 1
      System.out.printf("Enter ship %d location: ", i/2+1);
      // Atribui linha e coluna, nessa ordem, no array p1
      p1[i] = ler.nextInt();
      p1[i+1] = ler.nextInt();
      // Se a coordenada estiver fora do intervalo [0, N-1], o escopo do if é executado
      if ((p1[i] < 0) || (p1[i+1] < 0) || (p1[i] > (TAM-1)) || (p1[i+1] > (TAM-1))) {
        System.out.println("\nInvalid coordinates. Choose different coordinates.");
        
        // Retorna ao início do loop para ser colocada uma coordenada válida na mesma posição do array
        continue;
      }
      iguais=0;
      
      // O escopo do if é executado quando temos mais de uma coordenada no array para analisar se temos coordenadas iguais
      if (j != 0) {   // se não for a primeira iteração
        
        // j-2 representa a linha da coordenada anterior
        for (k=0; k <= j-2; k++) {   
          
          // Se as coordenadas são iguais, voltamos para o inicio do loop principal
          if ((p1[k] == p1[j]) && (p1[k+1] == p1[j+1])){
            System.out.println("\nYou already have a ship there. Choose different coordinates.");
            ++iguais; break;
          }
        }
        if (iguais == 1) continue;
      }
      // Incremento de 2 em 2 por causa da linha e coluna que são acrescentadas no array em uma iteração
      i = j += 2;
    } */

    System.out.printf("\n"); 
    
    // Colocando os "navios", através das coordenadas que estão no array p1, no array tabul1
    for (i=0; i < tamVet;) {
      tabul1 [p1[i]] [p1[i+1]] = "@";
      
      i += 2;
    }  

    // Posições das colunas
    System.out.println("   0  1  2  3  4");

    // Coloca um - nas posições restantes, sem o navio, e imprime o que tem no array tabul1
    for (i=0; i<TAM; i++) {
      // Coloca a posição das linhas
      System.out.print(i);
      
      for (j=0; j<TAM; j++) {
        if (tabul1[i][j] != "@") tabul1[i][j] = "-";
        System.out.print("  " + tabul1[i][j]);
      }

      System.out.printf("\n");
    }

    // Mesmas instruções para o player 2 

    System.out.printf("\nPLAYER 2, ENTER YOUR SHIPS’ COORDINATES.\n\n"); 
    j=0;
    
    // Atribue as coordenadas informadas pelo player 2 no vetor p2
    /* for (i=0; i < tamVet;) {
      
      // Como o i é incrementado de 2 em 2, ele é dividido por 2 para se ter a ordem correta, de 1 em 1
      System.out.printf("Enter ship %d location: ", i/2+1);
      // Atribui linha e coluna, nessa ordem, no array p2
      p2[i] = ler.nextInt();
      p2[i+1] = ler.nextInt();
      // Se a coordenada estiver fora do intervalo [0, N-1], o escopo do if é executado
      if ((p2[i] < 0) || (p2[i+1] < 0) || (p2[i] > (TAM-1)) || (p2[i+1] > (TAM-1))) {
        System.out.println("\nInvalid coordinates. Choose different coordinates.");
        
        // Retorna ao início do loop para ser colocada uma coordenada válida na mesma posição do array
        continue;
      }
      iguais=0;
      
      // O escopo do if é executado quando temos mais de uma coordenada no array para analisar se temos coordenadas iguais
      if (j != 0) {   // se não for a primeira iteração
        
        // j-2 representa a linha da coordenada anterior
        for (k=0; k <= j-2; k++) {   
          
          // Se as coordenadas são iguais, voltamos para o inicio do loop principal
          if ((p2[k] == p2[j]) && (p2[k+1] == p2[j+1])){
            System.out.println("\nYou already have a ship there. Choose different coordinates.");
            ++iguais; break;
          }
        }
        if (iguais == 1) continue;
      }
      // Incremento de 2 em 2 por causa da linha e coluna que são acrescentadas no array em uma iteração
      i = j += 2;
    } */
    
    System.out.printf("\n"); 
    
    // Colocando os "navios", através das coordenadas que estão no array p2, no array tabul2
    for (i=0; i < (tamVet);) {
      tabul2 [p2[i]] [p2[i+1]] = "@";
      
      i += 2;
    }

    // Posições das colunas
    System.out.println("   0  1  2  3  4");

    // Coloca um - nas posições restantes, sem o navio, e imprime o que tem no array tabul2
    for (i=0; i<TAM; i++) {
      // Coloca a posição das linhas
      System.out.print(i);
      
      for (j=0; j<TAM; j++) {
        if (tabul2[i][j] != "@") tabul2[i][j] = "-";
        System.out.print("  " + tabul2[i][j]);
      }

      System.out.printf("\n");
    }

    // JOGANDO...
    
    // Tamanho do array que guardará todas as coordenadas possíveis (linha e coluna)
    int tamPcoord = TAM*TAM + TAM*TAM;  
    
    // Arrays para guardar as coordenadas ditas pelo player 1 e 2
    int coordP1[], coordP2[];  
    
    // Usados para finalizar os loops
    int l, m, n, cond;

    // Usados para saber se o player já encontrou todos os navios
    int quantNaviosP1=0, quantNaviosP2=0;

    coordP1 = new int[(tamPcoord)];
    coordP2 = new int[(tamPcoord)];

    // Escondendo os navios dos dois tabuleiros novamente
    for (i=0; i < tamVet;) {
      tabul1 [p1[i]] [p1[i+1]] = "-";
      tabul2 [p2[i]] [p2[i+1]] = "-";
      
      i += 2;
    }

    j = k = 0;

    for (i=0 ;;) {
      System.out.print("\nPlayer 1, enter hit row/column: ");

      // Atribui linha e coluna, nessa ordem, no array 
      coordP1[i] = ler.nextInt();
      coordP1[i+1] = ler.nextInt();
      
      // Se a coordenada estiver fora do intervalo [0, N-1], o escopo do if é executado
      if ((coordP1[i] < 0) || (coordP1[i+1] < 0) || (coordP1[i] > (TAM-1)) || (coordP1[i+1] > (TAM-1))) {
        System.out.println("\nInvalid coordinates. Choose different coordinates.");
        
        // Retorna ao início do loop para o player 1 fornecer uma coordenada válida
        continue;
      }

      iguais=0;
      
      // O escopo do if é executado quando temos mais de uma coordenada no array para analisar se temos coordenadas iguais
      if (j != 0) {   // se não for a primeira iteração
        
        // j-2 representa a linha da coordenada anterior
        for (l=0; l <= j-2;) {   
          
          // Se as coordenadas são iguais, voltamos para o inicio do loop principal
          if ((coordP1[l] == coordP1[j]) && (coordP1[l+1] == coordP1[j+1])){
            System.out.println("\nYou already have a ship there. Choose different coordinates.");
            
            ++iguais; break;
          }

          l += 2;
        }

        if (iguais == 1) continue;
      }

      int aux=0;
       
      for (l=0; l < (tamVet-1);) {
        
        // Para saber se alguma das coordenadas que contém navios é a mesma da informada pelo player 
        if ((coordP1[i] == p2[l]) && (coordP1[i+1] == p2[l+1])) {
          ++quantNaviosP1; ++aux;

         System.out.printf("\nPLAYER 1 HIT PLAYER %d’s SHIP!!\n\n", quantNaviosP1);

          // Coloca-se um X na coordenada informada no tabuleiro onde foi encontrado um navio
         tabul2 [coordP1[i]] [coordP1[i+1]] = "X";
         break;
        }

        l += 2;
      }

      // Não foi encontrado nenhum navio na coordenada informada
      if (aux==0) {
        System.out.println("\nPLAYER 1 MISSED!\n");
      
        tabul2 [coordP1[i]] [coordP1[i+1]] = "O";
      }
      
      // Imprime o estado do tabuleiro
      
      // Posições das colunas
      System.out.println("   0  1  2  3  4");

      for (m=0; m<TAM; m++) {
        // Coloca a posição das linhas
        System.out.print(m);
        
        for (n=0; n<TAM; n++) 
          System.out.print("  " + tabul2[m][n]);
        
        System.out.printf("\n");
      }

      // Se o player 1 tiver encontrado todos os navios
      if (quantNaviosP1 == TAM)  {
        
        // Variável é reutilizada para guardar o número do player vencedor
        quantNaviosP1 = 1;
        break;
      }

      // PLAYER 2 JOGANDO
      
      cond=1;

      // Loop para que o player 2 coloque uma nova coordenada caso seja informada uma coordenada inválida
      for (; cond == 1;) {
        System.out.print("\nPlayer 2, enter hit row/column: ");

        // Atribui linha e coluna, nessa ordem, no array 
        coordP2[i] = ler.nextInt();
        coordP2[i+1] = ler.nextInt();
  
        // Se a coordenada estiver fora do intervalo [0, N-1], o escopo do if é executado
        if ((coordP2[i] < 0) || (coordP2[i+1] < 0) || (coordP2[i] > (TAM-1)) || (coordP2[i+1] > (TAM-1))) {
          System.out.println("\nInvalid coordinates. Choose different coordinates.");
          
          // Retorna ao início do loop para o player 2 fornecer uma coordenada válida
          continue;
        }
  
        iguais=0;
        
        // O escopo do if é executado quando temos mais de uma coordenada no array para analisar se temos coordenadas iguais
        if (k != 0) {   // se não for a primeira iteração
          
          // k-2 representa a linha da coordenada anterior
          for (l=0; l <= k-2;) {   
            
            // Se as coordenadas são iguais, voltamos para o início do loop
            if ((coordP2[l] == coordP2[k]) && (coordP2[l+1] == coordP2[k+1])){
              System.out.println("\nYou already have a ship there. Choose different coordinates.");
              ++iguais; break;
            }
  
            l += 2;
          }
  
          if (iguais == 1) continue;
        }
        
        // Caso não haja nenhum porblema com a coordenada, cond é decrementado para finalizar o loop na proxima iteração
        --cond;
      } 

      aux=0;

      // Para saber se alguma das coordenadas que contém navios é a mesma da informada pelo player 
      for (l=0; l < (tamVet-1);) {
        if ((coordP2[i] == p1[l]) && (coordP2[i+1] == p1[l+1])) {
         ++quantNaviosP2; ++aux;
         
         System.out.printf("\nPLAYER 2 HIT PLAYER %d’s SHIP!!\n\n", quantNaviosP2);

          // Coloca-se um X na coordenada informada no tabuleiro onde foi encontrado um navio
         tabul1 [coordP2[i]] [coordP2[i+1]] = "X";
          
         break;
        }

        l += 2;
      }

      // Não foi encontrado nenhum navio na coordenada informada
      if (aux==0) {
        System.out.println("\nPLAYER 2 MISSED!\n");
      
        tabul1 [coordP2[i]] [coordP2[i+1]] = "O";
      }

      // Imprime o estado do tabuleiro

      // Posições das colunas
      System.out.println("   0  1  2  3  4");

      for (m=0; m<TAM; m++) {
        // Coloca a posição das linhas
        System.out.print(m);
        
        for (n=0; n<TAM; n++) 
          System.out.print("  " + tabul1[m][n]);
        
        System.out.printf("\n");
      }

      // Se o player 2 tiver encontrado todos os navios
      if (quantNaviosP2 == TAM)  {

        // Variável é reutilizada para guardar o número do player vencedor
        quantNaviosP1 = 2;
        break;
      }
         
      // Incremento de 2 em 2 por causa da linha e coluna que são acrescentadas no array em uma única iteração
      i = j = k += 2;
    }

    System.out.printf("\nPLAYER %d WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n\nFinal boards:\n\n", quantNaviosP1);

    // Se player 1 ganhar
    if (quantNaviosP1 != 2) {
      for (i=0; i < (tamVet-1);) {
        
        // Mostra os navios que não foram encontrados pelo player 2
        if (tabul1 [p1[i]] [p1[i+1]] != "X") 
          tabul1 [p1[i]] [p1[i+1]] = "@";

        i += 2;
      }
    }
    // Se player 2 ganhar
    else { 
      for (i=0; i < (tamVet-1);) {

        // Mostra os navios que não foram encontrados pelo player 1
        if (tabul2 [p2[i]] [p2[i+1]] != "X") 
          tabul2 [p2[i]] [p2[i+1]] = "@";
        
        i += 2;
      }
    }

    // Imprimindo o estado final dos dois tabuleiros

    // Posições das colunas
    System.out.println("   0  1  2  3  4");

    for (i=0; i<TAM; i++) {
      // Coloca a posição das linhas
      System.out.print(i);
      
      for (j=0; j<TAM; j++) {
        System.out.print("  " + tabul1[i][j]);
      }

      System.out.printf("\n");
    }

    System.out.println("\n");

    // Posições das colunas
    System.out.println("   0  1  2  3  4");

    for (i=0; i<TAM; i++) {
      // Coloca a posição das linhas
      System.out.print(i);
      
      for (j=0; j<TAM; j++) {
        System.out.print("  " + tabul2[i][j]);
      }

      System.out.printf("\n");
    }
  }
}
