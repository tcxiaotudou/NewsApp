package com.codedou.newsdemo.repository;

import com.codedou.newsdemo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
