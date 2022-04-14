package br.com.dh.ctd.ecommerce.service;

import br.com.dh.ctd.ecommerce.dto.CategoryDto;
import br.com.dh.ctd.ecommerce.model.Categories;
import br.com.dh.ctd.ecommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;
import java.util.Optional;

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
        Optional<Categories> obj = categoryRepository.findById(id)
;
    return new CategoryDto(entidade);
    }
}
