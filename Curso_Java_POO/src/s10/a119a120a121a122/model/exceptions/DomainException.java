package s10.a119a120a121a122.model.exceptions;

//Terceira solução - boa

public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
		
}
