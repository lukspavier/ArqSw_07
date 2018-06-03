package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 * 
 *
 */

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();

		String nome = "João";
		String sobrenome = "De Barro";

		fn.getNome(nome, sobrenome);

	}

}