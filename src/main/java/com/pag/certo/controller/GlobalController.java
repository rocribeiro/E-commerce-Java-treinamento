package com.pag.certo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pag.certo.service.ClienteService;
import com.pag.certo.vo.Cliente;

@Controller
@RequestMapping("/loja")
public class GlobalController {
	@Autowired
	private ClienteService cs;
	
	@GetMapping("/")
	public String home() {
	    return "home";
	}
	@GetMapping("/cadastro")
	public String cadastro() {
	    return "cadastro";
	}
	
	@PostMapping("/salvar")
	public Boolean salvarCliente(Cliente cliente) {
		cs.inserir(cliente);
		return null;
		
	}
	@DeleteMapping("/excluir")
	public Boolean excluirCliente(Cliente cliente){
		cs.deletar(cliente);
		return null;
		
	}
}
