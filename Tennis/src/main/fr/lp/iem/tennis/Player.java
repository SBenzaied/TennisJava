package fr.lp.iem.tennis;

public class Player {
    protected String Name;
    protected int nbSetWon;



    protected int nbGamesWon;
    protected int nbPoints;




    public Player(String Name) {

        this.Name=Name;


    }

    public String getName() {
        return Name;
    }

    public int getNbGamesWon() {
        return nbGamesWon;
    }

    public int getNbSetWon() {
        return nbSetWon;
    }

    public int getNbPoints() {
        return nbPoints;
    }

}
