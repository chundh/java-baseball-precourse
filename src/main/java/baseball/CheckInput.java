package baseball;

public class CheckInput {
    String input;
    private void checkInputLength(String input) {
        // input 데이터가 세 자릿수인지 확인
        if (input.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자로 입력해주세요");
        }
    }
    private void checkInputValue(String input){
        // 숫자가 아닌 다른 데이터가 있는지 확인
        for (int index = 0; index < input.length(); index++) {
            char tempChar = input.charAt(index);
            if(tempChar<49 || tempChar>57)
                throw new IllegalArgumentException("1~9까지의 숫자로만 구성된 값을 입력해주세요");
        }
    }
    private void checkInputDuplicate(String input){
        // 각 자릿수에 중복되는 값이 있는지 확인
        int[] useNumber = new int[10];
        for (int index = 0; index < input.length(); index++) {
            int tempNumber = Integer.parseInt(input.substring(index, index+1));
            if(useNumber[tempNumber] != 0){
                throw new IllegalArgumentException("각 자리에 중복되지 않는 수를 입력해주세요");
            }else{
                useNumber[tempNumber] = 1;
            }
        }
    }
    public void check(){
        checkInputLength(input);
        checkInputValue(input);
        checkInputDuplicate(input);
    }
    public void setInput(String input) {
        this.input = input;
    }
}
