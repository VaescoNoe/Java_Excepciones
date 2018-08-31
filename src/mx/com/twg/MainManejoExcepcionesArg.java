package mx.com.twg;

import mx.com.twg.domain.Division;
import mx.com.twg.exception.OperationException;

public class MainManejoExcepcionesArg {
	
	public static void main(String... args) throws OperationException{
		try {
			System.out.println("Cambio de valores en los argumentos del Main");
			// En Eclipse, sobre el proyecto click secundario
			//Propiedades > Run > Main > edit 
			// > MainClass: Seleccionar Main correspondiente 
			// && 
			// en Arguments: Program Arguments: valores 10 1 (con un espacio entre datos es suficiente)
			int op1 = Integer.parseInt(args[0]);
			int op2 = Integer.parseInt(args[1]);
			
			Division div = new Division(op1, op2);
			div.visualizarOperacion();
		}catch(ArrayIndexOutOfBoundsException a){
			a.printStackTrace();
		}catch(NumberFormatException n){
			n.printStackTrace();
		}catch(OperationException o) {
			o.printStackTrace();
		}
	}
}
