package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(); //+ctrl+shift+o
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 1;
		int b = 2;
		System.out.println("Hello Word! " + (a+b));*/
		
	}

}

class Livros {
	private String nome;
	private String npag;
}

//Atalhos

/*ctrl +n = abrir lista de comandos com palavra em uso
f2 = renomear pacote
ctrl +m = expande tela
ctrl +espa�o = completa palavras e frases
cntrl +3 = lupa
ctrl +d = deleta a linha
alt +seta = altera LOCALIZA��O  de um bloco inteiro
ctrl +shift +f = identa��o 
ctrl +shift +o = importa��o do objeto em quest�o
*/
