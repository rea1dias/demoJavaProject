package Method;

public class Task1 {


    int sum (int a, int b, int c) {

        int result = a + b + c;
        return result;

    }

}

class Test1 {
    public static void main(String[] args) {

        Task1 task1 = new Task1();

        int sumOfNum = task1.sum(5,6,8);

        System.out.println(sumOfNum);




    }
}
