package com.oak.gameloot.controller.administrativo;

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
import com.oak.gameloot.repository.administrativo.FuncionarioRepository;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository fr;
	
	
	@GetMapping("/administrativo/cadastro")
	public ModelAndView cadastro(Funcionario funcionario) {
		ModelAndView mv = new ModelAndView("/administrativo/cadastro");
		mv.addObject("funcionario",funcionario);
		return mv;
	}
	@GetMapping("/administrativo/lista")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/administrativo/lista");
		mv.addObject("listaFuncionario",fr.findAll());
		return mv;
	}
	
	@GetMapping("/administrativo/editar/{id}")
	public ModelAndView editar(@PathVariable("id")Long id ) {
		Optional<Funcionario> funcionario = fr.findById(id);
		return cadastro(funcionario.get());
	}
	@GetMapping("/administrativo/deletar/{id}")
	public ModelAndView remover(@PathVariable("id")Long id ) {
		Optional<Funcionario> funcionario = fr.findById(id);
		fr.delete(funcionario.get());;
		return lista();
	}
	
	
	
	
	
	
	
	
	
	@PostMapping("/administrativo/salvar")
	public ModelAndView salvar(@Valid Funcionario funcionario, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
			return cadastro(funcionario);
		} 
		fr.saveAndFlush(funcionario);
		return cadastro(new Funcionario());
	}
			
}
