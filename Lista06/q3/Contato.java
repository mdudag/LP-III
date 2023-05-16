public class Contato {
  private String nome;
  private String email;
  private String tel;
  private Data dataNasc;

  public Contato(String nome, String email, String tel, int d, int m, int a) {
    this.nome = nome;
    this.email = email;
    this.tel = tel;
    dataNasc = new Data(d, m, a);
  }

  public Contato(String nome, String tel, int d, int m, int a) {
    this(nome, "Não possui", tel, d, m, a);
  }

  public Contato(String nome, int d, int m, int a) {
    this(nome, "Não possui", "Não possui", d, m, a);
  }

  public Contato() {
    this("SemNome", 1, 1, 1970);
  }

  public Contato(String nome, String email, String tel) {
    this(nome, email, tel, 1, 1, 1970);
  }
  
  public Contato(String nome, String email, String tel, Data data) {
    this.nome = nome;
    this.email = email;
    this.tel = tel;
    dataNasc = data;
  }

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

  public void setEmail(String email) {
    this.email = email;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }
  
  // Métodos da classe

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
    
    return (dia <= diaAtual) ? idade : --idade;
  }
}
