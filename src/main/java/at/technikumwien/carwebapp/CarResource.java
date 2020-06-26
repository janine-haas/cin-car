package at.technikumwien.carwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// see http://localhost:8081/resources/cars
// see http://localhost:8081/resources/cars/1

@RestController
@RequestMapping("resources/cars")
public class CarResource {
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> getAll() { return carRepository.findAll(); }

}