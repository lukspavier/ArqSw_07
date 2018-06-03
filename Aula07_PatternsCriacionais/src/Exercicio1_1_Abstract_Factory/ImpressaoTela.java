package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 * 
 *
 */

// Impressão na Tela
public class ImpressaoTela implements Impressao {

	public void imprimir(String string) {
		System.out.println(string);
	}

}
