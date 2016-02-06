package azien;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class DatePanel extends JPanel {
	
	private SpringLayout mainLayout;
	private JSpinner daySpinner;
	
	
	public DatePanel() {
		
		mainLayout = new SpringLayout();
		daySpinner = new JSpinner();
		
		setUpDatePanel();
	}
	
	private void setUpDatePanel()
	{
		setLayout(mainLayout);
		
		mainLayout.putConstraint(SpringLayout.NORTH, daySpinner, 10, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, daySpinner, 10, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.EAST, daySpinner, -226, SpringLayout.EAST, this);
		daySpinner.setModel(new SpinnerDateModel(new Date(1381640400000L), new Date(946706400000L), new Date(32528322000000L), Calendar.DAY_OF_YEAR));
		setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Intended Date Visit", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBackground(new Color(153, 255, 204));
		add(daySpinner);
		
		
	}

}
