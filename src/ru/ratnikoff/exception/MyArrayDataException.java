package ru.ratnikoff.exception;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("Произошла ошибка преобразования строка от 0=" + i + " от 1=" + (i + 1) + " столбец от 0=" + j + " от 1=" + (j + 1)
                + " Вердикт бракоделов расстрелять !!!");
    }
}
