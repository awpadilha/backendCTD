package br.com.dh.ctd.ecommerce.controller;

import br.com.dh.ctd.ecommerce.dto.CategoryDto;
import br.com.dh.ctd.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<Page<CategoryDto>> findAll(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "3") Integer size
    ) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<CategoryDto> list = categoryService.findAllPage(pageRequest);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> findById(@PathVariable Integer id) {
        CategoryDto dto = categoryService.findById(id);
        return ResponseEntity.ok().body(dto);
    }

}
