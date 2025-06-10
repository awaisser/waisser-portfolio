import java.util.*;
public class BankAccount {
    private String user;
    private double saving;
    private double checking;
    public BankAccount (String name, double amt1, double amt2){
        user=name;
        saving=amt1;
        checking=amt2;
    }
    public void setName (String NewName){
        user=NewName;
    }
    public String getName() {
        return user;
    }
    public void setChecking(double amt){
        checking = amt;
    }
    public double getChecking(){
        return checking;
    }
    public void setSaving(double amt){
        saving=amt;
    }
    public double getSaving(){
        return saving;
    }
    public void depositChecking(double amt){
        if (amt>0)
            checking += amt;
    }
    public void depositSavings(double amt){
        if (amt>0)
            saving += amt;
    }
    public void withdrawChecking (double amt){
        if (amt>0)
            checking -= amt;
    }
    public void withdrawSavings (double amt){
        if (amt>0)
            saving -= amt;
    }
    public void transferToSavings (double amt){
        if (amt>0) {
            checking -= amt;
            saving+= amt;
        }
    }
}
