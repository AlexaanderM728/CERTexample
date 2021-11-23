package pl.edu.pjwstk.bsi;

public class Calculator {
    public int subFloatFromInt(int a, float b) {
        return a - (int)b;
    }
    public int multiply(int a, int b, int c){
        return (b*b) - (a*c);
    }
    public float division(float a, float b){
        return a/b;
    }

     public void printPowersGivenNumber(float n, int num) {
        for (float x = 1.0f; x <= n; x += 1.0f) {
            System.out.print(num+" ");
            num *= num;
        }
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println(calculator.subFloatFromInt(1234567890, 1234567890));
        System.out.println(calculator.multiply(1,4,3));
        System.out.println(calculator.division(5.0f, 6.0f));
        calculator.printPowersGivenNumber(9.0f,2);
    }
}
