package br.com.postrabalho.postrabalhobibliotecaapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import br.com.postrabalho.postrabalhobibliotecaapi.model.enumm.Sexo;

@Entity
public class Autor implements Serializable {

	private static final long serialVersionUID = -337925197634936317L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O campo nome é obrigatório!")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	
	public Autor() {
		super();
	}

	public Autor(Long id, String nome, Sexo sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}

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
	
	public Sexo getSexo() {
		return sexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
