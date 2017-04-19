package io.happylrd.repository;

import io.happylrd.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    // find by age
    public List<Girl> findByAge(Integer age);
}
