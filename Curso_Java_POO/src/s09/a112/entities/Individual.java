package s09.a112.entities;

//Exercício de fixação

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;

	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
		
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxPaid() {
		if(getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.50;
		}
		else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.50;
		}
	}
	
}
