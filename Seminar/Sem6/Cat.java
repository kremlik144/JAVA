package Seminar.Sem6;

import java.util.ArrayList;
import java.util.List;

public class Cat 
{
    private String name;
    private String breed;
    private String owner;
    private List<Award> awards;

    public Cat(String name, String breed, String owner) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.awards= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getOwner() {
        return owner;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void addAward(Award award)
    {
        awards.add(award);
    }

    @Override
    public String toString() {
        return "Cat name= " + name + ", breed= " + breed + ", owner= " + owner + ", awards= " + awards;
    }
    
    
}
