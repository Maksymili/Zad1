package C6z1;

public interface Wynagrodzenie {

    double wynagrodzenie(double zaGodzine, double godzinyPracy);

    default double wynagrodzeniaZaNadgodziny (double zaGodzine, double nadgodzinyPracy){
        return (zaGodzine * 1.25 * nadgodzinyPracy);
    }

    static boolean premia(double lataDoswiadczenia){
        if(lataDoswiadczenia > 2){
            return true;
        }else return false;
    }
}
