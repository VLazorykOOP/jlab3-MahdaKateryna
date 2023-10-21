import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


interface Triad2 {
    void increment2();
    void displayBefore2();
    void displayAfter2();
}


class Date2 implements Triad2 {
    private GregorianCalendar calendar;

    public Date2() {
        calendar = new GregorianCalendar();
    }

    @Override
    public void increment2() {
        calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
    }

    @Override
    public void displayBefore2() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Дата: " + dateFormat.format(calendar.getTime()));
    }

    @Override
    public void displayAfter2() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Дата після збільшення на 1: " + dateFormat.format(calendar.getTime()));
    }
}


class Time2 implements Triad2 {
    private GregorianCalendar calendar;

    public Time2() {
        calendar = new GregorianCalendar();
    }

    @Override
    public void increment2() {
        calendar.add(GregorianCalendar.HOUR, 1);
    }

    @Override
    public void displayBefore2() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Час: " + timeFormat.format(calendar.getTime()));
    }

    @Override
    public void displayAfter2() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Час після збільшення на 1: " + timeFormat.format(calendar.getTime()));
    }
}