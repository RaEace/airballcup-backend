package airballcup.cup.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "winners")
public class WinnersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "team_name", nullable = false)
    private String teamName;

    @Column(name = "member1_name", nullable = false)
    private String member1Name;

    @Column(name = "member2_name", nullable = false)
    private String member2Name;

    @Column(name = "win_date", nullable = false)
    private Date date;

    @Column(name = "photo_url", nullable = false)
    private String photoUrl;
}
