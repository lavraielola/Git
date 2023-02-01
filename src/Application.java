
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Application extends Frame implements WindowListener
{
	//Frame f;
	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		//this.f=new JFrame();
		
		Modèle modl = new Modèle();
		Contrôleur ctrl = new Contrôleur(modl);
		Vue vue = new Vue();
		this.addWindowListener(this);
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		//this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle(";jgfs");
		this.add(vue);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(ABORT);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(ABORT);
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
