/**
 * UC3: Print OOPS Banner using String.join()
 * Displays "OOPS" using ASCII art stars.
 * Refactored for better readability and memory efficiency.
 * 
 * @author Sourin
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        System.out.println(String.join("", 
                "  ***** ", "  ***** ", " ******** ", "  ******* "));
        System.out.println(String.join("", 
                " **   ** ", " **   ** ", " **     ** ", " **     **"));
        System.out.println(String.join("", 
                " **   ** ", " **   ** ", " **     ** ", " **"));
        System.out.println(String.join("", 
                " **   ** ", " **   ** ", " ******** ", "  ******* "));
        System.out.println(String.join("", 
                " **   ** ", " **   ** ", " **        ", " **     **"));
        System.out.println(String.join("", 
                " **   ** ", " **   ** ", " **        ", " **     **"));
        System.out.println(String.join("", 
                "  ***** ", "  ***** ", " **        ", "  ******* "));
    }
}
