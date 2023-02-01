
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Vue extends Button implements Observer {
	
	public Vue() {
		super();
		this.setLabel("0");
		this.setPreferredSize(new Dimension(120,120));
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setLabel((String)arg);
		Random r = new Random();
		this.setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
	}

}
