package edu.wctc;
public class InteractableRoom extends Room implements Interactable {
    public String getDescription() {
        return "YOU HAVE ENTERED A ROOM CLOUDED WITH SMOKE.";
    }
    @Override
    public String interact() {
        return "YOU FOUND A CLUB";
    }
}