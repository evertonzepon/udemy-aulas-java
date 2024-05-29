package entities;

public class Company extends TaxPayer {
	private Integer employees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	
	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double taxes() {
		if(employees < 10) {
			return getAnualIncome() * 0.16;
		} else {
			return getAnualIncome() * 0.14;
		}
	}
}