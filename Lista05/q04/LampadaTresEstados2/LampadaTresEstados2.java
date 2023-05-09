import java.lang.Math;

public class LampadaTresEstados2 {
  private String tipoDaLamp;
  private int voltagem;
  private String tamanho;
  private float preço;
  private boolean apagada;
  private boolean meiaLuz;
  private int lumin;

  public LampadaTresEstados2(String tipoDaLamp, int volt, String tam, float preço, int lumin) {
    this.tipodaLamp = tipoDaLamp;
    voltagem = volt;
    tamanho = tam;
    this.preço = preço; 
    
    // caso seja enviado um número negativo ou maior que 100  
    if (lumin < 0)
      lumin = 0;
    else if (lumin > 100)
      lumin = 100;
      
    this.lumin = lumin;
    mudarEstado(); 
  }

  // Método Getter

  public String getTipoDaLamp() {
    return tipoDaLamp;
  }

  public int getVoltagem() {
    return voltagem;
  }

  public String getTamanho() {
    return tamanho;
  }

  public float getPreço() {
    return preço;
  }

  public boolean IsApagada() {
    return apagada;
  }

  public boolean IsMeiaLuz() {
    return meiaLuz;
  }

  public int getLumin() {
    return lumin;
  }
  
  // Método Setter

  public void setPreço(float preço) {
    this.preço = preço;
  }

  public void setApagada(boolean apagada) {
    this.apagada = apagada;
  }

  public void setMeiaLuz(boolean meiaLuz) {
    this.meiaLuz = meiaLuz;
  }

  public void setLumin(int lumin) {
    this.lumin = lumin;
  }
  
  // Métodos da classe

  public void acender() {
    if (apagada) {
      setApagada(false);
    }
    else 
      System.out.printf("\nErro! A Lâmpada já se encontra acesa");
  } 

  public void apagar() {
    if (apagada == false) {
      setApagada(true);
      setMeiaLuz(false);
    }
    else
      System.out.printf("\nErro! A Lâmpada já se encontra apagada");
  }

  public void deixarEmMeiaLuz() {
    if (apagada)
      System.out.printf("\nErro! A Lâmpada está apagada");
    else {
      if (meiaLuz == false) 
        setMeiaLuz(true);
      else
        System.out.printf("\nErro! A Lâmpada já se encontra em meia-luz");
    }
  }

  public void mudarEstado() {
    if (lumin > 0) { 
      setApagada(false);

      if (lumin != 100)
        setMeiaLuz(true);
      }
    else if (lumin == 0)
      setApagada(true);
  }

  public void aumentarLuz() {
    if (lumin < 100)
      ++lumin;
    
      if (apagada == true)
        mudarEstado();
    else
      System.out.printf("\nA iluminação já está no máximo");
  }

  public void diminuirLuz() {
    if (lumin > 0)
      --lumin;
    
      if (apagada == false)
        mudarEstado();
    else
      System.out.printf("\nA iluminação já está no mínimo");
  }

  public void definirLuz(int lumin) {
    int iluminacao = Math.abs(lumin%100);
    
    setLumin(iluminacao);
  }

  private void mostrarEstado() {
    if (apagada)
      System.out.printf("\nA lâmpada está apagada");
    else if (meiaLuz)
      System.out.printf("\nA lâmpada está em meia-luz");
    else 
      System.out.printf("\nA lâmpada está acesa");
  }

  public void imprimirLampada() {
    System.out.printf("\n--- Dados da Lâmpada ---\n");
    System.out.printf("\nTipo: %s", tipoDaLamp);
    System.out.printf("\nVoltagem: %dV", voltagem);
    System.out.printf("\nTamanho: %s", tamanho);
    System.out.printf("\nPreço: R$%.2f", preço);
    System.out.printf("\nLuminosidade: %d", lumin);
    mostrarEstado();
  }
}
