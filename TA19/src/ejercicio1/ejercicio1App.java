package ejercicio1;
import java.awt.EventQueue;

public class ejercicio1App {
	
	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					holaMundo frame = new holaMundo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
