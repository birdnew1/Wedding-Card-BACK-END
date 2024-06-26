package com.example.weddingCard.repository;

import com.example.weddingCard.entity.Car;
import com.example.weddingCard.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findByWeddingId(Information information);
    List<Car> findByWeddingIdIn(List<Information> information);
}
