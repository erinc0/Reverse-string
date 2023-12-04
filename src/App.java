import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner meow = new Scanner(System.in);
        String miau = meow.nextLine();
        char reverse;

        for(int i = miau.length() - 1; i >= 0; i--){
        reverse = miau.charAt(i);
        System.out.print(reverse); 
    }
    System.out.println();
    meow.close();
}
}