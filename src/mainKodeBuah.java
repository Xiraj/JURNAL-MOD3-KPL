import java.util.Scanner;

public class mainKodeBuah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Buah : ");
        String bu = input.nextLine();
        System.out.println(KodeBuah.getKodeBuah(bu));
        input.close();
    }
}