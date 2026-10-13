package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DAO {
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/db_53prueba";
	String sql = "INSERT INTO `db_53prueba`.`estudiantes`(`pk_alumno`,`nombreAlumno`,`dniAlumno`)VALUES(233,'lauti','43243');";
	
	public Connection conectar() {
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(path, user, psw);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conexion;
	}
	
	public int agregar() {
		Connection conexion = null;
		int fila = 0;
		try {
			conexion = conectar();
			Statement stmt = conexion.createStatement();
			fila =stmt.executeUpdate(sql);
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
	
}
