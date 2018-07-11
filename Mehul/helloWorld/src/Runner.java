import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Person pers1 = new Person("tom",23,"devops");

        Person pers2 = new Person("dave",26,"tester");

        Person pers3 = new Person("john",28,"developer");

        Person pers4 = new Person("paul",31,"tester");


        ArrayList<Person> person = new ArrayList<>();
//        System.out.println(pers2.toString());


        person.add(pers1);
        person.add(pers2);
        person.add(pers3);
        person.add(pers4);

        for (int i = 0; i < person.size(); i++) {

            //System.out.println(person.get(i));



        }
        Scanner sc = new Scanner(System.in);
        String who = sc.next();
//        System.out.println(who);
//        for(Person pers: person) {
            if(who.equals("tom")) {
                System.out.println(pers1);
            }
            else if (who.equals("dave")) {
                System.out.println(pers2);
            }
            else if (who.equals("john")) {
                System.out.println(pers3);
            }
            else if (who.equals("paul")) {
                System.out.println(pers4);
            }
            else {
                System.out.println("Is not in list");
        }
        }




    }




