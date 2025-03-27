package kr.co.sboard.sboard.dto;

import kr.co.sboard.sboard.entity.User;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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

    private UserDTO user;
    private List<FileDTO> files;

    public String getWdate(){
        if (wdate != null){
            return wdate.substring(0, 10);
        }
        return null;
    }

    private MultipartFile file1;
    private MultipartFile file2;

    public List<MultipartFile> getMultipartFiles(){
        //불변 리스트
        return List.of(file1, file2);

    }
}
