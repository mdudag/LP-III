public class q1 {
  public static void main(String args[]) {
    //   1. Tipos de Operadores em Java   
  
    /* Operadores bit a bit  */

    // => bit a bit AND (&)
    
    // Para o argumento ser verdadeiro, os componentes precisam ser todos verdadeiros. Esse operador, diferente do lógico, analisa todos os componentes, independente do valor lógico, antes de avaliar se o argumento é verdadeiro ou falso. 

    int x=-10, y=4, z=0;

    System.out.println("\nValor lógico: " + (x>y & y>z));

    // => bit a bit OR (^)

    // Para este operador não importa se algum dos operando tem o valor true, ele vai verificar todos os operandos que estiverem na expressão.
    
    System.out.println("Valor lógico: " + (x<y | y>z | z==x));
    
    // => bit a bit exclusive OR (|)

    // Se os bits comparados forem diferentes, retorna 1, senão retorna 0

    x=4; y=10;

    System.out.printf("Valor: %d\n", x^y);
    
    /* Operadores Compostos e de Atribuição*/

    // => Incremento (++): incrementa mais 1 ao valor
    
    // => Decremento (--): decrementa menos 1 ao valor
    
    // => Atribuição-adição (+=): soma a variável a algum valor ou variável e atribui a ela mesma
    
    // => Atribuição-subtração (−=): subtrai a variável a algum valor ou variável e atribui a ela mesma
    
    // => Atribuição-multiplicação (*=): multiplica a variável por algum valor ou variável e atribui a ela mesma
    
    // => Atribuição-divisão (/=): divide a variável por algum valor ou variável e atribui a ela mesma
    
    // => Atribuição-resto (%=): divide a variável por algum valor ou variável e atribui o resto da divisão a ela mesma
    
    x=5; y=9; z=3;
    System.out.printf("\nIncrementando x: %d\nDecrementando y: %d\n", ++x, --y);

    x *= 3; y /= 2; z %= 2;
    System.out.printf("\nNovo valor de x: %d\nNovo valor de y: %d\nResto da divisão inteira de z por 2: %d\n", x, y, z);

    //   2. Precedência de Operadores em Java

    // => A precedência dos operadores funciona da mesma forma que na matemática. Operações de multiplicação e divisão são calculados antes do que os de adição e subtração, e na ordem que aparecem, porém os parênteses são os que possuem maior precedência a todos.
    
    int n1, n2;
    x=4; y=-2; z=16;

    n1 = x+y*z;   
    n2 = (x+y)*z;  

    System.out.printf("\nN1: %d,  N2: %d", n1, n2);

    //   3. Operador Ternário

    // => Possui objetivo similar ao do if/else, mas que é codificado em apenas uma linha. Caso a primeira condição (que se encontra após "?") seja verdadeira, ela é executada, senão a seguinte é executada (que se encontra após ":")

    int maior;
    x=10; y=5; 

    maior = (x>y) ? x : y;
    System.out.printf("\nMaior: %d", maior);
  }
}
