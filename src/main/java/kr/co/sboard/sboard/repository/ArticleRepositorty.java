package kr.co.sboard.sboard.repository;

import kr.co.sboard.sboard.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepositorty extends JpaRepository<Article, Integer> {
}
