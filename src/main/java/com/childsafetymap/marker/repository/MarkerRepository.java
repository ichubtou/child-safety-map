package com.childsafetymap.marker.repository;

import com.childsafetymap.marker.entity.Marker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkerRepository extends JpaRepository<Marker, Long> {
}
