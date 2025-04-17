public class Calculator {

    int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    int sub(int a, int b){
        int s = a - b;
        return s;
    }

    int mul(int a, int b){
        int m = a * b;
        return m;
    }

    int div(int a, int b){
        int d = a / b;
        return d;
    }

    int mod(int a, int b){
        int mo = a % b;
        return mo;
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        int ans1 = cal.add(10,10);
        int ans2 = cal.sub(10,10);
        int ans3 = cal.mul(10,10);
        int ans4 = cal.div(10,10);
        int ans5 = cal.mod(10,10);

        System.out.println("adding 10 + 10 = " + ans1);
        System.out.println("adding 10 + 10 = " + ans2);
        System.out.println("adding 10 + 10 = " + ans3);
        System.out.println("adding 10 + 10 = " + ans4);
        System.out.println("adding 10 + 10 = " + ans5);

    }
}
