package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DAO {
	private String user = "root";
	private String psw = "admin";
	private String path = "jdbc:mysql://localhost:3306/baseprueba";
	
	private Connection conectar() {
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(path, user, psw);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conexion;
	}
	
	public int agregarEstudiante(int id, String nombre, String dni) {
		String sql = "INSERT INTO `baseprueba`.`estudiantes`(`ID_estudiante`,`NOMBRE_estudiante`,`DNI_estudiante`)VALUES("+id+",'"+nombre+"','"+dni+"');";
		Connection conexion = null;
		int fila = 0;
		try {
			conexion = conectar();
			Statement stmt = conexion.createStatement();
			fila =stmt.executeUpdate(sql);
			stmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fila;
	}
	
	public int eliminar() {
		String sql = "DELETE FROM `baseprueba`.`estudiantes`";
		
		Connection conexion = null;
		int fila = 0;
		try {
			conexion = conectar();
			Statement stmt = conexion.createStatement();
			fila =stmt.executeUpdate(sql);
			stmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fila;
	}
	
	public int eliminarConCondicionDNI(String dni) {
		String sql = "DELETE FROM `baseprueba`.`estudiantes`WHERE DNI_estudiante = '"+dni+"'";
		Connection conexion = null;
		
		return fila;
	}
	
	public int actualizarNombrePorDNI(String nombreNuevo, String DNI) {
		String sql = "UPDATE `baseprueba`.`estudiantes` SET `NOMBRE_estudiante` = '"+nombreNuevo+"' WHERE `DNI_estudiante` = '"+DNI+"';";
		
		Connection conexion = null;
		int fila = 0;
		try {
			conexion = conectar();
			Statement stmt = conexion.createStatement();
			fila =stmt.executeUpdate(sql);
			stmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fila;
	}
	public void traidor(Connection conexion, String sql) {
		int fila = 0;
		try {
			conexion = conectar();
			Statement stmt = conexion.createStatement();
			fila =stmt.executeUpdate(sql);
			stmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
