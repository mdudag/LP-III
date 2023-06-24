package q02;

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

  public Data() {
    dia = 1;
    mes = 1;
    ano = 1970;
  }

  public Data(Data data) {
    this(data.dia, data.mes, data.ano);
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

  // Métodos da classe
  
  public static int howManyDaysUntilEndYear(Data d) {  
    // Dava erro quando colocava dia como 31
    // Retorna a quantidade de dias da data até o final do ano dessa data
    return (int) ((d.howManyDays(30, 12, d.ano)) + 1);
  }

  public static boolean isBissexto(Data d) {
    int a = d.ano;
    
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

  public static int howManyDaysUntilNextMonth(Data d) {  
    // Retorna a quantidade de dias da data até o final do mes dessa data
    return (int) (d.howManyDays(1, d.mes+1, d.ano));
  }

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
    int outroAno = outraData.ano;
    int outroMes = outraData.mes;
    int outroDia = outraData.dia;
    
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

  public long howManyDays(int d, int m, int a) {
    long data1 = dataEmValor(dia, mes, ano);
    long data2 = dataEmValor(d, m, a);

    return (data2 - data1);
  }
  
  public long howManyDays(Data outraData) {
    return howManyDays(outraData.dia, outraData.mes, outraData.ano);
  }
  
  public long dataEmValor(Data data) {
    if (verificarData(data.dia, data.mes, 
                      data.ano) == false) {
      System.out.println("Data inválida!!");
      return 0;
    } 
      
    int ano = data.ano;
    int mes = data.mes;
    int dia = data.dia;
    
    long anosEmDias = quantAnosEmDias(ano);
    int mesesEmDias = quantMesesEmDias(mes, ano);
   
    return (long) (anosEmDias + mesesEmDias + (dia-1));
  }
  
  public long dataEmValor(int d, int m, int a) {
    if (verificarData(d, m, a) == false) {
      System.out.println("Data inválida!!");
      return 0;
    } 
    
    long anosEmDias = quantAnosEmDias(a);
    int mesesEmDias = quantMesesEmDias(m, a);
   
    return (long) (anosEmDias + mesesEmDias + (d-1));
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

  public static String dayOfWeek(Data data) {
    Data dataAux = new Data(1, 5, 2023);
    long quantDias = Math.abs(data.howManyDays(data, dataAux));
    String diaDaSemana[] = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", 
                            "Quinta-feira", "Sexta-feira", "Sábado"}; 

    // Se a data utilizada como referência for anterior a data do objeto
    if (data.isPrevious(dataAux) == true) {
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

  public void setData(Data novaData) {
    dia = novaData.dia;
    mes = novaData.mes;
    ano = novaData.ano;
  }

  public void setData(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  // public void setData(int daquiAxDias) {
  //   int aux = quantDiasNoMes(mes, ano);
  //   int incremenDosDias = daquiAxDias + dia;
     
     
  //   for (int i = 0; incremenDosDias > aux; i++) {
  //     if (i == 0)
  //       incremenDosDias = daquiAxDias - dia;
  //     else 
  //       incremenDosDias -= aux;
        
  //     ++mes;
  //     if (mes > 12) {
  //       mes = 1;
  //       ++ano;
  //     }
     
  //     aux = quantDiasNoMes(mes, ano);
  //   }

  //    dia = incremenDosDias;
  // }

  // public void setData(int primeiroDiaDoMesX) {
  //   dia = 1;
  //   mes = primeiroDiaDoMesX;
  // }
  
  public void setData(int primeiraSegundaFeiraDoMesX) {
    String diaDaSemana[] = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", 
                            "Quinta-feira", "Sexta-feira", "Sábado"};
    mes = primeiraSegundaFeiraDoMesX;
    dia = 1;
    
    Data data = new Data(dia, mes, ano);
    String aux = dayOfWeek(data);
    int i;

    for (i=0; ;i++) 
      if (diaDaSemana[i] == aux) 
        break;

    while (true) {
      if (diaDaSemana[i] == "Segunda-feira")
        break;
      
      ++dia;
      i = (i+1) % 7;
    }
  }
  // ------------------------------

  public static String dayToPrintShort(Data data) {
    if (data.verificarData(data.dia, data.mes, data.ano) == false) 
      return null;
      
    String d = Integer.toString(data.dia);
    String m = Integer.toString(data.mes);
    String a = Integer.toString(data.ano);

    // Para que o dia, mes e ano ficarem no formato com dois números 
    if (data.dia <= 9)
      d = "0" + d;
    if (data.mes <= 9)
      m = "0" + m;
    if (data.ano <= 9)
      a = "0" + a;
    
    return d + "/" + m + "/" + a;
  }

  public String getData() {
    String d = Integer.toString(dia);
    String m = Integer.toString(mes);
    String a = Integer.toString(ano);

    // Para que o dia, mes e ano ficarem no formato com dois números 
    if (dia <= 9)
      d = "0" + dia;
    if (mes <= 9)
      m = "0" + mes;
    if (ano <= 9)
      a = "0" + ano;
    
    return d+"/"+m+"/"+a;
  }

  public void imprimirData() {
    if (verificarData(dia, mes, ano)) 
      System.out.println(getData());
    else 
      System.out.println("Erro ao imprimir!! Data inválida!");
  }

  public static String dayToPrintLong(Data data) {
    if (data.verificarData(data.dia, data.mes, data.ano) == false) 
      return null;

    return data.dia + " de " + data.mesEmExtenso(data.mes) + " de " + data.ano;
  }

  // public void imprimirDataExtenso() {
  //   if (verificarData(dia, mes, ano)) {
  //     System.out.printf("%d de ", dia);
  //     mesEmExtenso();
  //     System.out.printf(" de %d", ano);
  //   }
  //   else 
  //     System.out.printf("Erro ao imprimir!! Data inválida!");
  // }
  
  private static String mesEmExtenso(int mes) {
    String vetMes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
                       "Junho", "Julho", "Agosto", "Setembro", 
                       "Outubro", "Novembro", "Dezembro"};

    return vetMes[mes-1];
  }
}
