package entity;

public class Endereco {
	
	private Long idEndereco;
	private String bairro;
	private String cidade;
	
	private Aluno aluno;
	
	public Endereco() {
	}

	public Endereco(Long idEndereco, String bairro, String cidade) {
		this.idEndereco = idEndereco;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public Endereco(Long idEndereco, String bairro, String cidade, Aluno aluno) {
		this.idEndereco = idEndereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.aluno = aluno;
	}
	
	public Long getIdEndereco() {
		return idEndereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public String toString() {
		return "Id: "
				+ idEndereco
				+ ", Bairro: "
				+ bairro
				+ ", Cidade: "
				+ cidade;
	}
}
