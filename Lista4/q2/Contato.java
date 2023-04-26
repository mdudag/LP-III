public class Contato {
  private String nome;
  private String email;
  private String tel;
  Data dataNasc = new Data();

  // Método Getter

  public String getNome() {
    return nome;
  } 

  public String getEmail() {
    return email;
  }

  public String getTel() {
    return tel;
  }

  public void getDataNasc() {
    dataNasc.imprimirData();
  }
  
  // Método Setter

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public void setDataNasc(int d, int m, int a) {
    dataNasc.inicializarData(d, m, a);
  }
  
  // Métodos da classe

  public void inicializarContato(String nome, String email, String tel, int d, int m, int a) {
    setNome(nome);
    setEmail(email);
    setTel(tel);
    setDataNasc(d, m, a);
  }

  public void imprimirContato() {
    System.out.printf("\nNome: %s", nome);
    System.out.printf("\nEmail: %s", email);
    System.out.printf("\nTelefone: %s", tel);
    System.out.printf("\nData de Nascimento: ");
    dataNasc.imprimirData();
  }

  public int calcularIdade(int diaAtual, int mesAtual, int anoAtual) {
    int ano, mes, dia, idade;
    
    ano = dataNasc.getAno();
    mes = dataNasc.getMes();
    dia = dataNasc.getDia();
    
    idade = anoAtual - ano; 

    if (mes > mesAtual)
      return --idade;
    else if (mes < mesAtual) 
      return idade;
    else 
      return (dia <= diaAtual) ? idade : --idade;
  }
}
