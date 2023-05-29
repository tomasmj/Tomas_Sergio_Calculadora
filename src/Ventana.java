import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField_resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_siete = new JButton("7");
		btn_siete.setBounds(66, 156, 49, 50);
		contentPane.add(btn_siete);
		
		JButton btn_borrar = new JButton("C");
		btn_borrar.setBounds(362, 67, 111, 43);
		contentPane.add(btn_borrar);
		
		textField_resultado = new JTextField();
		textField_resultado.setBounds(29, 26, 306, 98);
		contentPane.add(textField_resultado);
		textField_resultado.setColumns(10);
		
		JButton btn_ocho = new JButton("8");
		btn_ocho.setBounds(153, 156, 49, 50);
		contentPane.add(btn_ocho);
		
		JButton btn_nueve = new JButton("9");
		btn_nueve.setBounds(231, 156, 49, 50);
		contentPane.add(btn_nueve);
		
		JButton btn_cuatro = new JButton("4");
		btn_cuatro.setBounds(66, 216, 49, 50);
		contentPane.add(btn_cuatro);
		
		JButton btn_cinco = new JButton("5");
		btn_cinco.setBounds(153, 216, 49, 50);
		contentPane.add(btn_cinco);
		
		JButton btn_seis = new JButton("6");
		btn_seis.setBounds(231, 216, 49, 50);
		contentPane.add(btn_seis);
		
		JButton btn_uno = new JButton("1");
		btn_uno.setBounds(66, 276, 49, 50);
		contentPane.add(btn_uno);
		
		JButton btn_dos = new JButton("2");
		btn_dos.setBounds(153, 276, 49, 50);
		contentPane.add(btn_dos);
		
		JButton btn_tres = new JButton("3");
		btn_tres.setBounds(231, 276, 49, 50);
		contentPane.add(btn_tres);
		
		JButton btn_cero = new JButton("0");
		btn_cero.setBounds(153, 336, 49, 50);
		contentPane.add(btn_cero);
		
		JButton btn_suma = new JButton("+");
		btn_suma.setBounds(395, 156, 49, 50);
		contentPane.add(btn_suma);
		
		JButton btn_resta = new JButton("-");
		btn_resta.setBounds(395, 216, 49, 50);
		contentPane.add(btn_resta);
		
		JButton btn_multiplicación = new JButton("*");
		btn_multiplicación.setBounds(395, 276, 49, 50);
		contentPane.add(btn_multiplicación);
		
		JButton btn_division = new JButton("/");
		btn_division.setBounds(395, 336, 49, 50);
		contentPane.add(btn_division);
		
		JButton btn_resultado = new JButton("=");
		btn_resultado.setBounds(231, 336, 49, 50);
		contentPane.add(btn_resultado);
		
		JButton btn_coma = new JButton(",");
		btn_coma.setBounds(66, 336, 49, 50);
		contentPane.add(btn_coma);
	}

}
