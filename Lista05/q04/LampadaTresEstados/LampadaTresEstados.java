public class LampadaTresEstados {
  private String tipoDaLamp;
  private int voltagem;
  private String tamanho;
  private float preço;
  private boolean apagada;
  private boolean meiaLuz;

  public LampadaTresEstados(String tipoDaLamp, int volt, String tam, float preço, boolean apagada, boolean meiaLuz) {
    this.tipodaLamp = tipoDaLamp;
    voltagem = volt;
    tamanho = tam;
    this.preço = preço; 
    this.apagada = apagada;
    this.meiaLuz = meiaLuz;
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
    mostrarEstado();
  }
}
