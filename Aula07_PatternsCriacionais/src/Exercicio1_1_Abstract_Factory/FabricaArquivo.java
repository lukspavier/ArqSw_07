package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 * 
 *
 */

// Fabrica de impressão no arquivo
public class FabricaArquivo implements FabricaAbstrata {

	private static final Impressao impressao = new ImpressaoArquivo("output.txt");

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
