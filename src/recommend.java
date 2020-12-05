import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class recommend extends JFrame {
	 JPanel contentPane;
	
	
	public recommend() {
		
		setBounds(0, 0, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\\uD300\uD504 \uC637\uCC28\uB9BC\\\uD328\uB529.jpg"));
		lblNewLabel.setBounds(14, 84, 414, 800);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uB529, \uB450\uAEBC\uC6B4 \uCF54\uD2B8, \uBAA9\uB3C4\uB9AC, \uAE30\uBAA8\uC81C\uD488 \uCD94\uCC9C !");
		lblNewLabel_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 25));
		lblNewLabel_1.setBounds(405, 326, 517, 249);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\\uD300\uD504 \uC637\uCC28\uB9BC\\\uBAA9\uB3C4\uB9AC.jpg"));
		lblNewLabel_2.setBounds(442, 25, 360, 275);
		panel.add(lblNewLabel_2);
		
		this.setVisible(true);
	}
	
}
