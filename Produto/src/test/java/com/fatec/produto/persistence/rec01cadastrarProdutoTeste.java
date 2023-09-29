package com.fatec.produto.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.produto.model.Produto;
import com.fatec.produto.model.ProdutoRepository;

@SpringBootTest
class rec01cadastrarProdutoTeste {

	@Autowired
	ProdutoRepository produtoRepository;

	@Test
	public void cdt01CadastraProdutoComSucesso() {
		produtoRepository.deleteAll();

		Produto p = new Produto();

		p.setDescricao("Eletolux marabras 123V");
		p.setCategoria("maquina de lavar");
		p.setCusto(200.61);
		p.setQuantidadeEstoque(1);
		Produto prod = produtoRepository.save(p);

		assertEquals(1, produtoRepository.count());
		assertNotNull(prod);
	}

	public void cdt02CadastraProdutoComDescricaoErrada() {
		try {
			Produto p = new Produto();
			p.setDescricao("");
			fail("não pode branco");
		} catch (IllegalArgumentException e) {
			assertEquals("n pode ser branco", e.getMessage());
		}
	}
}
