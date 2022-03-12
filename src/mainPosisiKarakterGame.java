import java.util.Scanner;

public class mainPosisiKarakterGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PosisiKarakterGame gerak = new PosisiKarakterGame();
        System.out.println(gerak.getState());
        System.out.print("Perintah : ");
        String c = input.nextLine();
        gerak.gerak(c);
        System.out.println(gerak.getState());
        System.out.print("Perintah : ");
        c = input.nextLine();
        gerak.gerak(c);
        System.out.println(gerak.getState());
        input.close();
    }
}