package de.supercode.Bootsverleih.services;

import de.supercode.Bootsverleih.entities.Boot;
import de.supercode.Bootsverleih.repository.BootRepository;
import org.springframework.stereotype.Component;

@Component
public class BootService {
    //Instanzvariable
    BootRepository bootRepository;

    public BootService (BootRepository bootRepository){this.bootRepository = bootRepository;}

    public void addBoot(Boot boot){
         
    }
}
