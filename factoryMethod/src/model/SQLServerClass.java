package model;

public class SQLServerClass  implements IBanco{

	@Override
	public String GetSQLClientesMaisRecentes() {
		return "SELECT TOP 100 * FROM CLIENTES ";
	}

}
