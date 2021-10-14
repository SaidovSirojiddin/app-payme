package ai.ecma.apppayme.repository;

import ai.ecma.apppayme.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
