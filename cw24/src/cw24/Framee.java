package cw24;

import java.awt.*;

public class Framee extends Frame {

	public Framee(int w, int h) {
		setSize(w, h);
		setVisible(true);
	}

	public void paint(Graphics g) {

		g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		g.drawString("teraz rysuje", 400, 300);
		g.drawOval(300, 400, 200, 200);
		g.fillOval(getHeight()/2, getWidth()/2, 100, 100);
		
		drawrzadkol(100,100,g);
		

	}

	public void drawPawieOko(int x, int y, Graphics g) {
		for (int i = 50; i > 0; i--) {
			g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
			g.fillOval(20, ((getHeight()) / 2) - 8 * i, 70 + (i * 15), 30 + (i * 15));

		}
		
		
	}
	public void drawrzadkol(int x, int y,Graphics g){
		for(int i = 10;i>0;i--){ 
			g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
			g.fillOval(i*100,100, 100, 100);
		}
	}
}
