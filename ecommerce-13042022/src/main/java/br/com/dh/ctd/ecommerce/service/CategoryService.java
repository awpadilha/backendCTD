package br.com.dh.ctd.ecommerce.service;

import br.com.dh.ctd.ecommerce.dto.CategoryDto;
import br.com.dh.ctd.ecommerce.model.Categories;
import br.com.dh.ctd.ecommerce.repositories.CategoryRepository;
import br.com.dh.ctd.ecommerce.service.exceptions.EntidadeNaoEncontrada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public Page<CategoryDto> findAllPage(PageRequest pageRequest) {
        Page<Categories> list = categoryRepository.findAll(pageRequest);
        return list.map(x -> new CategoryDto(x));
    }

    @Transactional(readOnly = true)
    public CategoryDto findById(Integer id) {
        Optional<Categories> obj = categoryRepository.findById(id);
        //Categories entidade = obj.get();
        Categories entidade = obj.
                orElseThrow(() -> new EntidadeNaoEncontrada("Entidade não encontrada."));
        return new CategoryDto(entidade);
    }

}
