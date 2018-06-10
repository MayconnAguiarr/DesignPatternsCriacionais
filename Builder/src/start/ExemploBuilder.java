package start;

import model.Produto;

public class ExemploBuilder {

	public static void main(String[] args) {

		Director director = new Director();
		ConcreteBuilder builder = new ConcreteBuilder();
		
		director.construct(builder);
		Produto produto = builder.getProduto();
		
		produto.gerarArquivo();

	}

}
