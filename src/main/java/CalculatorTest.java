import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        int i = 100;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(i!=0){
            double a =0;
            double b = 0;
            System.out.println("---- MENU --- Please Select On1");
            System.out.println("1 --  SUM");
            System.out.println("2 --  Division");
            System.out.println("3 --  Multiplication");
            System.out.println("4 --  Substraction");
            System.out.println("0 -- Exit" );
            try{
               i =  Integer.parseInt(scanner.next());
               if(i==0){
                   break;
               }
                System.out.println("Input Number 1");
                a = Double.parseDouble(scanner.next());
                System.out.println("Input Number 2");
                b = Double.parseDouble(scanner.next());
                switch (i){
                    case 1 : {
                        System.out.println(calculator.sum(a,b));
                    }break;
                    case 2: {
                        System.out.println(calculator.divide(a,b));
                    }break;
                    case 3 :{
                        System.out.println(calculator.multiply(a,b));
                    }break;
                    case 4:{
                        System.out.println(calculator.substract(a,b));
                    }break;
                    case 0: {
                        break;
                    }
                    default:{
                        System.out.println("Please Select a valid option");
                    }
                }


            }catch (Exception ex){
                ex.printStackTrace();
                System.out.println("Please Select a valid option");
            }



        }
    }
}
