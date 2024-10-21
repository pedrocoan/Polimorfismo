package main;

import brpessoas.com.Aluno;
import brpessoas.com.Professor;

//Criando a classe main pra testar os metodos/*
public class Main  {

	public static void main(String[] args) {
		//instanciando os objetos e criando os metodos/*
		 Professor professor = new Professor("Alan Turing");
	        Aluno aluno = new Aluno("Joseph");

	        String mensagem = "Esta é a mensagem que você pediu.";

	        System.out.println(professor.enviaremail(mensagem));
	        System.out.println(aluno.enviaremail(mensagem));
	    }
	

	}


