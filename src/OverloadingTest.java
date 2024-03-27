public class OverloadingTest {
    void addNum() {
        System.out.println("addNum() with zero parameters");
    }

    void addNum(int x, int y){
        System.out.println("addNum() with two parameters (int + int) > " + x + " + " + y + " = " + (x + y));
    }

    void addNum(int x, float y){
        System.out.println("addNum() with two parameters (int and float) > " + x + " + " + y + " = " + (x + y));
    }

    public static void main(String[] args) {
        OverloadingTest obj = new OverloadingTest();
        obj.addNum(10, 23f);
        obj.addNum();
        obj.addNum(10, 20);
    }
}
