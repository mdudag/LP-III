public class Lampada2 {
  private String tipoDaLamp;
  private int voltagem;
  private String tamanho;
  private float preço;
  private boolean apagada;

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

  public void setTipoDaLamp(String tipoDaLamp) {
    this.tipoDaLamp = tipoDaLamp;
  }

  public void setVoltagem(int voltagem) {
    this.voltagem = voltagem;
  }

  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }

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

  public void inicializarLampada(String tipoDaLamp, int volt, String tam, float preço, boolean apagada) {
    setTipoDaLamp(tipoDaLamp);
    setVoltagem(volt);
    setTamanho(tam);
    setPreço(preço);  
    setApagada(apagada);
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
