package softuni.pathfinder.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.pathfinder.model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}
