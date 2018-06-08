package model;

public enum DataBase {
	
	SqlServer, Firebird, Oracle, PostgreSQL;
	
	private String valor;	
	
	DataBase(){
		this.valor = valor;		
	}

	public String getValor() {
		return valor;
	}
	
}
