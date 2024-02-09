package com.waly.ProductAPI.repositories;

import com.waly.ProductAPI.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
