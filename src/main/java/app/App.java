package app;
import java.util.*;  
import java.lang.Math; 
// import Calculator;

public class App{

    private Scanner sc;
    private Calculator cal_app;


    public double get_input(Scanner sc){  
        double number = sc.nextDouble();  
        return number;
    }

    public void initilizing(){
        sc = new Scanner(System.in);
        cal_app = new Calculator();
        System.out.println("----- Scientific Calculator cal_app -----");
        System.out.println("Following are the available operations:");
        System.out.println("1. Square Root Function");
        // System.out.println("2. Factorial Function");
        // System.out.println("3. Natural Logarithm (base e) Function");
        // System.out.println("4. Power Function");
        System.out.println("5. exit");
    }

    public void run(){
        while(true){
            System.out.print("Select the desired operation number: ");
            double operation = this.get_input(sc);
            if(operation == 5) break;
            else if(operation <=0 || operation>5){
                System.out.println("Invalid Operation, Please input a valid operation number");
                continue;
            }
            // else if(operation == 4){
            //     System.out.print("Enter Base: ");
            //     double base = this.get_input(sc);
            //     System.out.print("Enter power: ");    
            //     double power = this.get_input(sc);
            //     cal_app.power(base,power);
            // }
            else{
                System.out.print("Enter Number: ");
                double number = this.get_input(sc);
                if(operation == 1) cal_app.square_root(number);    
                // else if(operation == 2) cal_app.factorial(number);
                // else if(operation == 3) cal_app.loge(number);
                else System.out.println("******** Invalid Operation Number ********");
            }
            System.out.println("==========> Ans is: " + cal_app.get_ans());
        }
        System.out.println("----- Scientific Calculator App Closing ------");
    }

    public static void main( String[] args ){
        App app = new App();
        app.initilizing();
        app.run();
    }
}
