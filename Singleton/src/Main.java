
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// Connection conn = new Connection();
		
		Connection.getINSTANCE().setConnectionStr("DB local");
		
		System.out.println(Connection.getINSTANCE().getConnectionStr());
		
		
	}

}
