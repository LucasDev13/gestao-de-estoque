package com.projeto.gestaoestoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.gestaoestoque.model.Produto;
import com.projeto.gestaoestoque.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository prodRepository;
	
	
	
	@GetMapping("/cadastrar")
	public String cadastrar(Produto produto) {
		return "produto/cadastro";
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String salvar(@RequestBody Produto produto, RedirectAttributes attr) {
		prodRepository.save(produto);
		attr.addFlashAttribute("success", "Produto salvo com sucesso.");
		return "redirect:/produtos/cadastrar";
	}
	
	//possivel colocar a lista de produtos aqui
	
	//forma de testar uma requisicao
//	@GetMapping("/clientes")
//	public List<Funcionario> listar() {
//		Funcionario cliente1 = new Funcionario();
//		cliente1.setCodFuncionario(1L);
//		cliente1.setNomeCompleto("Lucas pontes");
//		cliente1.setEmail("lucaspontes@gmail.com");
//		cliente1.setTelefone("111111-11111");
//		
//		Funcionario cliente2 = new Funcionario();
//		cliente2.setCodFuncionario(2L);
//		cliente2.setNomeCompleto("Thais");
//		cliente2.setEmail("rodriguesdossantosthais@gmail.com");
//		cliente2.setTelefone("5555-55555");
//		return Arrays.asList(cliente1, cliente2);
//	}
	
}
