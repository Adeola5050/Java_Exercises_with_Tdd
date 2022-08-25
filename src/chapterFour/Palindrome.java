package chapterFour;

public class Palindrome {

        private int firstNum;
        private  int secondNum;
        private int thirdNum;
        private int fourthNum;
int num=1111;
int number=1234;

        public void setFirstNum() {
        }

        public void setSecondNum() {
        }

        public void setThirdNum() {
        }

        public void setFourthNum() {
        }

        public int getFirstNum() {
                return firstNum;
        }

        public int getSecondNum() {
                return secondNum;
        }

        public int getThirdNum() {
                return thirdNum;
        }

        public int getFourthNum() {
                return fourthNum;
        }

        public void setFirstNum(int firstNum) {
                this.firstNum=firstNum;
        }

        public void setSecondNum(int secondNum) {
                this.secondNum=secondNum;
        }

        public void setThirdNum(int thirdNum) {
                this.thirdNum=thirdNum;
        }

        public void setFourthNum(int fourthNum) {
                this.fourthNum=fourthNum;
        }

        public int displayPalindrome() {
                if(firstNum % thirdNum== 0){
                        if(secondNum % fourthNum ==0){
                                return num;
                        }
                }
                return num;
        }

        public int displayNotPalindrome() {
                if(firstNum % thirdNum!= 0){
                        if(secondNum % fourthNum !=0){
                                return number;
                        }
                }
                return number;

        }

        public void setNumber(int number) {
                        if (number < 1) throw new ArithmeticException("Palindrome cannot be less than 1");

                this.number=number;
        }
}




