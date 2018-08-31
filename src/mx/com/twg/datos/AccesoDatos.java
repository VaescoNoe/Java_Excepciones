package mx.com.twg.datos;

import mx.com.twg.exception.AccesoDatosExc;

public interface AccesoDatos {

	public abstract void insertar() throws AccesoDatosExc;
	
	public abstract void listar() throws AccesoDatosExc;
	
	public abstract void simularError(boolean simularError);
}
