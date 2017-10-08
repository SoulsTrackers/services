package br.com.projectservices.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADOS")
public class Estado extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 5495513924968289104L;

	@Id
	@Column(name = "UF")
	private String uf;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "ATIVO")
	private Boolean ativo;
	
	@Column(name = "BLOQUEIO_MOTIVO")
	private String bloqueioMotivo;
	
	@Column(name = "BLOQUEIO_DATA")
	private Date bloqueioData;

	
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getBloqueioMotivo() {
		return bloqueioMotivo;
	}

	public void setBloqueioMotivo(String bloqueioMotivo) {
		this.bloqueioMotivo = bloqueioMotivo;
	}

	public Date getBloqueioData() {
		return bloqueioData;
	}

	public void setBloqueioData(Date bloqueioData) {
		this.bloqueioData = bloqueioData;
	}

}
