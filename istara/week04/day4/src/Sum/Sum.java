package Sum;

import java.util.List;

public class Sum {
    public int sum(List<Integer> numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}