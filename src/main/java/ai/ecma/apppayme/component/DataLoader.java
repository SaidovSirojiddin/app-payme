package ai.ecma.apppayme.component;

import ai.ecma.apppayme.entity.Client;
import ai.ecma.apppayme.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (!clientRepository.existsByPhoneNumber("Paycom")) {
            clientRepository.save(new Client(
                    "Paycom",
                    passwordEncoder.encode("PaycomUchunParolEdiBu")
            ));
            clientRepository.save(new Client(
                    "+197001234567",
                    passwordEncoder.encode("parolClient")
            ));
        }
    }
}
