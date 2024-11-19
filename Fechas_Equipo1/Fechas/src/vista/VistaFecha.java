package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorFecha;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VistaFecha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAño;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaFecha frame = new VistaFecha();
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
	public VistaFecha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha de Nacimiento");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(43, 11, 184, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dia:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(43, 80, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mes:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(43, 132, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Año:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(43, 190, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtDia = new JTextField();
		txtDia.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key =e.getKeyChar();
				boolean numero=key >=48 && key <=57;
				if (!numero) {
					e.consume();
				}
				if (txtDia.getText().trim().length()==2) {
					e.consume();
				}
			}
		});
		txtDia.setBounds(96, 77, 86, 20);
		contentPane.add(txtDia);
		txtDia.setColumns(10);
		
		txtMes = new JTextField();
		txtMes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key =e.getKeyChar();
				boolean numero=key >=48 && key <=57;
				if (!numero) {
					e.consume();
				}
				if (txtMes.getText().trim().length()==2) {
					e.consume();
				}
			}
		});
		txtMes.setBounds(99, 129, 86, 20);
		contentPane.add(txtMes);
		txtMes.setColumns(10);
		
		txtAño = new JTextField();
		txtAño.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key =e.getKeyChar();
				boolean numero=key >=48 && key <=57;
				if (!numero) {
					e.consume();
				}
				if (txtAño.getText().trim().length()==4) {
					e.consume();
				}
			
				
			}
		});
		txtAño.setBounds(96, 187, 86, 20);
		contentPane.add(txtAño);
		txtAño.setColumns(10);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setBounds(96, 264, 89, 23);
		contentPane.add(btnGuardar);
	}
	private boolean guardar() {
		ControladorFecha fc=new ControladorFecha();
		boolean guarda=false;
		int dia=Integer.parseInt(txtDia.getText());
		int mes=Integer.parseInt(txtMes.getText());
		int año=Integer.parseInt(txtAño.getText());

		return guarda;
	}
}
