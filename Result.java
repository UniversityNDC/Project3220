import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

// This class is a JPanel that generates a graphic of a pie chart
class Result extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Finds the center of the panel so that the center of the pie chart may be placed on top of it.
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		
		int x = xCenter - radius;
		int y = yCenter - radius;
		
		// Creates 3 labels 
		String webintake = new String("web-Intake-> 40%");
		String email = new String("E-mail-> 30%");
		String phone = new String("Phone-> 30%");
	
	
		// Creates section for "Projects".
		g.setColor(Color.YELLOW);
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 80);
		g.setColor(Color.BLACK);
		g.drawString(webintake, 233, 70);
		
		// Creates section for "E-mail".
		g.setColor(Color.BLUE);
		g.fillArc(x, y, 2 * radius, 2 * radius, 72, 36);
		g.setColor(Color.BLACK);
		g.drawString(email, 120, 18);
		
		// Creates section for "phone".
		g.setColor(Color.PINK);
		g.fillArc(x, y, 2 * radius, 2 * radius, 108, 108);
		g.setColor(Color.BLACK);
		g.drawString(phone, 7, 80);
		
		
	}
}