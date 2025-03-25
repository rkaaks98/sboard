package kr.co.sboard.sboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Terms")
public class Terms {

    @Id
    private int no;
    private String terms;
    private String privacy;
}
