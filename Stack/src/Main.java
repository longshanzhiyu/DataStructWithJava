import java.util.Random;

public class Main {

    //测试使用stack运行opCount个push和pop操作所需要的时间，单位：秒
    private static double testStack(Stack<Integer> stack, int opCount) {

        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i=0; i<opCount; i++)
            stack.push(random.nextInt(Integer.MAX_VALUE));
        for (int i=0; i<opCount; i++)
            stack.pop();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
//        ArrayStack<Integer> stack = new ArrayStack<>();
//        for (int i= 0; i< 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }

//        stack.pop();
//        System.out.println(stack);


        //测试性能
        int opCount = 100000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time: " + time1 + " s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("linkedListStack, time: " + time2 + " s");
    }
}
