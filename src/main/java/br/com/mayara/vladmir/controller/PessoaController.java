package br.com.mayara.vladmir.controller;

import br.com.mayara.vladmir.model.Pessoa;
import br.com.mayara.vladmir.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa){
        return pessoaService.salvar(pessoa);
    }

    @GetMapping
    public List<Pessoa> listar(){
        return pessoaService.listar();

    }

    @PutMapping
    public Pessoa alterar(@RequestBody Pessoa pessoa) {
        return pessoaService.salvar(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        pessoaService.deletar(id);
    }

    @GetMapping("/{id}")
    public Pessoa listarByID(@PathVariable("id") Integer id){
        return pessoaService.buscarPorId(id);
    }
}
