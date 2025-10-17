package entity;

public sealed class Admin extends User permits ZooManagement{
    @Override
    public void calculateSalary() {

    }
}
