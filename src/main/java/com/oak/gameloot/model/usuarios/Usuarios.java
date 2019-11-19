package com.oak.gameloot.model.usuarios;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable{
		public Usuarios() {
			// TODO Auto-generated constructor stub
			super();
		}
		private static final long SerialVersionUID = 1L;
				
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;

		private String nome;
		private String endereco;
		private String numeroDaResidencia;
		private String bairro;
		private String rg;
		private String cpf;
		private String dataNacimento;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNumeroDaResidencia() {
			return numeroDaResidencia;
		}

		public void setNumeroDaResidencia(String numeroDaResidencia) {
			this.numeroDaResidencia = numeroDaResidencia;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getDataNacimento() {
			return dataNacimento;
		}

		public void setDataNacimento(String dataNacimento) {
			this.dataNacimento = dataNacimento;
		}
		
	
		
	
}
