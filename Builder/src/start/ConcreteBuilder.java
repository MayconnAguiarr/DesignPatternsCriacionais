package start;

import model.IBuilder;
import model.Produto;

public class ConcreteBuilder implements IBuilder {

	private Produto arquivo;

	@Override
	public void builderCabecalho() {
		arquivo.imprimirTexto("Imprimir cabeçalho");
	}

	@Override
	public void builderCorpo() {
		arquivo.imprimirTexto("Imprime corpo");
	}

	@Override
	public void builderRodape() {
		arquivo.imprimirTexto("Imprime rodapé");
	}

	@Override
	public Produto getProduto() {
		return arquivo;
	}
}
