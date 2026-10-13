package Modelo;

import Dao.DAO;

public class App {

	public static void main(String[] args) {
		DAO miPrimerDAO = new DAO();
		
		System.out.println(miPrimerDAO.agregar());
	}

}
