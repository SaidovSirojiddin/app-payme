package ai.ecma.apppayme.repository;

import ai.ecma.apppayme.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Optional<Payment> findFirstByOrderTransactionIdOrderByPayDateDesc(Long orderTransactionId);


}
