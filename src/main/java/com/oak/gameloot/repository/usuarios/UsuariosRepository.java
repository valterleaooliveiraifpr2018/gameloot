package com.oak.gameloot.repository.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oak.gameloot.model.usuarios.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
