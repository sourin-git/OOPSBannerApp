/**
 * UC6: Print OOPS Banner with Static Methods
 * Encapsulates letter patterns into reusable methods for better modularity.
 * @author Sourin
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            getO(1) + getO(1) + getP(1) + getS(1),
            getO(2) + getO(2) + getP(2) + getS(2),
            getO(3) + getO(3) + getP(3) + getS(3),
            getO(4) + getO(4) + getP(4) + getS(4),
            getO(5) + getO(5) + getP(5) + getS(5),
            getO(6) + getO(6) + getP(6) + getS(6),
            getO(7) + getO(7) + getP(7) + getS(7)
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }


    public static String getO(int line) {
        switch (line) {
            case 1:
            case 7:
                return "  *****  ";
            default:
                return " **   ** ";
        }
    }

    public static String getP(int line) {
        switch (line) {
            case 1:
            case 4:
                return " ********";
            case 2:
            case 3:
                return " **   ** ";
            default:
                return " **      ";
        }
    }

    public static String getS(int line) {
        switch (line) {
            case 1:
            case 4:
            case 7:
                return " ********";
            case 2:
            case 3:
                return " **      ";
            default:
                return "      ** ";
        }
    }
}