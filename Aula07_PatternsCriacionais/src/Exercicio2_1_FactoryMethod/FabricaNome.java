package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 * 
 *
 */

public class FabricaNome {

	public Nome getNome(String nome, String sobrenome) {
		return new Informacao(nome, sobrenome);
	}
}
