package airballcup.cup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import airballcup.cup.entity.WinnersEntity;

@Repository
public interface WinnersRepository extends JpaRepository<WinnersEntity, Long> {

}
