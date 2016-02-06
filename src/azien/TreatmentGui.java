package azien;

import javax.swing.JFrame;

public class TreatmentGui extends JFrame {
	
	private AddPanel mainPanel;
	
	public TreatmentGui() {
		setResizable(false);
		
		mainPanel = new AddPanel();
		
		setUpTreatmentGui();
		
	}
	
	private void setUpTreatmentGui()
	{
		this.setContentPane(mainPanel);
	}

}
