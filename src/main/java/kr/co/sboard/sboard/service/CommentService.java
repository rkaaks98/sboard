package kr.co.sboard.sboard.service;

import kr.co.sboard.sboard.dto.CommentDTO;
import kr.co.sboard.sboard.entity.Comment;
import kr.co.sboard.sboard.entity.User;
import kr.co.sboard.sboard.repository.CommentRepository;
import kr.co.sboard.sboard.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class CommentService {

    private final UserRepository userRepository;
    private final CommentRepository commentRepository;
    private final ModelMapper modelMapper;

    public List<CommentDTO> findAll(){
        List<Comment> commentList = commentRepository.findAll();

        List<CommentDTO> commentDTOList= commentList.stream().map(entity ->{
            CommentDTO commentDTO = modelMapper.map(entity, CommentDTO.class);
            return commentDTO;
                }).toList();
        return commentDTOList;
    }

    //저장
    public CommentDTO save(CommentDTO commentDTO) {

        User user = userRepository.findById(commentDTO.getWriter()).get();

        Comment comment = modelMapper.map(commentDTO, Comment.class);
        comment.setUser(user);

        Comment savedComment = commentRepository.save(comment);

        return modelMapper.map(savedComment, CommentDTO.class);
    }

}
