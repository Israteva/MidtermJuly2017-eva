package design;

public  abstract class EmployeeAbstract {
    int rating;

    //abstract method
    public abstract void empHistory();
    public void rating (int rate){
        this.rating = rate;
    }
}
