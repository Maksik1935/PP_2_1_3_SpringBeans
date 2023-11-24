package app.model;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Component
@Primary
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
