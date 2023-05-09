public class Lampada2 {
  private String tipoDaLamp;
  private int voltagem;
  private String tamanho;
  private float preço;
  private boolean apagada;

  public void inicializarLampada(String tipoDaLamp, int volt, String tam, float preço, boolean apagada) {
    this.tipodaLamp = tipoDaLamp;
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

  public boolean estaLigada() {
    if (apagada) 
      return false;
    else
      return true;
    
  }

  private void mostrarEstado() {
    if (estaLigada())
      System.out.printf("\nA lâmpada está acesa");
    else
      System.out.printf("\nA lâmpada está apagada");
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
