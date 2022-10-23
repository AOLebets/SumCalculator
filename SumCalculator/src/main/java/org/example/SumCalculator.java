package org.example;

public class SumCalculator {
    public int sum (int n) throws IllegalArgumentException {
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum = sum + i;
            return sum;
        }
        throw new IllegalArgumentException("This argument is illegal");
    }
}
