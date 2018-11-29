package s10.a123.model.exceptions;

//Exercício de fixação

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}

}
