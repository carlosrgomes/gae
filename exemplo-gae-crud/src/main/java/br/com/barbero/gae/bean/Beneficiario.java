package br.com.barbero.gae.bean;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * @author CRG1211
 *
 */
@Entity
public class Beneficiario {
	
	@Id
	private Long id;

	@Index
	private String nome;
	
	@Index
	private String endereco;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Beneficiario [id=%s, nome=%s, endereco=%s]", id, nome, endereco);
	}
	
	

}
