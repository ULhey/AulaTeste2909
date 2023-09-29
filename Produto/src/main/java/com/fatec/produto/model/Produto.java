package com.fatec.produto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
@Id 
@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String descricao;
	private String categoria;
	private Double custo;
	private Integer quantidadeEstoque;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao == null) {
			throw new IllegalArgumentException("nulo não pode!");
		} else {	
			if (descricao.isBlank()) {
				throw new IllegalArgumentException("branco não pode!");				
			} else {				
				this.descricao = descricao;
			}
		}
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getCusto() {
		return custo;
	}
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
}
