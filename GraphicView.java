
import javax.swing.JFrame;

// Class that is a JFrame that adds a panel.
// This panel will allow for a graphic of a pie chart to be drawn and displayed. 
public class GraphicView extends JFrame{
	public GraphicView() {
		setTitle("Pie Chart");
		add(new Result());
	}
}