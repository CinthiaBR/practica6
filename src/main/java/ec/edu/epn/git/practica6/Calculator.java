package ec.edu.epn.git.practica6;

public class Calculator {
    private int answer;
    public int addition(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b){
        return a-b;
    }
    public int multiplication (int a, int b){

        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
