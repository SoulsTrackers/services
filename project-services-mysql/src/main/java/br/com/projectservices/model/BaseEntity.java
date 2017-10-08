package br.com.projectservices.model;

import java.util.Date;

import javax.persistence.Column;

public class BaseEntity {
	
	@Column(name = "BLOQUEIO_MOTIVO")
	private String bloqueioMotivo;
	
	@Column(name = "BLOQUEIO_DATA")
	private Date BloqueioData;
	
	@Column(name = "INCLUSAO_USUARIO_ID")
	private Long inclusaoUsuario;
	
	@Column(name = "INCLUSAO_DATA")
	private Date inclusaoData;
	
	@Column(name = "ALTERACAO_USUARIO_ID")
	private Long alteracaoUsuario;
	
	@Column(name = "ALTERACAO_DATA")
	private Date alteracaoData;
	
	@Column(name = "VERSAO")
	private Integer versao;
	
	
	
	public String getBloqueioMotivo() {
		return bloqueioMotivo;
	}

	public void setBloqueioMotivo(String bloqueioMotivo) {
		this.bloqueioMotivo = bloqueioMotivo;
	}

	public Date getBloqueioData() {
		return BloqueioData;
	}

	public void setBloqueioData(Date bloqueioData) {
		BloqueioData = bloqueioData;
	}

	public Long getInclusaoUsuario() {
		return inclusaoUsuario;
	}

	public void setInclusaoUsuario(Long inclusaoUsuario) {
		this.inclusaoUsuario = inclusaoUsuario;
	}

	public Date getInclusaoData() {
		return inclusaoData;
	}

	public void setInclusaoData(Date inclusaoData) {
		this.inclusaoData = inclusaoData;
	}

	public Long getAlteracaoUsuario() {
		return alteracaoUsuario;
	}

	public void setAlteracaoUsuario(Long alteracaoUsuario) {
		this.alteracaoUsuario = alteracaoUsuario;
	}

	public Date getAlteracaoData() {
		return alteracaoData;
	}

	public void setAlteracaoData(Date alteracaoData) {
		this.alteracaoData = alteracaoData;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}
}
