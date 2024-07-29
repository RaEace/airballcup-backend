package airballcup.cup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import airballcup.cup.component.EventComponent;

@Repository
public interface EventRepository extends JpaRepository<EventComponent, Long> {
}