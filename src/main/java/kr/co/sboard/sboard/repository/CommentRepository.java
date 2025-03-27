package kr.co.sboard.sboard.repository;

import kr.co.sboard.sboard.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
