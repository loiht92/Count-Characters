import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra");
        String character = input.nextLine();
        System.out.println("Nhap ki tu can kiem tra");
        char value = input.next().charAt(0);
        int count = 0;

        for (int i = 0; i < character.length() ; i++){
            if (character.charAt(i) == value){
                count ++ ;
            }
        }
        System.out.print("So lan xuat hien ki tu" + " " + value + " " + "trong chuoi" +" " + character + " = " + count);
    }
}
