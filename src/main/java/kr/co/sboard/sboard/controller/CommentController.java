package kr.co.sboard.sboard.controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.sboard.sboard.dto.CommentDTO;
import kr.co.sboard.sboard.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CommentController {

    private final CommentService commentService;

    @ResponseBody
    @GetMapping("/comment/list")
    public List<CommentDTO> list(){

        List<CommentDTO> commentDTOList = commentService.findAll();


        return commentDTOList;
    }



    @PostMapping("/comment/write")
    @ResponseBody
    public CommentDTO write(@RequestBody CommentDTO commentDTO, HttpServletRequest request) {
        log.info("commentDTO: {}", commentDTO);

        String regip = request.getRemoteAddr();
        commentDTO.setRegip(regip);

        CommentDTO savedCommentDTO = commentService.save(commentDTO);

        return savedCommentDTO;
    }

}
