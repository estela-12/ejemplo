package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Fecha;

public class ControladorFecha {
	private Connection con;
	public Connection conectar() {
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fecha","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return con;
		
	}
	public boolean guardar(Fecha fe) {
		boolean guarda=false;
		String sql="insert into fechas values(?,?,?)";
		PreparedStatement ps;
		conectar();
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, fe.getDia());
			ps.setInt(2, fe.getMes());
			ps.setInt(3, fe.getAño());
			int guard=ps.executeUpdate();
			if (guard>0) {
				JOptionPane.showMessageDialog(null, "GUARDADO");
				guarda=true;
			}else {
				JOptionPane.showMessageDialog(null, "NO GUARDADO");
			}
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al guardar"+e);
		}
		return guarda;
	}

}
