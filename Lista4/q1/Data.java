public class Data {
  private int dia;
  private int mes;
  private int ano;
  
  // Método Getter
  
  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

  // Método Setter
  
  public void setDia(int dia) {
    this.dia = dia;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  // Métodos da classe

  public void inicializarData(int d, int m, int a) {
    if (verificarData(d, m, a)) {
      dia = d;
      mes = m;
      ano = a;

      System.out.printf("\n- Data inicializada -");
    }
    else 
      System.out.printf("\nErro ao inicializar!! Data inválida!");
  }

  private boolean verificarDia(int d, int a, int b) {
    return ((d >= a) && (d <= b)) ? true : false;
  }

  private boolean verificarMes(int m) {
    return ((m >= 1) && (m <= 12)) ? true : false;
  }

  public boolean verificarData(int d, int m, int a) {
    
    // Se o ano for bissexto, só interfere em fevereiro
    if (a%4 == 0) {
      if (a%100 == 0) {
        if (a%400 == 0) {
          if (m == 2)  
            return verificarDia(d, 1, 29);
        }
      }
      else {
        if (m == 2) 
          return verificarDia(d, 1, 29);
      }
    }
  
    if (verificarMes(m)) {
      // Mês de fevereiro
      if (m == 2)
        return verificarDia(d, 1, 28);
      
      // Mês com 31 dias
      int aux = m/2;
      
      if ((m >= 1 && m <= 7) && (aux != 0) ||
          (m >= 8 && m <= 12) && (aux == 0)) 
        return verificarDia(d, 1, 31);
        
      // Mês com 30 dias
      else 
        return verificarDia(d, 1, 30);
    }

    return false;
  }

  public void imprimirData() {
    if (verificarData(dia, mes, ano)) 
      System.out.printf("%d/%d/%d", dia, mes, ano);
    else 
      System.out.printf("Erro ao imprimir!! Data inválida!");
  }

  private void mesEmExtenso() {
    String vetMes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    System.out.printf(vetMes[mes-1]);
  }

  public void imprimirDataExtenso() {
    if (verificarData(dia, mes, ano)) {
      System.out.printf("%d de ", dia);
      mesEmExtenso();
      System.out.printf(" de %d", ano);
    }
    else 
      System.out.printf("Erro ao imprimir!! Data inválida!");
  }
}
