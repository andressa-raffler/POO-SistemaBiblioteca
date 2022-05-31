package org.example.dominios;

import org.example.repository.LivroRepository;

import java.util.Objects;

public class Livro {
    protected String titulo;
    private String autor;
    private String isbn;
    private int totalCopias = 0;

    public Livro(String titulo, String autor, String isbn, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        setTotalCopias(copias);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public int getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(int copias) {
        if(LivroRepository.procurarLivroISBN(this.isbn) != null) {
            if (LivroRepository.procurarLivroISBN(this.isbn).getIsbn().equals(this.getIsbn())) {
                this.totalCopias += copias;
            }
        }
        else {
            this.totalCopias = copias;
        }
    }

}
