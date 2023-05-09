public class Lampada {
  private String tipoDaLamp;
  private int voltagem;
  private String tamanho;
  private float preço;
  private boolean apagada;

  public Lampada(String tipoDaLamp, int volt, String tam, float preço, boolean apagada) {
    this.tipoDaLamp = tipoDaLamp;
    voltagem = volt;
    tamanho = tam;
    this.preço = preço;
    this.apagada = apagada;
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
  
  // Método Setter

  public void setPreço(float preço) {
    this.preço = preço;
  }

  public void setApagada(boolean apagada) {
    this.apagada = apagada;
  }
  
  // Métodos da classe

  public void acender() {
    if (apagada) {
      setApagada(false);
    }
    else 
      System.out.printf("Erro! A Lâmpada já se encontra acesa");
  } 

  public void apagar() {
    if (apagada == false) {
      setApagada(true);
    }
    else
      System.out.printf("Erro! A Lâmpada já se encontra apagada");
  }

  private void mostrarEstado() {
    if (apagada)
      System.out.printf("\nA lâmpada está apagada");
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
