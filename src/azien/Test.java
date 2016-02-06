package azien;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

import java.awt.GridLayout;

public class Test extends JFrame {
	public Test() {
		this.setSize(782, 414);
	    getContentPane().setLayout(new GridLayout(1,1));
	    CopyOfAddPanel panel = new CopyOfAddPanel();  
	    panel.setPreferredSize(new Dimension(735, 700));
	    JScrollPane scroller = new JScrollPane(panel);
	    this.getContentPane().add(scroller);  
	}

}
