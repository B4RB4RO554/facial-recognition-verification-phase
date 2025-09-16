package bidpay.fusion.backend.repositories;

import bidpay.fusion.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
