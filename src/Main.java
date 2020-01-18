public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", "Smith");
        Worker worker2 = new Worker("Joe", "Szmit");
        Worker worker3 = new Worker("Johnnny", "Smithers");

        worker1.setAge(40);
        worker2.setAge(21);
        worker3.setAge(18);


        System.out.println(worker1);
        System.out.println(worker2);

        System.out.println(worker3);
        Worker[] workers = {worker1, worker2, worker3};
        Company company = new Company(workers);

        System.out.println(company.getWorkers()[0].getName());

        System.out.println(company.getWorkers()[1].getSurname());
    }
}
