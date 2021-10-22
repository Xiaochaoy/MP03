package semana2.MenuExample;

public class Game {
    public final static int MAX_PLAYERS = 4;

    private ConfigGame configGame;
    private MenuExample menuExample;
    private Player[] playersList;

    public Game() {
        playersList = new Player[MAX_PLAYERS];
        configGame = new ConfigGame(playersList);
        menuExample = new MenuExample(this,configGame);
    }

    public void start() {
        menuExample.show();
    }

    public void play() {
        System.out.println("NIvell de joc: " + configGame.getLevel());
        System.out.println("Jugant...");
        System.out.println("Hi ha " + configGame.getNumPlayers() + " jugadors");
        System.out.println("...Joc acabat");
    }
}