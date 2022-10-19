package com.br.dh.firstpiproject.repository;

import com.br.dh.firstpiproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
