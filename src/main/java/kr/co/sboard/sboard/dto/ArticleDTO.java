package kr.co.sboard.sboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleDTO {

    private int no;
    private String cate;
    private String title;
    private String content;
    private int comment;
    private int file;
    private int hit;
    private String writer;
    private String regip;
    private String wdate;

    //추가필드
    private String nick;

    public String getWdate(){
        return wdate.substring(0, 10);
    }

    private MultipartFile file1;
    private MultipartFile file2;

    public List<MultipartFile> getMultipartFiles(){
        //불변 리스트
        return List.of(file1, file2);

    }
}
