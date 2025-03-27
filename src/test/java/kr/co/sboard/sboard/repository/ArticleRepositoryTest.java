package kr.co.sboard.sboard.repository;

import kr.co.sboard.sboard.dto.ArticleDTO;
import kr.co.sboard.sboard.entity.Article;
import kr.co.sboard.sboard.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleService articleService;

    @Test
    @Transactional
    @DisplayName("관계 설정 테스트")
    public void test1(){

        //given
        int no = 8;

        //when
        Article article = articleRepository.findById(no).get();

        //then
        System.out.println(article);

    }

    @Test
    @Transactional
    public void test2(){

        ArticleDTO articleDTO = articleService.findById(8);
        System.out.println(articleDTO);
    }

}