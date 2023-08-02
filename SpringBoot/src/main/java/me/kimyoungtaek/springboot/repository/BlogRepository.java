package me.kimyoungtaek.springboot.repository;

import me.kimyoungtaek.springboot.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
