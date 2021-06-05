
public class Connection {

	
	private static Connection INSTANCE;
	
	private String ConnectionStr;

	private  Connection() {
	}

	public static Connection getINSTANCE() {
		
		if (INSTANCE == null) {
			INSTANCE = new Connection();
		}
		
		return INSTANCE;
	}


	public String getConnectionStr() {
		return ConnectionStr;
	}

	public void setConnectionStr(String connectionStr) {
		ConnectionStr = connectionStr;
	}
	
	
	
	
	
	
}
