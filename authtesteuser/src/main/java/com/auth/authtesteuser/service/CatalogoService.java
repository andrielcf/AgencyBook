package com.auth.authtesteuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auth.authtesteuser.entity.Catalogo;
import com.auth.authtesteuser.entity.Livro;
import com.auth.authtesteuser.repository.CatalogoRepository;
import com.auth.authtesteuser.repository.LivroRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoService {

    @Autowired
    private CatalogoRepository catalogoRepository;

    @Autowired
    private LivroRepository livroRepository;

    @Transactional
    public Catalogo CriarCatalogo(){
        Catalogo catalogo = new Catalogo();
        return catalogoRepository.save(catalogo);
    }

    @Transactional
    public Livro adicionarLivro(Long catalogoId, Livro livro){
        Optional<Catalogo> catalogoOpt = catalogoRepository.findById(catalogoId);
        if(catalogoOpt.isPresent()){
            livro.setCatalogo(catalogoOpt.get());
            return livroRepository.save(livro);
        }
        throw new RuntimeException("Catalogo não encontrado!");

    }

    @Transactional(readOnly = true)
    public List<Livro> listarLivros(Long catalogoId){
        return livroRepository.findAll();
    }

    @Transactional
    public Livro editarLivro(Long id, Livro livroAtualizado) {
        Optional<Livro> livroOpt = livroRepository.findById(id);
        if (livroOpt.isPresent()) {
            Livro livro = livroOpt.get();
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            return livroRepository.save(livro);
        }
        throw new RuntimeException("Livro não encontrado");
    }

    @Transactional
    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }

    



   
}
