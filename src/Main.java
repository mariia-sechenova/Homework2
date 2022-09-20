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
        dog = dog + 4;
        cat = cat + 4;
        paper += 4;
        System.out.println("Task 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3
        dog = (float) (dog - 3.5);
        cat = cat - 1.6;
        paper -= 7639;
        System.out.println("Task 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}