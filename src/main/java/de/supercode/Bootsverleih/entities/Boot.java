package de.supercode.Bootsverleih.entities;

import de.supercode.Bootsverleih.Categorie;

import java.util.Objects;

public class Boot {
    private long id;
    private String name;
    Categorie categrorie;
    int capacity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categorie getCategrorie() {
        return categrorie;
    }

    public void setCategrorie(Categorie categrorie) {
        this.categrorie = categrorie;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boot boot = (Boot) o;
        return id == boot.id && capacity == boot.capacity && Objects.equals(name, boot.name) && categrorie == boot.categrorie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, categrorie, capacity);
    }

    @Override
    public String toString() {
        return "Boot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categrorie=" + categrorie +
                ", capacity=" + capacity +
                '}';
    }
}
