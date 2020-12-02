package br.com.mayara.vladmir.service;

import br.com.mayara.vladmir.model.Pessoa;
import br.com.mayara.vladmir.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa salvar(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    public void deletar(Integer id){
        Optional<Pessoa> opPessoa = pessoaRepository.findById(id);
        pessoaRepository.delete(opPessoa.get());
    }

    public Pessoa buscarPorId(Integer id){
        return pessoaRepository.findById(id).get();
    }
}
