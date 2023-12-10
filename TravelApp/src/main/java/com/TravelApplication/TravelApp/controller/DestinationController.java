package com.TravelApplication.TravelApp.controller;

import com.TravelApplication.TravelApp.dto.Destination;
import com.TravelApplication.TravelApp.service.DestinationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destination")
@Slf4j
public class DestinationController {

    private final DestinationService destinationService;

    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }
    @GetMapping("/all")
    public List<Destination> getDestinations(){return destinationService.getDestinationsList();}

    @PostMapping("/add")
    public void addDestination(@RequestBody Destination newDestination){destinationService.addDestination(newDestination);};

    @PutMapping("/change")
    public void changeDestination(){destinationService.changeDestination();}

    @DeleteMapping("/delete")
    public void deleteDestination(){destinationService.deleteDestination();}
}
