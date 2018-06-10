package singleton;

public class Exemplo {

	public static void main(String[] args) {
		Logger log = Logger.getInstancia();
		log.registrarLog("Registrar log");
	}
}
