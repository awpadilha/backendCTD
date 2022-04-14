package br.com.dh.ctd.ecommerce.repositories;

import br.com.dh.ctd.ecommerce.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Integer> {

    @Query("SELECT obj FROM Products obj JOIN FETCH obj.categories " +
            "WHERE obj IN :products")
    List<Products> buscarTodos(List<Products> products);


}
