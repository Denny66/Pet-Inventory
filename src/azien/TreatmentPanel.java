package azien;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TreatmentPanel extends JPanel {
	
	private SpringLayout mainLayout;
	private JLabel descripLabel;
	private JTextArea descripTextArea;
	
	public TreatmentPanel() {
		
		mainLayout = new SpringLayout();
		descripLabel = new JLabel("Summary Of The Problem");
		descripTextArea = new JTextArea();
		mainLayout.putConstraint(SpringLayout.SOUTH, descripTextArea, 56, SpringLayout.SOUTH, descripLabel);
		mainLayout.putConstraint(SpringLayout.EAST, descripTextArea, 625, SpringLayout.WEST, this);
		
		setUpTreatmentPanel();
	}
	
	private void setUpTreatmentPanel()
	{
		setLayout(mainLayout);
		setBackground(new Color(153, 255, 204));
		setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Treatment Request", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		mainLayout.putConstraint(SpringLayout.NORTH, descripLabel, 10, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, descripLabel, 10, SpringLayout.WEST, this);
		add(descripLabel);
		
		descripLabel.setLabelFor(descripTextArea);
		mainLayout.putConstraint(SpringLayout.NORTH, descripTextArea, 6, SpringLayout.SOUTH, descripLabel);
		mainLayout.putConstraint(SpringLayout.WEST, descripTextArea, 0, SpringLayout.WEST, descripLabel);
		add(descripTextArea);
	}

}
