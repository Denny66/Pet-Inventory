package azien;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

public class AnimalPanel extends JPanel {
	
	private SpringLayout mainLayout;
	private JLabel typeLabel;
	private JFormattedTextField typeTextField;
	private JLabel breedLabel;
	private JFormattedTextField breedTextField;
	private JLabel genderLabel;
	private JComboBox genderComboBox;
	private JLabel approxAgeLabel;
	private JSpinner approxAgeSpinner;
	
	public AnimalPanel() {
		
		mainLayout = new SpringLayout();
		typeLabel = new JLabel("Type");
		typeTextField = new JFormattedTextField();
		breedLabel = new JLabel("Breed");
		breedTextField = new JFormattedTextField();
		genderLabel = new JLabel("Gender");
		genderComboBox = new JComboBox();
		approxAgeLabel = new JLabel("Approx. Age");
		approxAgeSpinner = new JSpinner();
		
		setUpAnimalPanel();
		
	}
	
	private void setUpAnimalPanel()
	{
		setLayout(mainLayout);
		setBackground(new Color(153, 255, 204));
		setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Animal Info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		mainLayout.putConstraint(SpringLayout.NORTH, typeLabel, 10, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, typeLabel, 10, SpringLayout.WEST, this);
		typeLabel.setLabelFor(typeTextField);
		add(typeLabel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, typeTextField, -3, SpringLayout.NORTH, typeLabel);
		mainLayout.putConstraint(SpringLayout.WEST, typeTextField, 6, SpringLayout.EAST, typeLabel);
		mainLayout.putConstraint(SpringLayout.EAST, typeTextField, 90, SpringLayout.EAST, typeLabel);
		add(typeTextField);
		
		mainLayout.putConstraint(SpringLayout.NORTH, breedLabel, 0, SpringLayout.NORTH, typeLabel);
		mainLayout.putConstraint(SpringLayout.WEST, breedLabel, 17, SpringLayout.EAST, typeTextField);
		add(breedLabel);
		
		breedLabel.setLabelFor(breedTextField);
		mainLayout.putConstraint(SpringLayout.NORTH, breedTextField, -3, SpringLayout.NORTH, typeLabel);
		mainLayout.putConstraint(SpringLayout.WEST, breedTextField, 6, SpringLayout.EAST, breedLabel);
		mainLayout.putConstraint(SpringLayout.EAST, breedTextField, 97, SpringLayout.EAST, breedLabel);
		add(breedTextField);
		
		mainLayout.putConstraint(SpringLayout.NORTH, genderLabel, 0, SpringLayout.NORTH, typeLabel);
		mainLayout.putConstraint(SpringLayout.WEST, genderLabel, 18, SpringLayout.EAST, breedTextField);
		add(genderLabel);
		
		genderLabel.setLabelFor(genderComboBox);
		genderComboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		mainLayout.putConstraint(SpringLayout.NORTH, genderComboBox, -3, SpringLayout.NORTH, typeLabel);
		mainLayout.putConstraint(SpringLayout.WEST, genderComboBox, 6, SpringLayout.EAST, genderLabel);
		mainLayout.putConstraint(SpringLayout.EAST, genderComboBox, 76, SpringLayout.EAST, genderLabel);
		add(genderComboBox);
		
		mainLayout.putConstraint(SpringLayout.WEST, approxAgeLabel, 20, SpringLayout.EAST, genderComboBox);
		mainLayout.putConstraint(SpringLayout.SOUTH, approxAgeLabel, 0, SpringLayout.SOUTH, typeLabel);
		add(approxAgeLabel);
		
		approxAgeSpinner.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		approxAgeLabel.setLabelFor(approxAgeSpinner);
		mainLayout.putConstraint(SpringLayout.NORTH, approxAgeSpinner, -3, SpringLayout.NORTH, typeLabel);
		mainLayout.putConstraint(SpringLayout.WEST, approxAgeSpinner, 6, SpringLayout.EAST, approxAgeLabel);
		mainLayout.putConstraint(SpringLayout.EAST, approxAgeSpinner, -43, SpringLayout.EAST, this);
		add(approxAgeSpinner);
	}
	
	

}
