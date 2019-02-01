package model.excetinos;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String mensseger) {
		super(mensseger);
	}

}
