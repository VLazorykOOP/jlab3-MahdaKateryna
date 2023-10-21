import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

// Абстрактний базовий клас Triad
abstract class Triad {
    abstract void increment();
    abstract void displayBefore();
    abstract void displayAfter();
}

// Похідний клас Date
class Date extends Triad {
    private GregorianCalendar calendar;

    public Date() {
        calendar = new GregorianCalendar();
    }

    @Override
    void increment() {
        calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
    }

    @Override
    void displayBefore() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Дата: " + dateFormat.format(calendar.getTime()));
    }

    @Override
    void displayAfter() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Дата після збільшення на 1: " + dateFormat.format(calendar.getTime()));
    }
}

// Похідний клас Time
class Time extends Triad {
    private GregorianCalendar calendar;

    public Time() {
        calendar = new GregorianCalendar();
    }

    @Override
    void increment() {
        calendar.add(GregorianCalendar.HOUR, 1);
    }

    @Override
    void displayBefore() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Час: " + timeFormat.format(calendar.getTime()));
    }

    @Override
    void displayAfter() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Час після збільшення на 1: " + timeFormat.format(calendar.getTime()));
    }
}
