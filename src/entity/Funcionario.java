package entity;

public class Funcionario {
	
	private Long id;
	private String nome;
	private String funcao;
	private Double salario;
	private Double desconto;
	private Double bonus;
	
	public Funcionario() {
	}

	public Funcionario(Long id, String nome, String funcao, Double salario, Double desconto, Double bonus) {
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
		this.desconto = desconto;
		this.bonus = bonus;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome)  {
		this.nome = nome;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public Double getBonus() {
		return bonus;
	}
	
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	public void gerarSalario() {
		salario = salario - desconto + bonus;
	}
	
	public String toString() {
		return "Id: "
				+ id
				+ ", Nome: "
				+ nome
				+ ", Função: "
				+ funcao
				+ ", Salário: "
				+ String.format("R$%.2f", salario);
	}
}
