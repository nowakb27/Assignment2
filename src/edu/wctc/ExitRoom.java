package edu.wctc;
public class ExitRoom extends Room implements Exit {
    public String getDescription() {
        return "YOU HAVE ENTERED A ROOM WITH GLASS WALLS";
    }
    @Override
    public String exit() {
        return "YOU HAVE BROKE FREE FROM THE MAZE. CONGRATULATIONS!!!";
    }
}