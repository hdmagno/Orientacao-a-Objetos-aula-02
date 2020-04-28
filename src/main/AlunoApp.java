package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Aluno;
import entity.Endereco;

public class AlunoApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<>();
		char resp;
		
		Aluno a = new Aluno(10L, "Amanda", "amanda@gmail.com");
		Aluno b = new Aluno(20L, "Diego", "diego@gmail.com", new Endereco(1L, "Benfica", "Rio de Janeiro"));
		Aluno c = new Aluno(30L, "Mel", "Mel@gmail.com", new Endereco(1L, "Vila Rosário", "Duque de Caxias"));
		
		Endereco endereco = new Endereco(2L, "Vila Rosário", "Duque de Caxias");
		a.setEndereco(endereco);
		
		System.out.print("Quantos alunos serão cadastrados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Digite os dados do Aluno número: " + i);
			System.out.print("Código do aluno: ");
			long idAluno = sc.nextLong();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Será cadastrado endereço para esse aluno? ");
			resp = sc.next().charAt(0);
			if (resp == 'n' || resp == 'N') {
				alunos.add(new Aluno(idAluno, nome, email));
			}
			else {
				System.out.println("Digite o endereço do aluno número: " + i);
				System.out.print("Digite o código do endereco: ");
				long idEndereco = sc.nextLong();
				System.out.print("Bairro: ");
				sc.nextLine();
				String bairro = sc.nextLine();
				System.out.print("Cidade: ");
				String cidade = sc.nextLine();
				alunos.add(new Aluno(idAluno, nome, email, new Endereco(idEndereco, bairro, cidade)));
			}
		}
		System.out.println();
		System.out.println("Alunos cadastrados: ");
		for (Aluno al : alunos) {
			System.out.println(al);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}

}
