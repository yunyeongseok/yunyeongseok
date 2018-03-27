package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;

public class syainlistGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					syainlistGUI window = new syainlistGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public syainlistGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 772, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u5168\u4F53\u898B\u308B");
		rdbtnNewRadioButton.setBounds(10, 8, 139, 27);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("\u6280\u8853\u793E\u54E1");
		radioButton.setBounds(10, 39, 139, 27);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u305D\u306E\u4ED6\u306E\u793E\u54E1");
		radioButton_1.setBounds(10, 70, 139, 27);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u4ECA\u65E5\u304B\u3089\u306E\u8A95\u751F\u65E5\u9806");
		radioButton_2.setBounds(10, 101, 163, 27);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("\u5165\u793E\u9806");
		radioButton_3.setBounds(10, 132, 139, 27);
		frame.getContentPane().add(radioButton_3);
		
		table = new JTable();
		table.setBounds(190, 12, 550, 497);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("\u793E\u54E1\u8FFD\u52A0");
		btnNewButton.setBounds(10, 482, 173, 27);
		frame.getContentPane().add(btnNewButton);
	}
}
