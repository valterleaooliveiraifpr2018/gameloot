package com.oak.gameloot.repository.administrativo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oak.gameloot.model.administrativo.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> { 
	
}
