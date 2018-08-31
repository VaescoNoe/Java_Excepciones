package mx.com.twg;

import mx.com.twg.datos.*;
import mx.com.twg.exception.*;

public class MainManejoExcepciones {

	public static void main(String... args){
		
		AccesoDatos datos = new ImplementacionMySql();
		
		datos.simularError(false);
		ejecutar(datos,"listar");
		
		datos.simularError(true);
		ejecutar(datos,"insertar");
	}
	
	public static void ejecutar(AccesoDatos datos,String accion){
		if("listar".equals(accion)) {
			
			try {
				datos.listar();
			}catch(LecturaDatosExc e) {
				System.out.println("Error lectura: Procesa la exception mas especifica de lectura de datos\n");
				e.printStackTrace();
			}catch(AccesoDatosExc ei) {
				System.out.println("Error acceso a datos: Procesa la exception mas generica de acceso a datos\n");
				ei.printStackTrace();
			}catch(Exception a) {
				System.out.println("Error general\n");
				a.printStackTrace();
			}finally {
				System.out.println("Proceso finally es opcional listar\n");
			}
			
		}else if("insertar".equals(accion)){
			
			try {
				datos.insertar();
			}catch(EscrituraDatosExc e) {
				System.out.println("Error escritura: Procesa la exception mas especifica de lectura de datos\n");
				e.printStackTrace();
			}catch(AccesoDatosExc ei) {
				System.out.println("Error acceso datos: Podemos procesar solo la exception más generica\n");
				ei.printStackTrace();
			}finally {
				System.out.println("Proceso finally es opcional insertar\n");
			}
			
		}else {
			System.out.println("No se proporciono ninguna acción ");
		}
	}
	
}
