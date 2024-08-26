package de.supercode.Bootsverleih.repository;

import de.supercode.Bootsverleih.entities.Boot;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BootRepository {
    public static long actualID = 0;
    ArrayList<Boot> bootsDB;

    //Create
    public void addBoot(Boot boot){
        boot.setId(actualID++);
        this.bootsDB.add(boot);
    }
    //Read
    public Boot getBoot (long id){
        return bootsDB.stream().filter(boot -> boot.getId()==id).findFirst().orElseThrow();
    }
    //update
    public void updateBoot(long id, Boot boot){
        Boot toUpdateBoot = bootsDB.stream().filter(boot1 -> boot1.getId()==id).findFirst().orElseThrow();
        toUpdateBoot.setCapacity(boot.getCapacity());
        toUpdateBoot.setCategrorie(boot.getCategrorie());
        toUpdateBoot.setName(boot.getName());
    }
    //Delete
    public void deleteBoot(long id){
       bootsDB.removeIf(boot ->boot.getId()==id);
    }
}
