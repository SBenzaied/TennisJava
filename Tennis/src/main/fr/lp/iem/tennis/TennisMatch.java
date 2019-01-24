package fr.lp.iem.tennis;

public class TennisMatch {

    protected final Player p1;
    protected final Player p2;
    protected MatchType match;
    protected boolean tieBreakInLastSet;
    protected int currentSetNumber;


    public TennisMatch(Player p1, Player p2,MatchType match,boolean tieBreakInLastSet)

    {
        this.p1=p1;
        this.p2=p2;
        this.match=match;
        this.tieBreakInLastSet=tieBreakInLastSet;

    }


    public void updateWithPointWonBy(Player player){
        Player other;

        if (player==p1){other=p2;}
        else{other=p1;}

        if (player.getNbPoints()==0){ player.nbPoints=15;}
        else if (player.getNbPoints()==15){ player.nbPoints=30;}
        else if(player.getNbPoints()==30){ player.nbPoints=40;}
        else{
            if (other.getNbPoints()==40){


            }

        }









    }

    public String pointsForPlayer(Player player){

        return String.valueOf(player.getNbPoints());

    }

   public int currentSetNumber(){
        return currentSetNumber;
    }

    public int gamesInCurrentSetForPlayer(Player player){

        return player.getNbSetWon();

    }

    public int gamesInSetForPlayer(int setNumber, Player player){

        return player.getNbGamesWon();

    }
    public boolean isFinished(){return true;}



    }




}
