package org.a2lpo.vemo.repos;

import org.a2lpo.vemo.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
