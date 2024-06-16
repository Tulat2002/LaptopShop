package vn.hoidanit.laptopshop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.hoidanit.laptopshop.domain.User;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    void deleteById(long id);

    List<User> findOneByEmail(String email);

    List<User> findAll();

    User findById(long id);

//    Optional<User> findOneByActivationKey(String activationKey);
//
//    List<User> findAllByActivatedIsFalseAndCreatedDateBefore(Instant dateTime);
//
//    Optional<User> findOneByResetKey(String resetKey);
//
//    Page<User> findAllByIdNotNullAndActivatedIsTrue(Pageable pageable);

}
