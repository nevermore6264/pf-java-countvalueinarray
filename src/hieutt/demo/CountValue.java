package hieutt.demo;

import java.util.Scanner;

public class CountValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        System.out.println("Mời bạn nhập 1 ký tự: ");
        char c = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < chuoi.length(); i++) {

            String xxx = String.valueOf(chuoi.charAt(i));

            if (Character.toString(c).equalsIgnoreCase(xxx)) {
                count++;
            }

        }
        System.out.println("Số lần xuất hiện của ký tự trong chuỗi: " + count);
    }
}
