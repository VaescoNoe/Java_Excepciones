package mx.com.twg.domain;

import mx.com.twg.exception.OperationException;

public class Division {
	
	private int numerador;
	private int denominador;
	
	public Division(int numerador,int denominador) throws OperationException{
		
		if(denominador==0) {
			throw new OperationException("Denominador igual a cero");
		}
		this.numerador=numerador;
		this.denominador=denominador;
	}

	public void visualizarOperacion(){
		System.out.println("Resultado:"+(numerador/denominador));
	}
	
}
