package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@RestController
public class MyControllerDatefinder {
    @GetMapping("/")
    public String func()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        
        LocalDate inputDate = LocalDate.parse("30-01-2024", formatter);
        
       
        LocalDate resultDate = inputDate.plusDays(100);
        
       
        String resultDateStr = resultDate.format(formatter);

        return resultDateStr;
    }

    
}
