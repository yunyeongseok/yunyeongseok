package UI;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class osirasemiruGUI {

	private JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					osirasemiruGUI window = new osirasemiruGUI();
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
	public osirasemiruGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 674, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("\u30BF\u30A4\u30C8\u30EB\u3092\u5165\u529B\u3057\u3066\u304F\u3060\u3055\u3044");
		textField.setBounds(14, 12, 628, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText("\u304A\u77E5\u3089\u305B\u306E\u5185\u5BB9\u3092\u5165\u529B\u3057\u3066\u304F\u3060\u3055\u3044");
		editorPane.setBounds(14, 48, 628, 342);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("\u9589\u3058\u308B");
		btnNewButton.setBounds(273, 402, 105, 27);
		frame.getContentPane().add(btnNewButton);
	}

}
