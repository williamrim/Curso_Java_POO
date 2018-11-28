package s09.a112.entities;

//Exercício de fixação

public class Company extends TaxPayer{
	
	private Integer numberOfEmpolyees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmpolyees) {
		super(name, anualIncome);
		this.numberOfEmpolyees = numberOfEmpolyees;
	}
	
	public Integer getNumberOfEmpolyees() {
		return numberOfEmpolyees;
	}

	public void setNumberOfEmpolyees(Integer numberOfEmpolyees) {
		this.numberOfEmpolyees = numberOfEmpolyees;
	}

	@Override
	public double taxPaid() {
		if(numberOfEmpolyees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}
}
