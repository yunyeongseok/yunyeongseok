package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import client.clientManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private clientManager cm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setTitle("\uFF2D\uFF21\uFF29\uFF2E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u793E\u5185\u7BA1\u7406\u30B7\u30B9\u30C6\u30E0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 50));
		lblNewLabel.setBounds(0, 0, 432, 85);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u30B7\u30B9\u30C6\u30E0\u7BA1\u7406\u8005");
		rdbtnNewRadioButton.setBounds(10, 109, 139, 27);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(" \u4EBA \u4E8B \u7BA1 \u7406 \u8005");
		rdbtnNewRadioButton_1.setBounds(10, 140, 139, 28);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("  \u793E         \u54E1");
		rdbtnNewRadioButton_2.setBounds(10, 172, 139, 27);
		contentPane.add(rdbtnNewRadioButton_2);
		
		textField = new JTextField();
		textField.setBounds(265, 142, 116, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(265, 173, 116, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("\u30ED\u30B0\u30A4\u30F3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cm = new clientManager();
			}
		});
		btnNewButton.setBounds(219, 214, 105, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7D42\u3000\u4E86");
		btnNewButton_1.setBounds(327, 214, 105, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel(" \u793E \u54E1 \u756A \u53F7");
		label.setBounds(170, 145, 90, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u30D1\u30FC\u30B9\u30EF\u30FC\u30C9");
		label_1.setBounds(170, 176, 90, 18);
		contentPane.add(label_1);
	}
}
