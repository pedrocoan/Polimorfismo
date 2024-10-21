package brpessoas.com;

// Criando a superclasse Pessoa /*
public class Pessoa {
	
	private String nome;
	
	
	// Criando o construtor da superclasse/*
	 public Pessoa(String nome) {
	        this.nome = nome;
	   }


 // Criado o getter/*
   public String getNome() {
    return nome;
}
   
   // Criando o metodo para enviar email/*
   public String enviaremail(String mensagem) {
	   return "Oi" + nome +  "\n" + mensagem;//retornando o nome e a mensagem/*
   }


}