package pacman;
import javax.swing.JFrame;

public class Pacman extends JFrame{
	//	add (new Model());
		
	//}
	public Pacman() {
		setTitle("Pacman");
		getContentPane().add(new Model());
	}
	
	public static void main(String[] args) {
		
		Pacman pac = new Pacman();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(380,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
	}
	

}
