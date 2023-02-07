package util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import controller.CountryController;
import modelos.Country;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CountryController catCtrl = new CountryController();
			List<Country> lc = catCtrl.leerTodos();
			catCtrl.listarCats(lc);
			
			catCtrl.mostrarCat(catCtrl.leerUno("CA"));
			
			Country ca = new Country("CA", "MiPais", 66);
			
			catCtrl.actualizar(ca);
			
			catCtrl.listarCats(lc);
			
			catCtrl.borrar(ca);
			
			catCtrl.listarCats(lc);
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} /*finally {
			cerrarConexion();
		}*/
		
	}

}
