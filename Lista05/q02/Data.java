import java.lang.Math;

public class Data {
  private int dia;
  private int mes;
  private int ano;

  public Data(int d, int m, int a) {
    if (verificarData(d, m, a)) {
      dia = d;
      mes = m;
      ano = a;
    }
    else
      dia = mes = ano = 0;
  }
  
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

  // Outros métodos da classe

  public boolean verificarData(int d, int m, int a) {
    
    // Se o ano for bissexto, só interfere em fevereiro
    if (anoBissexto(a)) {
      if (m == 2)  
        return verificarDia(d, 1, 29);
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

  private boolean anoBissexto(int a) {
    if (a%4 == 0) {
      if (a%100 == 0) { 
        if (a%400 == 0) 
          return true;
      }
      else
        return true;
    }

    return false;
  }

  private boolean verificarDia(int d, int a, int b) {
    return ((d >= a) && (d <= b)) ? true : false;
  }

  private boolean verificarMes(int m) {
    return ((m >= 1) && (m <= 12)) ? true : false;
  }

  public boolean isPrevious(Data outraData) {  
    int outroAno = outraData.getAno();
    int outroMes = outraData.getMes();
    int outroDia = outraData.getDia();
    
    if (outroAno < ano)  
      return true;
      
    else if (outroAno == ano) {
      if (outroMes < mes)
        return true;
      else if (outroMes == mes) {
        if (outroDia < dia)
          return true;
      }
    }
    
    return false;
  } 

  public long howManyDays(Data outraData, Data data) {
    long data1 = dataEmValor(data);
    long data2 = dataEmValor(outraData);

    return (data2 - data1);
  }
  
  private long dataEmValor(Data data) {
    if (verificarData(data.getDia(), data.getMes(), 
                      data.getAno()) == false) {
      System.out.println("Data inválida!!");
      return 0;
    } 
      
    int ano = data.getAno();
    int mes = data.getMes();
    int dia = data.getDia();
    
    long anosEmDias = quantAnosEmDias(ano);
    int mesesEmDias = quantMesesEmDias(mes, ano);
   
    return (long) (anosEmDias + mesesEmDias + (dia-1));
  }

  private long quantAnosEmDias(int a) {
    // Atribui a "anos" o produto da quant de dias em 1 ano vezes o ano da data
    long anos = 365 * (a-1);
    
    for (int i=1; i < a; i++) {
      if (anoBissexto(i)) 
        anos++;
    } 
      
    return anos;
  }

  private int quantMesesEmDias(int m, int a) {
    int meses = 0;
    
    for (int i=1; i<m; i++) 
      meses += quantDiasNoMes(i, a);
    
    return meses;
  }

  private int quantDiasNoMes(int m, int a) {
    if (m == 2) {
      if (anoBissexto(a))
        return 29;
  
      return 28;
    }

    // Mês com 31 dias
    int aux = m%2;
    
    if ((m >= 1 && m <= 7) && (aux != 0) ||
        (m >= 8 && m <= 12) && (aux == 0)) 
      return 31;
      
    // Mês com 30 dias
    else 
      return 30;
  } 

  public String dayOfWeek(Data data) {
    Data dataAux = new Data(1, 5, 2023);
    long quantDias = Math.abs(howManyDays(data, dataAux));
    String diaDaSemana[] = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", 
                            "Quinta-feira", "Sexta-feira", "Sábado"}; 

    // Se a data utilizada como referência for anterior a data do objeto
    if (isPrevious(dataAux) == true) {
      // É incrementado para que vá até a própria data 
      quantDias = ++quantDias % 7;
    }
    else {
      // É decrementado para que vá até a própria data, 
      // sendo ela anterior à data utilizada como referência
      quantDias = --quantDias % 7;
      
      if (quantDias != 0)
        // Conserta a ordem dos dias que estava invertida
        quantDias = 7 - quantDias;
    }

    return diaDaSemana[(int) quantDias];
  }

  // ------------------------------

  public void imprimirData() {
    if (verificarData(dia, mes, ano)) 
      System.out.printf("%d/%d/%d", dia, mes, ano);
    else 
      System.out.printf("Erro ao imprimir!! Data inválida!");
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
  
  private void mesEmExtenso() {
    String vetMes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
                       "Junho", "Julho", "Agosto", "Setembro", 
                       "Outubro", "Novembro", "Dezembro"};

    System.out.printf(vetMes[mes-1]);
  }
}
