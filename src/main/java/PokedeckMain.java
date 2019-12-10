import com.fasterxml.jackson.databind.ObjectMapper;
import pokedeck.models.Pokemon;

import java.io.File;
import java.io.IOException;

public class PokedeckMain {
    public static void main(String[] args) {
        //Fenetre f = new Fenetre();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ClassLoader classLoader = new PokedeckMain().getClass().getClassLoader();

            File file = new File(classLoader.getResource("list_pokemons.json").getFile());
            //File file = new File("list_pokemons.json");
           Pokemon[] pokemons = objectMapper.readValue(file, Pokemon[].class);
           for (int i =0;i<pokemons.length;i++){
               System.out.println(pokemons[i].getName());

           }
           System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(Type.Feu);
    }
}
