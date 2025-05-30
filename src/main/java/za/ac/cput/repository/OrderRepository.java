package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Order;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
   List<Order> findByCustomerId(int customerId);
   List<Order> findByOrderDateBetween(LocalDateTime startDate, LocalDateTime endDate);
}
