public class Company {

    private String name;
    private Worker[] workers;

    public Company(Worker[] workers) {
        this.workers = workers;

    }

    public String getName () {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker[] getWorkers() {

        return workers;
    }

    public void setWorkers(Worker[] workers) {

        this.workers = workers;
    }
}
