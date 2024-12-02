package demo.jdbc;

public class Game {
    private String title;
    private int gameID;

    public Game(String title, int gameID) {
        this.title = title;
        this.gameID = gameID;
    }
    public String getTitle() {
        return title;
    }
    public int getGameID() {
        return gameID;
    }

    @Override
    public String toString() {
        return "Game [title=" + title + ", gameID=" + gameID + "]";
    }
}
