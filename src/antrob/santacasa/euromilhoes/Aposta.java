package antrob.santacasa.euromilhoes;

import java.util.Arrays;
import java.util.Random;

//import java.util.Arrays;
//import java.util.Random;


/**
 * A class <code>Aposta</code> representa uma Aposta Simples do Euromilhões.
 * Uma Aposta é constituída por
 * <ul>
 * 	<li>5 números inteiros diferentes entre 1 e 50</li>
 * 	<li>2 estrelas (números inteiros diferentes entre 1 e 12)</li>   
 * </ul> 
 * <br>Exemplo de utilização:
 * <pre>
 * {@code 
 *   Aposta aposta = new Aposta( new int[] {12,17, 24, 35, 47}, new int[]{ 2, 5} );
 * 
 *   Aposta chave = new Aposta(new int[] {6, 12, 19, 24, 38}, new int[] {3,5});
 *		
 *   Acertos resultado = aposta.getAcertos(chave);				
 * }
 * </pre>
 * 
 * 
 * 
 * @author antrob
 * @version 1.0
 */
public class Aposta {
	
	// Uma aposta do Euromilhoes é composta por 5 numeros inteiros e 2 estrelas
	private int[] numeros;
	private int[] estrelas;
	private int acertos;
	 
	// Gera uma aposta aleatória 
	Random random = new Random();
	
	/**
	 * Cria um objecto <code>Aposta</code> com números e estrelas gerados aleatóriamente
	 * 
	 */
	

		
	public Aposta() {
		//Gerar 2 estrelas, entre 1 e 12
		for (int i = 0; i <= 1; i++) {
			estrelas[i] = random.nextInt(12);
		}
		
		//Gerar 5 números inteiros, entre 1 e 50
		for (int i = 0; i < 50; i++) {
			numeros[i] = random.nextInt(50);
		}
	}
	

	/**
	 * Cria um objecto <code>Aposta</code> a partir dos números e estrelas passados nos parâmetros.
	 * 
	 * <br>
	 * Implementa a <em>Boa Prática</em> <strong>Check parameters for validity</strong>, Item 49 do livro <a href="https://kea.nu/files/textbooks/new/Effective%20Java%20%282017%2C%20Addison-Wesley%29.pdf" target="_blank">Effective Java</a>
	 * 
	 * @param numeros array com 5 números inteiros (diferentes e entre 1 e 50)
	 * @param estrelas array com 2 números inteiros (diferentes e entre 1 e 12)
	 * @throws IllegalArgumentException se os números ou as estrelas não respeitarem as condições
	 */
	public Aposta(int[] numeros, int[] estrelas) {
		
		// Item 49 Check parameters for validity
		
		// Tem de ser 5 numeros
		if(getNumeros().length != 5) {
			IllegalArgumentException("Tem que ter 5 números");
		}
		
		// Os numeros tem de estar no intervalo de 1 a 50
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 1 || numeros[i] > 50) {
				IllegalArgumentException("Os números têm que ser entre 1 e 50");
			}
		}
		
		// Nao podem haver numeros iguais
		for (int i = 0; i < numeros.length - 1; i++) {
			if(numeros[i] == numeros[i + 1]) {
				IllegalArgumentException("Os números não podem ser iguais");
			}
		}
		
		// Tem de ser 2 estrelas
		if(getEstrelas().length != 5) {
			IllegalArgumentException("Tem que ter 5 números");
		}
		
		// As estrelas tem de estar no intervalo de 1 a 12
		for (int i = 0; i < estrelas.length; i++) {
			if(estrelas[i] < 1 || estrelas[i] > 12) {
				IllegalArgumentException("As estrelas têm que ser entre 1 e 12");
			}
		}
		
		// Nao podem haver estrelas iguais
		// As estrelas tem de estar no intervalo de 1 a 12
		for (int i = 0; i < estrelas.length - 1; i++) {
			if(estrelas[i] == estrelas[i + 1]) {
				IllegalArgumentException("As estrelas têm que ser entre 1 e 12");
			}
		}
	}


	private void IllegalArgumentException(String string) {
		// TODO Auto-generated method stub
		
	}


	/*
	    Method names are written in lowerCamelCase.
		Method names are typically verbs or verb phrases
	 */
	/**
	 * Método de acesso (leitura) aos números da aposta.
	 * 
	 * <br>
	 * Implementa a <em>Boa Prática</em> <strong>'Make defensive copies when needed'</strong>, Item 50 do livro <a href="https://kea.nu/files/textbooks/new/Effective%20Java%20%282017%2C%20Addison-Wesley%29.pdf" target="_blank">Effective Java</a>
	 * 
	 * @return array com os números da aposta ordenados por ordem crescente
	 */
	public int[] getNumeros() {
		// Item 50 Make defensive copies when needed	
		
		return numeros;
	}


	/**
	 * Método de acesso (leitura) às estrelas da aposta.
	 * 
	 * <br>
	 * Implementa a <em>Boa Prática</em> <strong>'Make defensive copies when needed'</strong>, Item 50 do livro <a href="https://kea.nu/files/textbooks/new/Effective%20Java%20%282017%2C%20Addison-Wesley%29.pdf" target="_blank">Effective Java</a>
	 * 
	 * @return array com as estrelas da aposta ordenados por ordem crescente
	 */
	public int[] getEstrelas() {
		// Item 50 Make defensive copies when needed
		
		return estrelas;
	}
	
	/**
	 * Calcula a quantidade de números e estrelas que a aposta acertou. 
	 * 
	 * <br>
	 * Implementa a <em>Boa Prática</em> <strong>Check parameters for validity</strong>, Item 49 do livro <a href="https://kea.nu/files/textbooks/new/Effective%20Java%20%282017%2C%20Addison-Wesley%29.pdf" target="_blank">Effective Java</a>
	 * 
	 * @param chave objecto da classe <code>Aposta</code> com a chave do Euromilhões
	 * @return objecto da classe {@link antrob.santacasa.euromilhoes.Acertos Acertos} contendo o número de números e estrelas certas
	 *  @throws NullPointerException se o parâmetro chave for null
	 */
	public Acertos getAcertos( Aposta chave)
	{
		
		
		return null;
	}
	
	
	
	/** 
	 * Devolve uma representação em string da aposta.
	 * No formato [n1,n2,n3,n4,n5]-[e1,e2], onde ni são os numeros por ordem crescente e ei são as estrelas por ordem crescente.
	 * <br>Por exemplo: <code>[9,18,25,39,44]-[3,5]</code>
	 * 
	 * <br>
	 * Implementa a <em>Boa Prática</em> <strong>'Always override toString'</strong>, Item 12 do livro <a href="https://kea.nu/files/textbooks/new/Effective%20Java%20%282017%2C%20Addison-Wesley%29.pdf" target="_blank">Effective Java</a>
	 * 
	 * @return Uma string com a representação de uma aposta 
	 */
	@Override
	public String toString() {
		return "Aposta [numeros=" + Arrays.toString(numeros) + ", estrelas=" + Arrays.toString(estrelas) + "]";
	}	
				
	
	

}
