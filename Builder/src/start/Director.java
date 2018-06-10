package start;

public class Director {
	
	public Director() {}
	
	public void construct(ConcreteBuilder builder) {
		builder.builderCabecalho();
		builder.builderCorpo();
		builder.builderRodape();		
	}
}
