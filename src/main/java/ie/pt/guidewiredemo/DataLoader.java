package ie.pt.guidewiredemo;

import ie.pt.guidewiredemo.model.Member;
import ie.pt.guidewiredemo.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MemberRepository memberRepository;

    public DataLoader(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(String... args) {
        if (memberRepository.count() == 0) {
            memberRepository.save(new Member("Alice", "alice@example.com", true));
            memberRepository.save(new Member("Bob", "bob@example.com", true));
            memberRepository.save(new Member("Carol", "carol@example.com", false));
            memberRepository.save(new Member("Dan", "dan@example.com", true));
        }
    }
}