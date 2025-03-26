package kr.co.sboard.sboard.repository;

import kr.co.sboard.sboard.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Integer> {
}
