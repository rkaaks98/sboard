package kr.co.sboard.sboard.service;

import jakarta.persistence.Entity;
import kr.co.sboard.sboard.dao.ArticleMapper;
import kr.co.sboard.sboard.dto.ArticleDTO;
import kr.co.sboard.sboard.entity.Article;
import kr.co.sboard.sboard.repository.ArticleRepositorty;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ArticleService {

    private final ArticleRepositorty articleRepositorty;
    private final ModelMapper modelMapper;
    private final ArticleMapper articleMapper;

    public int register(ArticleDTO articleDTO){

        //엔티티 변환
        Article article= modelMapper.map(articleDTO, Article.class);

        //JPA 저장
        Article savedArticle = articleRepositorty.save(article);
        return savedArticle.getNo();

        //Mybatis 저장
        //articleMapper.insertArticle(articleDTO);
        //매개변수로 전달되는 articleDTO의 no 속성에 mybatis가 Insert한 데이터의 pk값을 반환
        //int no = articleDTO.getNo();
        
        //return no;
    }

}
