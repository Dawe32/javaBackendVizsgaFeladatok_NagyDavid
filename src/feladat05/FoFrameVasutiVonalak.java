package feladat05;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoFrameVasutiVonalak {
	
	private JFrame frmFoablak;
	private JTable table;
	private DefaultTableModel model;
	private ABKezelo dbMotor;

	private List<VasutVonal> vasutVonalak;
	private JTextField textField;
	
	
	public JFrame getFrmFoablak() {
		return frmFoablak;
	}

	public FoFrameVasutiVonalak() {
		
		initialize();
		
		try {
			
			String connectionURL = "jdbc:mysql://localhost:3306/vasutvonalak?autoReconnect=true&useSSL=false";
			dbMotor = new ABKezelo(connectionURL,"root","Ruander2000");
			
			dbMotor.csatlakozas();
			vasutVonalak = dbMotor.vasutLekerdezo();
			dbMotor.bontas();
			
			tablaFeltoltes();
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(frmFoablak, e.getMessage(),"Hiba",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

	
	private void tablaFeltoltes() {
		
		String oszlopNevek[] = {"Vonalszám","Indulási állomás","Célállomás","Távolság (km)","Ár (Ft)"};
		model = new DefaultTableModel(null,oszlopNevek);
		table.setModel(model);
		for (VasutVonal vonal : vasutVonalak) {
			Object[] adatok = new Object[] 
					{vonal.getVonalszam(), vonal.getStartallomas(), vonal.getCelallomas(), vonal.getTavolsag_km(), vonal.getAlapar()}; 
			model.insertRow(table.getRowCount(), adatok);
		}	
		
	}

	
	private void initialize() {
		frmFoablak = new JFrame();
		frmFoablak.setTitle("Vasúti vonalak");
		frmFoablak.setBounds(100, 100, 500, 400);
		frmFoablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFoablak.getContentPane().setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 10, 440, 246);
		frmFoablak.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(220, 289, 166, 20);
		frmFoablak.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Árváltozás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton.setBounds(48, 288, 89, 23);
		frmFoablak.getContentPane().add(btnNewButton);
				
	}
}
