package br.com.view;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class teste extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * This is the default constructor
	 */
	public teste() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setLayout(new GridBagLayout());
	}

}  //  @jve:decl-index=0:visual-constraint="199,51"
