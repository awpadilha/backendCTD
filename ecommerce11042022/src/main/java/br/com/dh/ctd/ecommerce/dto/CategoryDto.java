package br.com.dh.ctd.ecommerce.dto;

import br.com.dh.ctd.ecommerce.model.Categories;

public class CategoryDto {

    private Integer id;
    private String nome;

    public CategoryDto() {
    }

    public CategoryDto(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CategoryDto(Categories categories) {
        id = categories.getId();
        nome = categories.getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
