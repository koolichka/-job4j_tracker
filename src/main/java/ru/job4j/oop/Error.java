package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Наличие неполадки: " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Описание неполадки: " + message);
    }

    public static void main(String[] args) {
        Error errorFirst = new Error();
        errorFirst.printError();
        System.out.println();
        Error errorSecond = new Error(true, 2, "Режект кассета не установлена");
        errorSecond.printError();
        System.out.println();
        Error errorThird = new Error(true, 72, "Параметры банкнот отсутствуют");
        errorThird.printError();
    }
}
