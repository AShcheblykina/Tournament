import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {

    @Test
    public void winFirstPlayer() throws NotRegisteredException {
        Game game = new Game();

        Player player1 = new Player(1,"Koly",50);
        Player player2 = new Player(2,"Any", 80);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Koly","Any");
        int expected = 2;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void winTwoPlayer() {
        Game game = new Game();

        Player player1 = new Player(1,"Koly",100);
        Player player2 = new Player(2,"Any", 80);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Koly","Any");
        int expected = 1;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void winDraw() {
        Game game = new Game();

        Player player1 = new Player(1,"Koly",100);
        Player player2 = new Player(2,"Any", 100);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Koly","Any");
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }
    

}
