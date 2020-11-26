package baseball;

import utils.RandomUtils;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        String answer = createNumber();
    }
    public static String createNumber(){
        StringBuilder targetNubmer = new StringBuilder();
        int[] useNumber = new int[10];
        while(targetNubmer.length()<3) {
            int tempNumber = RandomUtils.nextInt(1, 9);
            if(useNumber[tempNumber]==0){
                useNumber[tempNumber] = 1;
                targetNubmer.append(tempNumber);
            }
        }
        System.out.println(targetNubmer.toString());
        return targetNubmer.toString();
    }
}
