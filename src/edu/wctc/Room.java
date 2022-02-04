package edu.wctc;
public abstract class Room {
    private Room north = null, south = null, east = null, west = null;
    public abstract String getDescription();
    public Room getAdjoiningRoom(char direction) {
        if (direction == 'n') {
            return north;
        }
        if (direction == 's') {
            return south;
        }
        if (direction == 'e') {
            return east;
        }
        if (direction == 'w') {
            return west;
        }
        return null;
    }
    public String getExits() {
        String exits = "";
        if (this.isValidDirection('n')) {
            exits = exits + "NORTH, ";
        }
        if (this.isValidDirection('s')) {
            exits = exits + "SOUTH, ";
        }
        if (this.isValidDirection('w')) {
            exits = exits + "WEST, ";
        }
        if (this.isValidDirection('e')) {
            exits = exits + "EAST, ";
        }
        return exits.substring(0, exits.length() - 2);
    }
    public boolean isValidDirection(char direction) {
        return this.getAdjoiningRoom(direction) != null;
    }
    public void setNorthRoom(Room room) {
        this.north = room;
    }
    public void setSouthRoom(Room room) {
        this.south = room;
    }
    public void setWestRoom(Room room) {
        this.west = room;
    }
    public void setEastRoom(Room room) {
        this.east = room;
    }
}
