
// Базовий клас
class Probation {
    private int numberOfQuestions;
    private String prob;
    protected String subject;
    protected int duration;
    protected int passingScore;

    public Probation(String prob, String subject, int duration, int numberOfQuestions) {
        this.prob = prob;
        this.subject = subject;
        this.duration = duration;
        this.numberOfQuestions = numberOfQuestions;
    }

    public void show() {
        System.out.println(prob);
        System.out.println("Предмет: " + subject);
        System.out.println("Тривалість: " + duration + " хвилин");
        System.out.println("Кількість питань: " + numberOfQuestions);
    }
}

// Підкласи
class Test extends Probation {


    public Test(String prob, String subject, int duration, int numberOfQuestions) {
        super(prob, subject, duration, numberOfQuestions);

    }


}

class Exam extends Probation {


    public Exam(String prob, String subject, int duration, int numberOfQuestions, int passingScore) {
        super(prob, subject, duration, numberOfQuestions);
        this.passingScore = passingScore;
    }
    public void show() {
        super.show();
        System.out.println("Прохідний бал: " + passingScore);
    }

}

class GraduationExam extends Probation {
    private String major;

    public GraduationExam(String prob, String subject, int duration, int numberOfQuestions, String major, int passingScore) {
        super(prob, subject, duration, numberOfQuestions);
        this.major = major;
        this.passingScore = passingScore;
    }

    public void show() {
        super.show();
        System.out.println("Спеціальність: " + major);
        System.out.println("Прохідний бал: " + passingScore);
    }
}