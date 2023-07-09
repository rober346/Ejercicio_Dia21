package ejerDia21;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

public class texto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					texto frame = new texto();
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
	public texto() {
		setTitle("NOTAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 29, 414, 178);
		contentPane.add(textArea);
		
		JLabel lbltexto1 = new JLabel("INGRESA EL TEXTO:");
		lbltexto1.setBounds(10, 11, 132, 14);
		contentPane.add(lbltexto1);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.setBounds(10, 218, 212, 23);
		contentPane.add(btnguardar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(232, 218, 192, 23);
		contentPane.add(btnSalir);
	}

}
