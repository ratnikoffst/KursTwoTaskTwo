package ru.ratnikoff;

import ru.ratnikoff.exception.MyArrayDataException;
import ru.ratnikoff.exception.MyArraySizeException;

public class Main {

    //          1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо
//          бросить исключение MyArraySizeException.
//          2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива
//          преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//          MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные д
//          3. В методе main() вызвать полученный метод, обработать возможные исключения
//          MySizeArrayException и MyArrayDataException и вывести результат расчета.

    static String[][] mTestStringBugSymbol = new String[][]{
            {"1", "2", "3", "4"},
            {"8", "7", "a", "5"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}};

    static enum Rabotyaga {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}



    public static void main(String[] args) throws MyArrayDataException {

        String[][] mTestSize = new String[5][5];
        System.out.println("Пахать как лошадь еще "+(40-Rabotyaga.valueOf("WEDNESDAY").ordinal()*8)+" часов ");
        try {
            matrixTest(mTestSize);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            summDim(mTestStringBugSymbol);
        }
    }

    public static void matrixTest(String[][] mTestSize) throws MyArraySizeException, MyArrayDataException {
        if ((mTestSize.length > 4) || (mTestSize[0].length > 4))
            throw new MyArraySizeException("Нарушен размер матрицы !!! Вердикт расстрелять !");

        summDim(mTestStringBugSymbol);
    }

    private static void summDim(String[][] mTestSize) throws MyArrayDataException {
        int[][] mCurrentDim = new int[4][4];
        int j;
        int i;
        for (i = 0; i < mTestSize.length; i++) {
            for (j = 0; j < mTestSize.length; j++) {
                try {
                    mCurrentDim[i][j] = Integer.parseInt(mTestSize[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }
}
