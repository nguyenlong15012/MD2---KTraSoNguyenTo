import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int prime = sc.nextInt();

        if (prime < 2 ){
            System.out.println(prime + " Đấy không phải số nguyên tố!");
        }
        else {
            boolean check = true;
            for (int i = 2; i<prime/2; i++){
                if (prime%i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(prime + " Đây là số nguyên tố!");
            }else {
                System.out.println(prime + " Đây không phải là số nguyên tố!");
            }
        }
    }
}
