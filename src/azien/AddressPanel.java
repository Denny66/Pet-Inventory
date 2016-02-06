package azien;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddressPanel extends JPanel {
	
	private SpringLayout mainLayout;
	private JLabel streetNumberLabel;
	private JFormattedTextField streetNumberTextField;
	private JLabel streetNameLabel;
	private JFormattedTextField streetNameTextField;
	private JLabel cityLabel;
	private JFormattedTextField cityTextField;
	private JLabel parishLabel;
	private JComboBox parishComboBox;
	
	public AddressPanel() {
		
		mainLayout = new SpringLayout();
		streetNumberLabel = new JLabel("Street Number");
		streetNumberTextField = new JFormattedTextField();
		streetNameLabel = new JLabel("Street Name");
		streetNameTextField = new JFormattedTextField();
		cityLabel = new JLabel("City");
		cityTextField = new JFormattedTextField();
		parishLabel = new JLabel("Parish");
		parishComboBox = new JComboBox();
		
		
		
		
		setUpAddressPanel();
	}
	
	private void setUpAddressPanel()
	{
		setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Address", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBackground(new Color(153, 255, 204));
		setLayout(mainLayout);
		
		mainLayout.putConstraint(SpringLayout.WEST, streetNumberLabel, 10, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.EAST, streetNumberLabel, -6, SpringLayout.WEST, streetNumberTextField);
		mainLayout.putConstraint(SpringLayout.NORTH, streetNumberLabel, 10, SpringLayout.NORTH, this);
		add(streetNumberLabel);
		
		mainLayout.putConstraint(SpringLayout.WEST, streetNumberTextField, 86, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.EAST, streetNumberTextField, 130, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.NORTH, streetNumberTextField, 7, SpringLayout.NORTH, this);
		add(streetNumberTextField);
		
		mainLayout.putConstraint(SpringLayout.NORTH, streetNameLabel, 10, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, streetNameLabel, 19, SpringLayout.EAST, streetNumberTextField);
		mainLayout.putConstraint(SpringLayout.EAST, streetNameLabel, -6, SpringLayout.WEST, streetNameTextField);
		add(streetNameLabel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, streetNameTextField, -3, SpringLayout.NORTH, streetNumberLabel);
		mainLayout.putConstraint(SpringLayout.WEST, streetNameTextField, -142, SpringLayout.WEST, cityLabel);
		mainLayout.putConstraint(SpringLayout.EAST, streetNameTextField, -27, SpringLayout.WEST, cityLabel);
		add(streetNameTextField);
		
		mainLayout.putConstraint(SpringLayout.NORTH, cityLabel, 10, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, cityLabel, 357, SpringLayout.WEST, this);
		add(cityLabel);
		
		mainLayout.putConstraint(SpringLayout.WEST, cityTextField, 6, SpringLayout.EAST, cityLabel);
		mainLayout.putConstraint(SpringLayout.EAST, cityTextField, 103, SpringLayout.EAST, cityLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, cityTextField, 7, SpringLayout.NORTH, this);
		add(cityTextField);
		
		mainLayout.putConstraint(SpringLayout.NORTH, parishLabel, 10, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, parishLabel, 19, SpringLayout.EAST, cityTextField);
		add(parishLabel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, parishComboBox, 7, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, parishComboBox, 12, SpringLayout.EAST, parishLabel);
		parishComboBox.setModel(new DefaultComboBoxModel(new String[] {"St. Catherine", "St. James", "St. Ann", "Kingston", "St. Andrew", "St. Thomas", "Portland", "Westmoreland", "Hanover", "Manchester", "Trelawny", "St. Elizabeth", "Clarendon"}));
		add(parishComboBox);
	}
}
