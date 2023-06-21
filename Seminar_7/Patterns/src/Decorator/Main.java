package Decorator;

public class Main {
    public static void main(String[] args) {
        
        iCalculable calculator = new CalcDecorator(new Calculator(0),new Logger());
        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }
}
