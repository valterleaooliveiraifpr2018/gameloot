package com.oak.gameloot.model.administrativo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable{
	public Funcionario() {
		// TODO Auto-generated constructor stub
		super();
	}
	private static final long SerialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String salarioBruto;
	
//	@Temporal(TemporalType.DATE)
//	private String dataEntrada;
	
//	@Temporal(TemporalType.DATE)
//	private String dataSaida;
	
	private String cargo;
	private String cidade;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String uf;
	private String cep;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(String salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
//	public String getDataEntrada() {
//		return dataEntrada;
//	}
//	public void setDataEntrada(String dataEntrada) {
//		this.dataEntrada = dataEntrada;
//	}
//	public String getDataSaida() {
//		return dataSaida;
//	}
//	public void setDataSaida(String dataSaida) {
//		this.dataSaida = dataSaida;
//	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	
	
	
	

}
