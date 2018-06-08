package model;

public class OracleClass implements IBanco{

	@Override
	public String GetSQLClientesMaisRecentes() {
		return "SELECT * FROM CLIENTES WHERE rownum <= 1000";
	}
}
