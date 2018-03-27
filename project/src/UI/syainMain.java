package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JButton;

public class syainMain extends JFrame {

	static JPanel contentPane;
	static String attime;
	Thread trd;
	static Calendar cal;
	static SimpleDateFormat time;
	static JLabel lblNewLabel_1;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				syainMain frame = new syainMain();
				frame.setVisible(true);
					
					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}
				}
			
			
		});
	}

	public syainMain() {
		setTitle("\u793E\u54E1\u306E\u30DA\u30A4\u30B8\u30FC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cal = Calendar.getInstance();
		time = new SimpleDateFormat("yyyyÒ´MMêÅddìí¡£ÕÞª¤ìéìí¡£");
		attime = time.format(cal.getTime());
		
		JLabel lblNewLabel = new JLabel(attime);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 29));
		lblNewLabel.setBounds(80, 0, 654, 81);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(14, 108, 791, 493);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("\u30E1\u30C3\u30BB\u30F3\u30B8\u30E3\u30FC");
		btnNewButton.setFont(new Font("Yu Mincho Demibold", Font.PLAIN, 15));
		btnNewButton.setBounds(14, 623, 168, 41);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("\u793E\u54E1\u30EA\u30B9\u30C8");
		button_1.setBounds(239, 623, 161, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u304A\u77E5\u3089\u305B\u767B\u9332");
		button_2.setBounds(458, 623, 161, 41);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u7D42\u4E86");
		button_3.setBounds(673, 623, 132, 41);
		contentPane.add(button_3);
		
		
		
//		lblNewLabel = new JLabel(attime);
//		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 30));
//		lblNewLabel.setBounds(0, 0, 819, 92);
		
		
		
		System.out.println("run");
			
		
		
		
		
		
	}
}
