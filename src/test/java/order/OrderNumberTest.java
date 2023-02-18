package order;

import org.example.order.OrderNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderNumberTest {
    private final OrderNumber orderNumber = new OrderNumber();
    @Test
    @DisplayName("This test sorts an array of requested numbers in ascending order.")
    void shouldSortNumbersAscendingOrder() {
        // Arrange
        int[] arrayToOrganize = new int[]{2, 4, 5, 1, 6, 3, 9, 7, 8, 0};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Act
        int[] result = orderNumber.sortByAscendingNumberArray(arrayToOrganize);
        // Assert
        assertArrayEquals(expected, result);
    }
    @Test
    @DisplayName("This test sorts in ascending order an array of numbers containing negative numbers and " +
            "other repeated ones.")
    void shouldSortNumbersAscendingOrderWithNegativeNumbers() {
        // Arrange
        int[] arrayToOrganize = new int[]{2, 4, 55, 1, 6,-7, 3, 9,-33,100, 0,7, 8,-66, 0};
        int[] expected = new int[]{-66,-33,-7,0,0,1,2,3,4,6,7,8,9,55,100};
        // Act
        int[] result = orderNumber.sortByAscendingNumberArray(arrayToOrganize);
        // Assert
        assertArrayEquals(expected, result);
    }
}
