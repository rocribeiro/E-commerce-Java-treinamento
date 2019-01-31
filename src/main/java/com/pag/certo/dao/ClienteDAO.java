package com.pag.certo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pag.certo.vo.Cliente;
@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Long>{
	
}
