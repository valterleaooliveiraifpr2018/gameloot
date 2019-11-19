package com.oak.gameloot.controller.usuarios;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oak.gameloot.model.administrativo.Funcionario;
import com.oak.gameloot.model.usuarios.Usuarios;
import com.oak.gameloot.repository.usuarios.UsuariosRepository;

@Controller
public class UsuariosController {
	@Autowired
	private UsuariosRepository ur;
	
	@GetMapping("/usuarios/cadastro")
	public ModelAndView cadastro(Usuarios usuarios) {
		ModelAndView mv = new ModelAndView("/usuarios/cadastro");
		mv.addObject("usuarios",usuarios);
		return mv;
	}
	@GetMapping("/usuarios/lista")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/usuarios/lista");
		mv.addObject("listaUsuarios",ur.findAll());
		return mv;
	}
	@GetMapping("/usuarios/editar/{id}")
	public ModelAndView editar(@PathVariable("id")Long id ) {
		Optional<Usuarios> usuarios = ur.findById(id);
		return cadastro(usuarios.get());
	}
	@GetMapping("/usuarios/excluir/{id}")
	public ModelAndView deletar(@PathVariable("id")Long id ) {
		Optional<Usuarios> usuarios = ur.findById(id);
		ur.delete(usuarios.get());
		return lista();
	}
	
	
	
	
	
	@PostMapping("/usuarios/salvar")
	public ModelAndView salvar(@Valid Usuarios usuarios, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
			return cadastro(usuarios);
		} 
		ur.saveAndFlush(usuarios);
		return cadastro(new Usuarios());
	}
}
