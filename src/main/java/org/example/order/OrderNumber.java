package org.example.order;

public class OrderNumber {
    public int[] sortByAscendingNumberArray(int[] numbers) {
        int smallestNumber = 0;
        for (int number = 0; number < numbers.length; number++) {
            for (int nextNumber = 1; nextNumber < (numbers.length - number); nextNumber++) {
                if (numbers[nextNumber - 1] > numbers[nextNumber]) {
                    smallestNumber = numbers[nextNumber - 1];
                    numbers[nextNumber - 1] = numbers[nextNumber];
                    numbers[nextNumber] = smallestNumber;
                }
            }
        }
        return numbers;
    }
}
