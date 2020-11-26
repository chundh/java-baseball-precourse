package baseball;

import utils.RandomUtils;

import java.util.Scanner;

public class Application {
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
        return targetNubmer.toString();
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        String answer = createNumber(); // 해당 게임의 정답을 저장한다.
        CheckInput check = new CheckInput(); // Input Data를 확인하는 클래스의 객체를 생성한다.
        while(true) {
            System.out.print("숫자를 입력해주세요 : ");
            String player = scanner.nextLine();
            check.setInput(player);
            try {
                check.check(); // 사용자의 입력 데이터를 체크한다.
            }catch (IllegalArgumentException exception){
                System.out.println(exception); // 잘못된 데이터인 경우 개선 방향을 출력
                continue;
            }
            System.out.println("정상적인 input");
        }
    }
}
