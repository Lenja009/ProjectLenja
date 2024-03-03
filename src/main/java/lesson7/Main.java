package lesson7;

public class Main {
    public static void main(String[] args) {

        String[][] array1 = {
                {"1", "4", "45", "10"},
                {"5", "14", "435", "6"},
                {"0", "76", "4", "4"},
                {"65", "45", "405", "1"}
        };

        String[][] array2 = {
                {"1", "4", "45"},
                {"5", "14", "435", "6"},
                {"0", "76", "4", "4"},
                {"65", "45", "405", "1"}
        };

        String[][] array3 = {
                {"1", "4", "45", "five"},
                {"5", "14", "435", "6"},
                {"0", "76", "4", "4"}
        };

        String[][] array4 = {
                {"1", "4", "45", "10"},
                {"5", "14", "435", "6"},
                {"0", "76", "4", "4"},
                {"65", "45", "one", "1"}
        };
        try {
            int result = getSumOfArrayValues(array1);
            System.out.println("Сумма массива 1: " + result);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }


        try {
            int result = getSumOfArrayValues(array2);
            System.out.println("Сумма массива 2: " + result);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }


        try {
            int result = getSumOfArrayValues(array3);
            System.out.println("Сумма массива 3: " + result);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            int result = getSumOfArrayValues(array4);
            System.out.println("Сумма массива 4: " + result);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }



    }

    static int getSumOfArrayValues(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива не равен 4");
        }

        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("В строке " + (i + 1) + " количество элементов не равно 4");
            }
        }

        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            for (int element = 0; element < array[index].length; element++) {
                try {
                    sum += Integer.parseInt(array[index][element]);
                } catch (Exception ex) {
                    throw new MyArrayDataException("Невозможно привести значение к числу: " + (index + 1) + ", поле: "
                            + (element + 1) + " '" + array[index][element] + "'");
                }
            }
        }
        return sum;
    }
}
