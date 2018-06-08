package model;

public class FirebirdClass implements IBanco {

	@Override
	public String GetSQLClientesMaisRecentes() {
		return "SELECT FIRST 100 * FROM CLIENTES";
	}
}
