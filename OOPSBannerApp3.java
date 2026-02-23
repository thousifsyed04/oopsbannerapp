/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class extends UC2 by using String.join()
 * instead of + operator for better efficiency.
 *
 * SYED MOHAMMED THOUSIF
 */

public class OOPSBannerApp3 {

    public static void main(String[] args) {

        System.out.println(String.join("",
                "  *****   ",
                "  *****   ",
                " ******** ",
                " *******  "));

        System.out.println(String.join("",
                " **   **  ",
                " **   **  ",
                " **     **",
                " **     **"));

        System.out.println(String.join("",
                " **   **  ",
                " **   **  ",
                " **     **",
                " **       "));

        System.out.println(String.join("",
                " **   **  ",
                " **   **  ",
                " ******** ",
                "  ******  "));

        System.out.println(String.join("",
                " **   **  ",
                " **   **  ",
                " **       ",
                "       ** "));

        System.out.println(String.join("",
                " **   **  ",
                " **   **  ",
                " **       ",
                " **    ** "));

        System.out.println(String.join("",
                "  *****   ",
                "  *****   ",
                " **       ",
                "  ******  "));
    }
}