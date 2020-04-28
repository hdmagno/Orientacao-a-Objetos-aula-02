package manager;

import java.util.ArrayList;
import java.util.List;

import entity.Funcionario;

public class BeanFuncionario {
	
	private Funcionario funcionario;
	private List<Funcionario> funcionarios;

	public BeanFuncionario() {
		this.funcionario = new Funcionario();
		this.funcionarios = new ArrayList<Funcionario>();		
		}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void adicionar(Funcionario f) {
		f.gerarSalario();
		funcionarios.add(f);
	}

}
