package brpessoas.com;

//Criando a subclasse Aluno/*
public class Aluno extends Pessoa {
	
	//Criando o construtor da classe/*
	 public Aluno(String nome) {
	        super(nome); // Criando o construtor da superclasse/*
	    }
         
	    @Override //sobreescrevendo o metodo da superclasse/*
	    public String enviaremail(String mensagem) {
	        return "Olá Aluno " + getNome() + "\n" + mensagem;
	    }
	}
	


