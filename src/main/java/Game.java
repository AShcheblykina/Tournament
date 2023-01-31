import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Game {
    public static void game(String[] args) {
        String[] players = {"Зарегистрирован", "Незарегистрирован", "Зарегистрирован", "Незарегистрирован"};


        HashMap<String, String> player = new HashMap<>();
        player.put("Petya", "Зарегистрирован");
        player.put("Any", "Незарегистрирова");
        player.put("Olya", "Зарегистрирован");
        player.put("Koly", "Незарегистрирован");


        for (String key : player.keySet()) {
            String value = player.get(key);

        }

    }

    private boolean register(Player player) {
        String[] players;
        boolean register = true;
        if (player.getName().equals(register)) {
        } else {

        }
        return false;
    }


}