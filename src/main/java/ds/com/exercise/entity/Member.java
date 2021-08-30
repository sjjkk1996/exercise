package ds.com.exercise.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "member")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long mno;
    @Column(length = 50, nullable = false)
    String name;
    @Column(length = 50, nullable = false)
    String id;
    @Column(length = 50, nullable = false)
    String pass;
}
