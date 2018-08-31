package mx.com.twg;

import mx.com.twg.domain.Division;
import mx.com.twg.exception.OperationException;

public class Main {

	public static void main(String[] args) {
		try {
			Division division = new Division(10, 0);
			division.visualizarOperacion();
		}catch(OperationException e){
			e.printStackTrace();
		}
	}
	


}
