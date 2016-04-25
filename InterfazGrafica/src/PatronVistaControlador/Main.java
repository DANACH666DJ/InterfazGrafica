package PatronVistaControlador;

public class Main {

	public static void main(String[] args) {
		Login login = new Login();
		
		Mantenimiento manto= new Mantenimiento();
		
		login.setManto(manto);
		manto.setLogin(login);
		
		login.setVisible(true);

	}

}
