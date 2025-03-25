package kr.co.sboard.sboard.repository;

import kr.co.sboard.sboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    long countByUid(String uid);

    long countByNick(String nick);

    long countByEmail(String email);

    long countByHp(String hp);
}
