package at.technikumwien.carwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import java.util.List;

@Configuration
public class DatabaseInitializer {
    @Autowired
    private CarRepository carRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationEvent(){
        carRepository.saveAll(
                List.of( new Car(null, "My Car", "Mini", 2004),
                        new Car(null, "cool Car", "BMW", 2010)
                )
        );
    }
}
