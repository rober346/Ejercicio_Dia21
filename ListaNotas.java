package ejerDia21;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;

public class ListaNotas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaNotas frame = new ListaNotas();
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
	public ListaNotas() {
		setTitle("NOTAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 216, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrir = new JButton("ABRIR");
		btnAbrir.setBounds(20, 182, 157, 23);
		contentPane.add(btnAbrir);
		
		JButton btnSalirLista = new JButton("SALIR");
		btnSalirLista.setBounds(20, 216, 157, 23);
		contentPane.add(btnSalirLista);
		
		JList lista = new JList();
		lista.setBounds(51, 11, 89, 160);
		contentPane.add(lista);
		lista.setModel(new AbstractListModel() {
			String[] values = new String[] {"NOTA 1", "NOTA 2", "NOTA 3", "NOTA 4", "NOTA 5", "NOTA 6", "NOTA 7", "NOTA 8", "NOTA 9", "NOTA 10"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
