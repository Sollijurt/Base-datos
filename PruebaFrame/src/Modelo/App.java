package Modelo;

import java.util.Random;

import Dao.DAO;

public class App {

	
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		
		//System.out.println(DAO.agregar("INSERT INTO `baseprueba`.`estudiantes`(`ID_estudiante`,`NOMBRE_estudiante`,`DNI_estudiante`)VALUES(2,'nico','932322');"));
		//System.out.println(DAO.agregar("INSERT INTO `baseprueba`.`estudiantes`(`ID_estudiante`,`NOMBRE_estudiante`,`DNI_estudiante`)VALUES(5,'n32ico','101010202');"));
		//System.out.println(dao.eliminar());
		//System.out.println(dao.eliminarConCondicionDNI("674283387"));
		System.out.println(dao.actualizarNombrePorDNI("pablo", "344408247"));
		//crearRandoms(dao);
		
		
	}
	public static  void crearRandoms(DAO dao) {
		Random ran = new Random();
		for(int i = 1; i < 11; i++) {
			String dni = ran.nextInt(0,999999999) + "";
			dao.agregarEstudiante(i, "nica", dni);
		}
	}
	
}
