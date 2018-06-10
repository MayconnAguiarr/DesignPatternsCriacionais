package singleton;

public class Logger {
	
	private static Logger instancia;
	
	protected Logger() {}
	
	public static Logger getInstancia() {
		if(instancia == null) {
			instancia =  new Logger();
		}		
		return instancia;
	}
	
	public void registrarLog(String texto) {
		System.out.println("Registrar texto");		
	}
}
