package main;

import model.DataBase;
import model.FirebirdClass;
import model.IBanco;
import model.OracleClass;
import model.PostGreSQLClass;
import model.SQLServerClass;

public class SqlClientesMaisRecentes {

	private static DataBase TipoBanco;

	public static void main(String[] args) {
		TipoBanco = DataBase.PostgreSQL;
		
		System.out.println("Impressão sem factory" + SqlClientesMaisRecentes());
		
		System.out.println();
		TipoBanco = DataBase.SqlServer;
		
		IBanco banco =  GetDataBaseClass(TipoBanco);
		System.out.println("Impressão com factory" + banco.GetSQLClientesMaisRecentes());		
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
	
	public static IBanco GetDataBaseClass(DataBase tipoBanco) {
		switch (tipoBanco) {
		case  SqlServer:
			return new SQLServerClass();

		case Firebird:
			return new FirebirdClass();
			
		case Oracle:
			return new OracleClass();
			
		case PostgreSQL:
			return new  PostGreSQLClass();

		default:
			return null;
		}		
	}	
}
