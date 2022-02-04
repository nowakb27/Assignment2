package edu.wctc;
public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;
    public Maze(Player player) {
        this.player = player;
        InteractableRoom Room1 = new InteractableRoom();
        LootableRoom Room2 = new LootableRoom();
        ExitRoom Room3 = new ExitRoom();
        this.currentRoom = Room1;
        Room1.setNorthRoom(Room2);
        Room2.setSouthRoom(Room1);
        Room2.setEastRoom(Room3);
        Room3.setWestRoom(Room3);
    }
    public String exitCurrentRoom() {
        if (this.currentRoom instanceof ExitRoom) {
            this.isFinished = true;
            return ((ExitRoom) this.currentRoom).exit();
        }
        return "NO EXIT.";
    }
    public String lootCurrentRoom() {
        if (this.currentRoom instanceof LootableRoom) {
            if (!this.player.getInventory().equals("CLUB")) {
                this.player.addToInventory("CLUB");
                return ((LootableRoom) this.currentRoom).loot();
            }
        }
        return "THERE IS NOTHING TO LOOT IN THIS ROOM.";
    }
    public String interactCurrentRoom() {
        if (this.currentRoom instanceof InteractableRoom) {
            return ((InteractableRoom) this.currentRoom).interact();
        }
        return "THERE IS NOTHING TO INTERACT WITH IN THIS ROOM.";
    }
    public boolean move(char direction) {
        if (this.currentRoom.isValidDirection(direction)) {
            this.currentRoom = this.currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        return false;
    }
    public int getPlayerScore() {
        return this.player.getScore();
    }
    public String getPlayerInventory() {
        return this.player.getInventory();
    }
    public String getCurrentRoomDescription() {
        return this.currentRoom.getDescription();
    }
    public String getCurrentRoomExits() {
        return this.currentRoom.getExits();
    }
    public boolean isFinished() {
        return this.isFinished;
    }
}