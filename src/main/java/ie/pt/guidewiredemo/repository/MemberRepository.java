package ie.pt.guidewiredemo.repository;

import ie.pt.guidewiredemo.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
