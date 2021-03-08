package app;

public class Calculator{
    private double ans;

    public void square_root(double x){
        this.ans = Math.sqrt(x);
    }

    // public void factorial(double x){
    //     this.ans = 1;
    //     for(int i=1;i<=x;i++) this.ans *= i;
    // }

    // public void loge(double x){
    //     this.ans = Math.log(x);
    // }

    // public void power(double x, double y){
    //     this.ans = Math.pow(x,y);
    // }

    public double get_ans(){
        return this.ans;
    }
}