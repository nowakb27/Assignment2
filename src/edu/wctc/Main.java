package edu.wctc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Player player = new Player();
        edu.wctc.Maze maze = new edu.wctc.Maze(player);
        while (!maze.isFinished()) {
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println("ROOM EXITS: " + maze.getCurrentRoomExits());
            System.out.println("CHOOSE PATH: (n) NORTH, (s) SOUTH, (w) WEST, (E) EAST");
            System.out.println("ENTER: (i) INTERACT, (l) LOOT, (x) EXIT, (v) CHECK INVENTORY");
            char direction = keyboard.next().charAt(0);
            if (direction == 'x') {
                System.out.println(maze.exitCurrentRoom());
            } else if (direction == 'i') {
                System.out.println(maze.interactCurrentRoom());
            } else if (direction == 'l') {
                System.out.println(maze.lootCurrentRoom());
            } else if (direction == 'v') {
                System.out.println(maze.getPlayerInventory());
            } else if (!maze.move(direction)) {
                System.out.println("NO DOOR HERE.");
            }
        }
        System.out.println("SCORE: " + maze.getPlayerScore());
    }
}