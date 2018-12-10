package Rooms;

import Game.Runner;
import People.Person;

public class GameRoom extends Room
{

    public GameRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the game room! Plus 1 point for playing.");
        Runner.gameOff();
    }
}

