public class Person {

    public String name;
    public int age;
    public String job_title;

    public Person (String name,int age, String job_title ){

        this.name = name;
        this.age = age;
        this.job_title = job_title;
    }



    public String toString(){
        return name + " "+ age +" "+ job_title;
    }


}

