package airballcup.cup.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "winner")
public class WinnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String team;

    @Column(nullable = false)
    private String member1;

    @Column(nullable = false)
    private String member2;

    @Column(nullable = false)
    private LocalDate date;

    @Column(name = "photo_url")
    private String photoUrl;
}
