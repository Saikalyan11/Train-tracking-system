
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stations st = new Stations("Secunderabad");
        Stations st1 = new Stations("Kachiguda");
        Stations st2 = new Stations("Begumpet");
        Stations st3 = new Stations("Koti");
        Stations st4 = new Stations("L B Nagar");
        Stations st5 = new Stations("Tarnaka");

        Train train = new Train(17809, st2, st1);

        train.move();
    }
}