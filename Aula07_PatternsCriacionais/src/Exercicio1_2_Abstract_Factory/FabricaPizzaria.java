package Exercicio1_2_Abstract_Factory;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 * 
 *
 */

public class FabricaPizzaria implements FabricaAbstrataPizzaria {
	String m;

	@Override
	public String funcionarioP() {

		return m = "Pizzas -- Ingredientes do dia:\n * Queijo\n * Calabresa\n * Tomate\n**********************************\nCalzones -- Ingredientes do dia:\n * Queijo\n * Calabresa\n * Tomate\n";
	}

	@Override
	public String funcionarioS() {

		return m = "Pizzas -- Ingredientes do dia:\n * Queijo\n * Presunto\n * Tomate\n**********************************\nCalzones -- Ingredientes do dia:\n * Queijo\n * Presunto\n * Tomate\n";
	}

}
