public class Calculator {


    public double sum(double a, double b){
        return a+b;
    }

    public double divide(double a, double b) throws NoZeroException{
        if(b==0.0){
            throw new NoZeroException("Sorry boss no 0 allowed");
        }
        return a/b;
    }

    public double multiply(double a, double b){
        return  a*b;
    }

    public  double substract(double a, double b){
        return  a-b;
    }

}