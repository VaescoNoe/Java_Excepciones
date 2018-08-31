package mx.com.twg.datos;

import mx.com.twg.exception.*;

public class ImplementacionMySql implements AccesoDatos {
	
	private boolean simularError;

	@Override
	public void insertar() throws AccesoDatosExc {
		if(simularError){
			throw new EscrituraDatosExc("Error de escritura de datos");
		}else{
			System.out.println("Insertar desde MySql");
		}
	}

	@Override
	public void listar() throws AccesoDatosExc {
		if(simularError){
			throw new LecturaDatosExc("Error de lectura de datos");
		}else{
			System.out.println("Listar desde MySql");
		}
	}
	
	public boolean isSimularError(){
		return simularError;
	}

	@Override
	public void setSimularError(boolean simularError) {
		this.simularError=simularError;
	}

}
