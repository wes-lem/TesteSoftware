public class EmployeeDetails{
	private String nome;
	private double salarioMensal;
	private int idade;

	// Construtor Padrão
	public EmployeeDetails(){ }

	// Construtor
	public EmployeeDetails(String nome, double salarioMensal, int idade){
		if(salarioMensal <= 0){
			throw new IllegalArgumentException("Salário deve ser maior que 0");
		}
		if(idade < 0){
			throw new IllegalArgumentException("Idade deve ser maior que 0");
		}
		this.nome = nome;
		this.salarioMensal = salarioMensal;
		this.idade = idade;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setSalarioMensal(double salarioMensal){
		if(salarioMensal <= 0)
			throw new IllegalArgumentException("Salário deve ser maior que 0");
		this.salarioMensal = salarioMensal;
	}

	public void setIdade(int idade){
		if(idade <= 0)
			throw new IllegalArgumentException("Idade deve ser maior que 0");
		this.idade = idade;
	}

	public String getNome(){
		return nome;
	}

	public double getSalarioMensal(){
		return salarioMensal;
	}

	public int getIdade(){
		return idade;
	}

	public double calcularSalarioAnual(){
		return 12 * getSalarioMensal();
	}

	public double calcularTaxa(){
		if(getSalarioMensal() < 5000 )
			return 0.05 * calcularSalarioAnual();
		else
			return 0.1 * calcularSalarioAnual();
	}
}

