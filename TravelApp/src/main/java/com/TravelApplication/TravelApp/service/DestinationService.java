package com.TravelApplication.TravelApp.service;

import com.TravelApplication.TravelApp.dto.Destination;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinationService {

    // Lista destinatii
    private static final List<Destination> destinationsList = new ArrayList<>();

    // Functie ca sa le vezi/listezi
    public List<Destination> getDestinationsList(){
        return destinationsList;
    }
    // Functie ca sa adaugi o destinatie
    public void addDestination(Destination destination){
        destinationsList.add(new Destination(destination.getCountry(), destination.getCity()));
    }

    // Functie ca sa modifici o destinatie
    public void changeDestination(){
        destinationsList.set(1, new Destination("Italy", "Firenze"));
    }

    // Functie ca sa stergi o destinatie
    public void deleteDestination(){
        destinationsList.remove(1);
    }


}
