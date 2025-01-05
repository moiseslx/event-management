package br.com.albuquerque.eventmanagement.repository;

import br.com.albuquerque.eventmanagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
