package whz.pti.eva.praktikum_02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
    Optional<Grade> findByChatUser_NicknameAndChatWith(String from, String to);
}