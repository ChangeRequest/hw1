package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static int calculateSum(int N) {
        int result = 0;

        for (int i = N; 2 * N >= i; i++)
            result+= i*i;
        return result;
    }
}
