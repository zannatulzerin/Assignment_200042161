package assignment2.ControlCoupling;

public class Account {
//    public String FullName;
//    public int Account_no;
//    public int age;
//    public String gender;

    public void Account(IAccount type) {
        SavingsAccount savingsAccount = new SavingsAccount();
        JointAccount jointAccount = new JointAccount();

        if (type.equals(savingsAccount)) {
            savingsAccount.PrintType();
        }
        else if (type.equals(jointAccount)) {
            jointAccount.PrintType();
        }
    }
}
