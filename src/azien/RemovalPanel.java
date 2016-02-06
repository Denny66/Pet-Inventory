package azien;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RemovalPanel extends JPanel {
	
	private SpringLayout mainLayout;
	private AddressPanel mAddressPanel;
	private JLabel animalStatusLabel;
	private JComboBox animalStatusComboBox;
	
	public RemovalPanel() {
	
		mainLayout = new SpringLayout();
		mAddressPanel = new AddressPanel();
		animalStatusLabel = new JLabel("Animal Status");
		animalStatusComboBox = new JComboBox();
		
		
		setUpRemovalPanel();
	}
	
	private void setUpRemovalPanel()
	{
		setLayout(mainLayout);
		setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Removal Request", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBackground(new Color(153, 255, 204));
		
		mAddressPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Location Of Removal", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		mainLayout.putConstraint(SpringLayout.NORTH, mAddressPanel, 10, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, mAddressPanel, 10, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.SOUTH, mAddressPanel, 66, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.EAST, mAddressPanel, -10, SpringLayout.EAST, this);
		add(mAddressPanel);
		
		mainLayout.putConstraint(SpringLayout.EAST, animalStatusLabel, 65, SpringLayout.WEST, mAddressPanel);
		mainLayout.putConstraint(SpringLayout.NORTH, animalStatusLabel, 20, SpringLayout.SOUTH, mAddressPanel);
		mainLayout.putConstraint(SpringLayout.WEST, animalStatusLabel, 0, SpringLayout.WEST, mAddressPanel);
		animalStatusLabel.setLabelFor(animalStatusComboBox);
		add(animalStatusLabel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, animalStatusComboBox, -3, SpringLayout.NORTH, animalStatusLabel);
		mainLayout.putConstraint(SpringLayout.WEST, animalStatusComboBox, 6, SpringLayout.EAST, animalStatusLabel);
		mainLayout.putConstraint(SpringLayout.EAST, animalStatusComboBox, 168, SpringLayout.EAST, animalStatusLabel);
		animalStatusComboBox.setModel(new DefaultComboBoxModel(new String[] {"Up For Adoption", "To Be Euthanized"}));
		add(animalStatusComboBox);
		
	}

}
