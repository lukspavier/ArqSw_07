package Exercicio2_3_FactoryMethod;
/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 * 			
 *
 */

import javax.swing.JOptionPane;

public class ExecutarNumero {

	public static void main(String[] args) {

		String men = "";
		FabricaNumero fn = new FabricaNumero();

		men = JOptionPane.showInputDialog(null, "Digite qual arquivo deseja criar\n*Obs: arquivo ou console");
		fn.mostrar(men);

		System.exit(0);
	}

}
