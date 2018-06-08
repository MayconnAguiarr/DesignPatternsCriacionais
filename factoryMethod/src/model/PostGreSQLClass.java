package model;

public class PostGreSQLClass implements IBanco{

	@Override
	public String GetSQLClientesMaisRecentes() {
		return "SELECT * FROM CLIENTES LIMIT 100";
	}
}
