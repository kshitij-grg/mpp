package prob1;

public class PersonWithJob {

    private double salary;
    private Person person;

    public double getSalary() {
        return salary;
    }

    public PersonWithJob(Person person, double s) {
        this.person = person;
        salary = s;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object aPersonWithJob) {
        if (aPersonWithJob == null) return false;
        if (!(aPersonWithJob instanceof PersonWithJob)) return false;
        PersonWithJob p = (PersonWithJob) aPersonWithJob;
        return this.getPerson().equals(p.getPerson()) &&
                this.getSalary() == p.getSalary();
    }

    public static void main(String[] args) {
        Person p2 = new Person("Joe");
        Person p1 = new PersonWithJob(p2, 30000).getPerson();
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }


}
