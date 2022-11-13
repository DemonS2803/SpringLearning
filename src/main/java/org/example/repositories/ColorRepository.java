package org.example.repositories;

import org.example.entinity.ColorEntinity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorRepository extends JpaRepository<ColorEntinity, Integer> {
    List<ColorEntinity> findColorEntinitiesByColorName(String s);
}
