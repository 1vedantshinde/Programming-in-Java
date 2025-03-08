//23070126121
//Vedant Shinde
//AIML B2
public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        System.out.println("--------------------------");
        md.display();
        md.performQuack();
        md.performFly();
        System.out.println("--------------------------");

        RubberDuck rb = new RubberDuck();
        rb.display();
        rb.performQuack();
        rb.performFly();
        System.out.println("--------------------------");

        RedheadDuck rh = new RedheadDuck();
        System.out.println("-----------");
        rh.display();
        rh.performQuack();
        rh.performSwim();
        rh.performFly();
        System.out.println("------------");
    }
}
