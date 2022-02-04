package edu.wctc;
public class LootableRoom extends Room implements Lootable {
    public String getDescription() {
        return "YOU HAVE ENTERED A FROZEN ROOM";
    }
    @Override
    public String loot() {
        return "YOU FOUND A GLASS OF WATER";
    }
}
