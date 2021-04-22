package antrob.santacasa.euromilhoes;


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
	// private int[] numeros;
	// private int[] estrelas;
	
	
	// Gera uma aposta aleatória
	/**
	 * Cria um objecto <code>Aposta</code> com números e estrelas gerados aleatóriamente
	 * 
	 */
	public Aposta() {
		
		
		
		
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
		
		
		// Os numeros tem de estar no intervalo de 1 a 50
		
		
		// Nao podem haver numeros iguais
		
		
		// Tem de ser 2 estrelas
		
		
		// As estrelas tem de estar no intervalo de 1 a 12
		
		
		// Nao podem haver estrelas iguais
		
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
		
		
		
		return null;
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
		
		
		return null;
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
	@Override public String toString() {
		// Item 12: Always override toString
		
		
		return null;
	}	
				
	
	

}
