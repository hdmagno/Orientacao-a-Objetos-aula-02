package entity;

public class Aluno {
	
	private Long idAluno;
	private String nome;
	private String email;
	
	private Endereco endereco;

	public Aluno() {
	}
	
	public Aluno(Long idAluno, String nome, String email) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
	}
	
	public Aluno(Long id, String nome, String email, Endereco endereco) {
		this.idAluno = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}
	
	public Long getIdAluno() {
		return idAluno;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return "Id: "
				+idAluno
				+ ", Nome: "
				+ nome
				+ ", Email: "
				+ email
				+ ", Endereco: "
				+ endereco;
	}
}
