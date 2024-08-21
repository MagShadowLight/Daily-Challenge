import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        String text = "";
        int k;

        System.out.println("Type any numbers for how many times. When you're done, type done");
        while (true) {

            int num;
            text = scan.nextLine();
            if (text.equals("Done") || text.equals("done")) {
                break;
            }
            num = Integer.valueOf(text);
            nums.add(num);
        }

        System.out.println("Type the final numbers");
        k = Integer.valueOf(scan.nextLine());

//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println("Number on list: " + nums.get(i));
//        }
//        System.out.println("number on k: " + k);

        for (int i = 0; i < nums.size(); i++) {
            int num1 = nums.get(i);
            for (int j = 0; j < nums.size(); j++) {
                int num2 = nums.get(j);
                if ((num1 + num2) == k) {
                    System.out.println("True because it is " + num1 + " + " + num2 + " = " + k);
                    return;
                }
            }
        }
        System.out.println("False because there is no numbers that add up to k");
    }
}