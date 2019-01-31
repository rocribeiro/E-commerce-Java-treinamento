package com.pag.certo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pag.certo.dao.ClienteDAO;
import com.pag.certo.vo.Cliente;
@Service
public class ClienteService {
	@Autowired
	private ClienteDAO dao;
	
	public void inserir(Cliente cliente) {
		dao.save(cliente);
	}
	
	public void deletar(Cliente cliente) {
		dao.delete(cliente);
	}
}
