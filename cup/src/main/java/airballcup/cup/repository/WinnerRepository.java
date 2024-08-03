package airballcup.cup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import airballcup.cup.entity.WinnerEntity;

@Repository
public interface WinnerRepository extends JpaRepository<WinnerEntity, Long> {
}
