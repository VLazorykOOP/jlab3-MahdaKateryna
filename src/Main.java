public class Main {
    public static void main(String[] args) {
        System.out.println("Java Lab 3 \n");

        System.out.println("\t\t\t Task 1");

        Probation[] probations = new Probation[3];

        probations[0] = new Test("\t\tТест:","Математика", 60, 15);
        probations[1] = new Exam("\t\tIспит:","Фізика", 90, 20,50);
        probations[2] = new GraduationExam("\tВипускний іспит:","Історія", 120, 25, "Соціальні науки", 60);
 

        for (Probation probation : probations) {
            probation.show();
            System.out.println();
        }



        System.out.println("\t\t\t Task 2");

        Triad[] triads = new Triad[2];
        triads[0] = new Date();
        triads[1] = new Time();

        for (Triad triad : triads) {
            triad.displayBefore();
            triad.increment();
            triad.displayAfter();
            System.out.println();
        }


        System.out.println("\t\t\t Task 3");

        Triad2[] triads2 = new Triad2[2];
        triads2[0] = new Date2();
        triads2[1] = new Time2();

        for (Triad2 triad2 : triads2) {
            triad2.displayBefore2();
            triad2.increment2();
            triad2.displayAfter2();
            System.out.println();
        }


    }


}
