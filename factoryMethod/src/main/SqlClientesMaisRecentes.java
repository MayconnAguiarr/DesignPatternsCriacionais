package main;

import model.DataBase;

public class SqlClientesMaisRecentes {

	private static DataBase TipoBanco;

	public static void main(String[] args) {
		TipoBanco = DataBase.PostgreSQL;
		System.out.println(SqlClientesMaisRecentes());
	}

	// antes de implementar o conceito de Factory 
	public static String SqlClientesMaisRecentes() {
		if (TipoBanco == DataBase.SqlServer) {
			return "SELECT TOP 100 * FROM CLIENTES ";
		}
		else if (TipoBanco == DataBase.Firebird) {
			return "SELECT FIRST 100 * FROM CLIENTES";
		}
		else if (TipoBanco == DataBase.Oracle) {
			return "SELECT * FROM CLIENTES WHERE rownum <= 1000";
		}
		else if (TipoBanco == DataBase.PostgreSQL) {
			return "SELECT * FROM CLIENTES LIMIT 100";
		}else {
			return "";
		}	
	}
}
