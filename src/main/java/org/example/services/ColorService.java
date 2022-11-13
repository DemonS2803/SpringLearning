package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.entinity.CarEntinity;
import org.example.entinity.ColorEntinity;
import org.example.repositories.ColorRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ColorService {

    private final ColorRepository colorRepository;

    public void save(ColorEntinity color) {
        colorRepository.save(color);
    }

    public void saveAll(List<ColorEntinity> list) {
        colorRepository.saveAll(list);
    }

    public void delById(Integer id) {
        colorRepository.deleteById(id);
    }

    public Optional<ColorEntinity> getById(Integer id) {
        return colorRepository.findById(id);
    }

    public List<ColorEntinity> getAll() {
        return colorRepository.findAll();
    }

    public Boolean exist(Example<? extends ColorEntinity> example) {
        return colorRepository.exists(example);
    }

    public List<ColorEntinity> findPriceByColor(String colorName) {
        return colorRepository.findColorEntinitiesByColorName(colorName);
    }
}
