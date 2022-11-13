package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.entinity.CarEntinity;
import org.example.repositories.CarRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public void save(CarEntinity car) {
        carRepository.save(car);
    }

    public void saveAll(List<CarEntinity> cars) {
        carRepository.saveAll(cars);
    }

    public void delById(Integer id) {
        carRepository.deleteById(id);
    }

    public Optional<CarEntinity> getById(Integer id) {
        return carRepository.findById(id);
    }

    public List<CarEntinity> getAll() {
        return carRepository.findAll();
    }

    public Boolean exist(Example<? extends CarEntinity> example) {
        return carRepository.exists(example);
    }
}
