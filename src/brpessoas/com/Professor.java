package brpessoas.com;

// Criando a subclasse Professor/*
public class Professor extends Pessoa {
	// Criando o construtor da classe/*
	 public Professor(String nome) {
	        super(nome);// Chamando o construtor da superclasse/*
	    }

	  

		@Override//Sobreescrevendo o metodo da superclasse/*
	    public String enviaremail(String mensagem) {
	        return "Olá Prof. " + getNome() + "\n" + mensagem;
	    }
	}
	


