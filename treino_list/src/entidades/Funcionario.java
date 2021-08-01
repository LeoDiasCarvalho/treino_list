package entidades;

import java.util.Date;

public class Funcionario {
	
	private int id;
	private String nome;
	private Date dataNascimento;
	private double salario;
	
	public Funcionario() {
	}

	public Funcionario(int id, String nome, Date dataNascimento, double salario) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

	
	
	
	
	
	

}
