public class Main {
    public static void main(String[] args) {
        //task 1
        float dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Task 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Task 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3
        dog = (float) (dog - 3.5);
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Task 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task6
        System.out.println("Task 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var sumWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов = " + sumWeight);
        var subtractionWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между весами бойцов = " + subtractionWeight);

        //task7
        System.out.println("Task 7");
        subtractionWeight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница между весами бойцов = " + subtractionWeight);

        //task8
        System.out.println("Task 8");
        var totalHours = 640;
        var workingDay = 8;
        var employees = totalHours / workingDay;
        System.out.println("Всего работников в компании - " + employees + " человек ");

        employees += 94;
        workingDay = totalHours / employees;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + workingDay + " часов работы может быть поделено между сотрудниками");
    }
}

