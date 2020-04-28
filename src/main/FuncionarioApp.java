package main;

import entity.Funcionario;
import manager.BeanFuncionario;

public class FuncionarioApp {

	public static void main(String[] args) {

		BeanFuncionario bean = new BeanFuncionario();
		
		Funcionario a = new Funcionario(10L, "Amanda", "Recrutadora", 4500D, 300D, 200D);
		Funcionario b = new Funcionario(20L, "Diego", "Programador", 4000D, 300D, 100D);
		bean.adicionar(a);
		bean.adicionar(b);
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
