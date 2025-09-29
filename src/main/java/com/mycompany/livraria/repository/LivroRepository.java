package com.mycompany.livraria.repository;

import com.mycompany.livraria.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List<Livro> livros = new ArrayList<>();

    // CREATE
    public void salvar(Livro livro) {
        livros.add(livro);
    }

    // READ - listar todos
    public List<Livro> listar() {
        return livros;
    }

    // READ - buscar por código
    public Livro buscarPorCodigo(int codigo) {
        for (Livro l : livros) {
            if (l.getLiv_codigo() == codigo) {
                return l;
            }
        }
        return null;
    }

    // UPDATE
    public boolean atualizar(Livro livroAtualizado) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getLiv_codigo() == livroAtualizado.getLiv_codigo()) {
                livros.set(i, livroAtualizado);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deletar(int codigo) {
        return livros.removeIf(l -> l.getLiv_codigo() == codigo);
    }
}
