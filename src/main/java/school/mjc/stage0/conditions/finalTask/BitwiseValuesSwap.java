package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = 6;
        second = 7;
        first = first^second;
        second = first^second;
        first = first^second;
        System.out.println(first);
        System.out.println(second);

//        System.out.println(first);
//        System.out.println(second);


    }
}
