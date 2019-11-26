package adventureGame;

import java.util.ArrayList;
import java.util.HashMap;

// ~~~~~~~~~~ CHARACTER PROPERTIES ~~~~~~~~~~
public class Player {
    // ~~~~~~ PLAYER INFO ~~~~~
    String name;
    String difficulty;
    String power;

    // ~~~~~ PLAYER STATS ~~~~~
    HashMap<String, Integer> stats = new HashMap<>();
    String[] statNames = {
            // ~~~~~ STATS ~~~~~
            "health",
            "strength",
            "defense",
            "magic",
            // ~~~~~ ITEMS ~~~~~
            "healthPotion",
            "strengthPotion",
            "defensePotion"
    };

    public void setName(String n) {
        name = n;
    }

    public void setDifficulty(String diff) {
        difficulty = diff;
    }

    public void setStats(ArrayList<Integer> stats) {
//        TODO: use hashkeys to set values rather than indices
//         only change stats and not potions
        for (int i = 0; i < statNames.length; i++) {
            this.stats.put(statNames[i], stats.get(i));
        }
    }
}