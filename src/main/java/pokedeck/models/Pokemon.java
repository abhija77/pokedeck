package pokedeck.models;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private ArrayList<String> abilities;
    private ArrayList<Type> weakness;
    private String name;
    private ArrayList<Type> type;

    public Pokemon(ArrayList<String> abilities, ArrayList<Type> weakness,String name, ArrayList<Type> type) {
        this.abilities = abilities;
        this.weakness = weakness;
        this.name = name;
        this.type = type;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }
    public ArrayList<Type> getWeakness() {
        return weakness;
    }

    public void setWeakness(ArrayList<Type> weakness) {
        this.weakness = weakness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Type> getType() {
        return type;
    }

    public void setType(ArrayList<Type> type) {
        this.type = type;
    }
}
