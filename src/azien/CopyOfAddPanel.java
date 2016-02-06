package azien;

import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class CopyOfAddPanel extends JPanel implements ActionListener{
	
	private JLabel interLabel;
	private SpringLayout mainLayout;
	private JFormattedTextField interTextField;
	private JLabel firstNameLabel;
	private JFormattedTextField firstNameTextField;
	private JFormattedTextField lastNameTextField;
	private JLabel lastNameLabel;
	private JLabel paymentOptionLabel;
	private JComboBox paymentOptionComboBox;
	private JLabel branchLocationLabel;
	private JComboBox branchLocationComboBox;
	private JLabel emailLabel;
	private AddressPanel mAddressPanel;
	private JLabel homeNumLabel;
	private JFormattedTextField homeNumTextField;
	private JLabel mobileNumLabel;
	private JFormattedTextField mobileNumTextField;
	private JFormattedTextField emailTextField;
	private JComboBox emailOptionComboBox;
	private JLabel reasonVisitLabel;
	private JFormattedTextField reasonVisitTextField;
	private DatePanel mDatePanel;
	private AnimalPanel mAnimalPanel;
	private JRadioButton treatmentOptionRBtn;
	private RemovalPanel mRemovalPanel;
	private JRadioButton removalOptionRBtn;
	private final ButtonGroup optionGroup = new ButtonGroup();
	private TreatmentPanel mTreatmentPanel;
	
	public CopyOfAddPanel() {
		
		setBorder(new TitledBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), new LineBorder(new Color(0, 0, 0), 1, true)), "Fill Up Form", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		interLabel = new JLabel();
		mainLayout = new SpringLayout();
		interTextField = new JFormattedTextField();
		firstNameLabel = new JLabel();
		firstNameTextField = new JFormattedTextField();
		lastNameTextField = new JFormattedTextField();
		lastNameLabel = new JLabel();
		mAddressPanel = new AddressPanel();
		homeNumLabel = new JLabel();
		homeNumTextField = new JFormattedTextField();
		paymentOptionLabel = new JLabel();
		paymentOptionComboBox = new JComboBox();
		branchLocationLabel = new JLabel();
		branchLocationComboBox = new JComboBox();
		emailLabel = new JLabel();
		emailTextField = new JFormattedTextField();
		emailOptionComboBox = new JComboBox();
		mobileNumLabel = new JLabel();
		mobileNumTextField = new JFormattedTextField();
		reasonVisitLabel = new JLabel();
		reasonVisitTextField = new JFormattedTextField();
		mDatePanel = new DatePanel();
		mAnimalPanel = new AnimalPanel();
		treatmentOptionRBtn = new JRadioButton("Treatment Option");
		mTreatmentPanel = new TreatmentPanel();
		removalOptionRBtn = new JRadioButton("Removal Option");
		mRemovalPanel = new RemovalPanel();
		
		setUpAddPanel();
	}
	
	private void setUpAddPanel()
	{
		setBackground(new Color(153, 255, 204));
		
		this.setLayout(mainLayout);
		
		mainLayout.putConstraint(SpringLayout.NORTH, interTextField, -3, SpringLayout.NORTH, interLabel);
		mainLayout.putConstraint(SpringLayout.WEST, interTextField, 6, SpringLayout.EAST, interLabel);
		interTextField.setColumns(10);
		this.add(interTextField);
		
		mainLayout.putConstraint(SpringLayout.NORTH, interLabel, 30, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, interLabel, 10, SpringLayout.WEST, this);
		interLabel.setText("Intervention Number");
		interLabel.setLabelFor(interTextField);
		this.add(interLabel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 16, SpringLayout.SOUTH, interLabel);
		mainLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 0, SpringLayout.WEST, interLabel);
		firstNameLabel.setText("First Name");
		this.add(firstNameLabel);
		
		mainLayout.putConstraint(SpringLayout.WEST, firstNameTextField, 55, SpringLayout.EAST, firstNameLabel);
		mainLayout.putConstraint(SpringLayout.EAST, firstNameTextField, 181, SpringLayout.EAST, firstNameLabel);
		mainLayout.putConstraint(SpringLayout.SOUTH, firstNameTextField, -6, SpringLayout.NORTH, paymentOptionComboBox);
		firstNameTextField.setColumns(20);
		this.add(firstNameTextField);
		
		mainLayout.putConstraint(SpringLayout.WEST, lastNameTextField, 40, SpringLayout.EAST, lastNameLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, lastNameTextField, -3, SpringLayout.NORTH, firstNameLabel);
		lastNameTextField.setColumns(20);
		this.add(lastNameTextField);
		
		mainLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 0, SpringLayout.WEST, branchLocationLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 0, SpringLayout.NORTH, firstNameLabel);
		lastNameLabel.setText("Last Name");
		this.add(lastNameLabel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, paymentOptionLabel, 15, SpringLayout.SOUTH, firstNameLabel);
		mainLayout.putConstraint(SpringLayout.WEST, paymentOptionLabel, 0, SpringLayout.WEST, interLabel);
		paymentOptionLabel.setText("Payment Option");
		add(paymentOptionLabel);
		
		paymentOptionComboBox.setModel(new DefaultComboBoxModel(new String[] {"Pay In Full", "Make A Donation", "Not Able To Pay"}));
		mainLayout.putConstraint(SpringLayout.WEST, paymentOptionComboBox, 0, SpringLayout.WEST, interTextField);
		mainLayout.putConstraint(SpringLayout.SOUTH, paymentOptionComboBox, 0, SpringLayout.SOUTH, paymentOptionLabel);
		mainLayout.putConstraint(SpringLayout.EAST, paymentOptionComboBox, 126, SpringLayout.WEST, interTextField);
		add(paymentOptionComboBox);
		
		mainLayout.putConstraint(SpringLayout.NORTH, branchLocationLabel, 3, SpringLayout.NORTH, interTextField);
		mainLayout.putConstraint(SpringLayout.WEST, branchLocationLabel, 87, SpringLayout.EAST, interTextField);
		branchLocationLabel.setText("Branch");
		add(branchLocationLabel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, branchLocationComboBox, 0, SpringLayout.NORTH, interTextField);
		mainLayout.putConstraint(SpringLayout.WEST, branchLocationComboBox, 0, SpringLayout.WEST, lastNameTextField);
		mainLayout.putConstraint(SpringLayout.EAST, branchLocationComboBox, 205, SpringLayout.EAST, branchLocationLabel);
		branchLocationComboBox.setModel(new DefaultComboBoxModel(new String[] {"Caymanas Park", "Winchester Road"}));
		add(branchLocationComboBox);
		
		mainLayout.putConstraint(SpringLayout.NORTH, emailLabel, 0, SpringLayout.NORTH, paymentOptionLabel);
		mainLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, branchLocationLabel);
		emailLabel.setText("Email Address");
		add(emailLabel);
		
		mainLayout.putConstraint(SpringLayout.EAST, emailTextField, 223, SpringLayout.WEST, lastNameTextField);
		mainLayout.putConstraint(SpringLayout.NORTH, emailTextField, 6, SpringLayout.SOUTH, lastNameTextField);
		mainLayout.putConstraint(SpringLayout.WEST, emailTextField, 0, SpringLayout.WEST, lastNameTextField);
		emailTextField.setColumns(20);
		add(emailTextField);
		
		mainLayout.putConstraint(SpringLayout.WEST, emailOptionComboBox, 8, SpringLayout.EAST, emailTextField);
		mainLayout.putConstraint(SpringLayout.EAST, emailOptionComboBox, 108, SpringLayout.EAST, emailTextField);
		mainLayout.putConstraint(SpringLayout.NORTH, emailOptionComboBox, 0, SpringLayout.NORTH, paymentOptionComboBox);
		emailOptionComboBox.setEditable(true);
		emailOptionComboBox.setModel(new DefaultComboBoxModel(new String[] {"@gmail.com", "@hotmail.com", "@live.com", "@yahoo.com"}));
		add(emailOptionComboBox);
		
		mainLayout.putConstraint(SpringLayout.SOUTH, mAddressPanel, -6, SpringLayout.NORTH, homeNumLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, mAddressPanel, -62, SpringLayout.NORTH, homeNumLabel);
		mainLayout.putConstraint(SpringLayout.WEST, mAddressPanel, 0, SpringLayout.WEST, interLabel);
		mainLayout.putConstraint(SpringLayout.EAST, mAddressPanel, 714, SpringLayout.WEST, interLabel);
		this.add(mAddressPanel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, homeNumLabel, 174, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, homeNumLabel, 0, SpringLayout.WEST, interLabel);
		homeNumLabel.setText("Home Number");
		add(homeNumLabel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, homeNumTextField, 68, SpringLayout.SOUTH, paymentOptionComboBox);
		mainLayout.putConstraint(SpringLayout.WEST, homeNumTextField, 0, SpringLayout.WEST, interTextField);
		mainLayout.putConstraint(SpringLayout.EAST, homeNumTextField, 33, SpringLayout.EAST, interTextField);
		homeNumTextField.setColumns(20);
		add(homeNumTextField);
		
		mainLayout.putConstraint(SpringLayout.NORTH, mobileNumLabel, 0, SpringLayout.NORTH, homeNumLabel);
		mainLayout.putConstraint(SpringLayout.WEST, mobileNumLabel, 0, SpringLayout.WEST, lastNameLabel);
		mobileNumLabel.setText("Mobile Number");
		add(mobileNumLabel);
		
		mainLayout.putConstraint(SpringLayout.WEST, mobileNumTextField, 0, SpringLayout.WEST, lastNameTextField);
		mainLayout.putConstraint(SpringLayout.SOUTH, mobileNumTextField, 0, SpringLayout.SOUTH, homeNumLabel);
		mainLayout.putConstraint(SpringLayout.EAST, mobileNumTextField, 126, SpringLayout.WEST, lastNameTextField);
		mobileNumTextField.setColumns(20);
		add(mobileNumTextField);
		
		mainLayout.putConstraint(SpringLayout.NORTH, reasonVisitLabel, 18, SpringLayout.SOUTH, homeNumLabel);
		mainLayout.putConstraint(SpringLayout.WEST, reasonVisitLabel, 0, SpringLayout.WEST, interLabel);
		reasonVisitLabel.setText("Reason Visit");
		add(reasonVisitLabel);
		
		mainLayout.putConstraint(SpringLayout.WEST, reasonVisitTextField, 48, SpringLayout.EAST, reasonVisitLabel);
		mainLayout.putConstraint(SpringLayout.EAST, reasonVisitTextField, 656, SpringLayout.EAST, reasonVisitLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, reasonVisitTextField, 12, SpringLayout.SOUTH, homeNumTextField);
		reasonVisitTextField.setColumns(20);
		add(reasonVisitTextField);
		
		mainLayout.putConstraint(SpringLayout.EAST, mDatePanel, 383, SpringLayout.WEST, interLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, mDatePanel, 6, SpringLayout.SOUTH, reasonVisitLabel);
		mainLayout.putConstraint(SpringLayout.WEST, mDatePanel, 0, SpringLayout.WEST, interLabel);
		mainLayout.putConstraint(SpringLayout.SOUTH, mDatePanel, 71, SpringLayout.SOUTH, reasonVisitLabel);
		add(mDatePanel);
		
		mainLayout.putConstraint(SpringLayout.NORTH, mAnimalPanel, 6, SpringLayout.SOUTH, mDatePanel);
		mainLayout.putConstraint(SpringLayout.WEST, mAnimalPanel, 0, SpringLayout.WEST, interLabel);
		mainLayout.putConstraint(SpringLayout.SOUTH, mAnimalPanel, 62, SpringLayout.SOUTH, mDatePanel);
		mainLayout.putConstraint(SpringLayout.EAST, mAnimalPanel, 588, SpringLayout.WEST, interLabel);
		add(mAnimalPanel);
		
		optionGroup.add(treatmentOptionRBtn);
		treatmentOptionRBtn.addActionListener(this);
		treatmentOptionRBtn.setBackground(new Color(153, 255, 204));
		mainLayout.putConstraint(SpringLayout.NORTH, treatmentOptionRBtn, 6, SpringLayout.SOUTH, mRemovalPanel);
		mainLayout.putConstraint(SpringLayout.SOUTH, treatmentOptionRBtn, 29, SpringLayout.SOUTH, mRemovalPanel);
		mainLayout.putConstraint(SpringLayout.WEST, treatmentOptionRBtn, 0, SpringLayout.WEST, interLabel);
		add(treatmentOptionRBtn);
		
		mainLayout.putConstraint(SpringLayout.NORTH, mRemovalPanel, 6, SpringLayout.SOUTH, removalOptionRBtn);
		mainLayout.putConstraint(SpringLayout.SOUTH, mRemovalPanel, 135, SpringLayout.SOUTH, removalOptionRBtn);
		mainLayout.putConstraint(SpringLayout.WEST, mRemovalPanel, 10, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.EAST, mRemovalPanel, 724, SpringLayout.WEST, this);
		this.enableComponents(mRemovalPanel, false);
		add(mRemovalPanel);
		
		optionGroup.add(removalOptionRBtn);
		removalOptionRBtn.addActionListener(this);
		removalOptionRBtn.setBackground(new Color(153, 255, 204));
		mainLayout.putConstraint(SpringLayout.NORTH, removalOptionRBtn, 6, SpringLayout.SOUTH, mAnimalPanel);
		mainLayout.putConstraint(SpringLayout.SOUTH, removalOptionRBtn, 29, SpringLayout.SOUTH, mAnimalPanel);
		mainLayout.putConstraint(SpringLayout.WEST, removalOptionRBtn, 0, SpringLayout.WEST, interLabel);
		add(removalOptionRBtn);
		
		mainLayout.putConstraint(SpringLayout.NORTH, mTreatmentPanel, 6, SpringLayout.SOUTH, treatmentOptionRBtn);
		mainLayout.putConstraint(SpringLayout.WEST, mTreatmentPanel, 0, SpringLayout.WEST, interLabel);
		mainLayout.putConstraint(SpringLayout.SOUTH, mTreatmentPanel, 118, SpringLayout.SOUTH, treatmentOptionRBtn);
		mainLayout.putConstraint(SpringLayout.EAST, mTreatmentPanel, 640, SpringLayout.WEST, interLabel);
		this.enableComponents(mTreatmentPanel, false);
		add(mTreatmentPanel);
	}
	
	public void enableComponents(Container comp, boolean en)
	{
		Component[] comps = comp.getComponents();
		for(int i = 0; i < comps.length; i++)
		{
			comps[i].setEnabled(en);
			if(comps[i] instanceof Container)
				enableComponents((Container)comps[i], en);
		}
	}

	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == removalOptionRBtn)
			this.enableComponents(mRemovalPanel, true);
		else
			this.enableComponents(mRemovalPanel, false);
			
		if(event.getSource() == treatmentOptionRBtn)
			this.enableComponents(mTreatmentPanel, true);
		else
			this.enableComponents(mTreatmentPanel, false);
	}
}
