package kr.co.sboard.sboard.dao;

import kr.co.sboard.sboard.dto.ArticleDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    // Mybatis가 Insert 한 데이터의 pk값을 매개변수 DTO의 해당 속성으로 반환
    public void insertArticle(ArticleDTO articleDTO);
}
