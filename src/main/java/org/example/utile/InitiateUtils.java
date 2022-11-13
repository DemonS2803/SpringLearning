package org.example.utile;

import lombok.RequiredArgsConstructor;
import org.example.entinity.CarEntinity;
import org.example.entinity.ColorEntinity;
import org.example.services.CarService;
import org.example.services.ColorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InitiateUtils implements CommandLineRunner {

    private final CarService carService;
    private final ColorService colorService;

    @Override
    public void run(String... args) throws Exception {
        List<CarEntinity> cars = new ArrayList<>(
                Arrays.asList(
                    new CarEntinity()
                            .setModelName("Vesta")
                            .setColorId(1),
                    new CarEntinity()
                            .setModelName("Kalina")
                            .setColorId(2),
                    new CarEntinity()
                            .setModelName("Granta")
                            .setColorId(3),
                    new CarEntinity()
                            .setModelName("TsarJiga")
                            .setColorId(4)
                )
        );
        List<ColorEntinity> colors = new ArrayList<>(
                Arrays.asList(
                        new ColorEntinity()
                                .setColorName("Blue")
                                .setColorPrice(10000),
                        new ColorEntinity()
                                .setColorName("Red")
                                .setColorPrice(200001),
                        new ColorEntinity()
                                .setColorName("Green")
                                .setColorPrice(20000),
                        new ColorEntinity()
                                .setColorName("White")
                                .setColorPrice(30000),
                        new ColorEntinity()
                                .setColorName("Red")
                                .setColorPrice(666666)
                )
        );
        carService.saveAll(cars);
        colorService.saveAll(colors);
        for (CarEntinity car : carService.getAll()) {
            System.out.println(car);
        }
        System.out.println("\n\n");
        for (ColorEntinity color : colorService.getAll()) {
            System.out.println(color);
        }
        System.out.println("\n");
        for (ColorEntinity color : colorService.findPriceByColor("Red")) {
            System.out.println(color.getColorPrice());
        }
    }
}
