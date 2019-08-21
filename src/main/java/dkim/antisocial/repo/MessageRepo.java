package dkim.antisocial.repo;

import dkim.antisocial.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message , Long> {
}
