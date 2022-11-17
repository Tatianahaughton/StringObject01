public interface Outputs {
    void display();
}

interface Functions extends Outputs {
    double adding(double firstNumber, double secondNumber);
    double subtract(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double divide(double firstNumber, double secondNumber);
}


class Math implements Functions {
    double result=0;
    public double adding(double firstNumber,double secondNumber){

        result=firstNumber+secondNumber;
        return result;
    }
    public double subtract(double firstNumber,double secondNumber){

        result=firstNumber-secondNumber;
        return result;
    }
    public double multiply(double firstNumber,double secondNumber) {

        result=firstNumber*secondNumber;
        return result;
    }
    public double divide(double firstNumber,double secondNumber){

        result=firstNumber/secondNumber;
        return result;
    }

    public void display(){

        System.out.println("Result is " +result);
    }

    public static void main(String[] args) {
        double firstNumber = 100.00;
        double secondNumber = 20.00;

        Math math=new Math();
        math.adding(firstNumber,secondNumber);
        math.display();

        math.subtract(firstNumber,secondNumber);
        math.display();

        math.multiply(firstNumber,secondNumber);
        math.display();

        math.divide(firstNumber,secondNumber);
        math.display();
    }
}
