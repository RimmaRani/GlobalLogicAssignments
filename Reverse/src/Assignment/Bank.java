package Assignment;
//Account class
class Account{
//variable declaration
double bankbalance;
int accountnumber;
//Constructor
public Account(int number) {
bankbalance=0.0;
accountnumber=number;
}
//method calling
public void deposit(double amount) {
if(amount>0)
{
bankbalance=bankbalance+amount;}
else {
System.out.println("cannot deposit amount");
}
}
//method calling
public void withdraw(double amount)
{
if(amount>0) {
bankbalance=bankbalance-amount;
}
else {
System.out.println("cannot withdraw amount");
}

}
//method calling
public double getBalnace() {
return bankbalance;
}
//method calling
public double getAccountNumber() {
return accountnumber;
}
//method calling
public String s() {
return "account number is"+accountnumber+" account balance is "+bankbalance;

}
//method calling
public final void display() {
System.out.println(s());
}
}
//Saving Account
class SavingAccount extends Account{
//variable declaration

double interest;
//Constructor
SavingAccount(int accountnumber,double interest){
super(accountnumber);
this.interest=interest;
}
//method calling
public double getint() {
double a= getBalnace()+ getBalnace()*interest;
return a;
}
//method calling
void addinterest(double interest) {
double a=super. getBalnace()*interest;
super.deposit(a);
}
//method calling
public String s() {
return super.s()+"Interest amont "+interest;
}
}

// CurrentAccount
class  CurrentAccount  extends Account{
double limitbalance;
//constructor
CurrentAccount(int accountnumber,double limitbalance){
super(accountnumber);
this.limitbalance=limitbalance;
}
//method calling
public double geeting() {
return this.limitbalance;
}
//method calling
public void withdrawl(double limitbalance) {
if(limitbalance<=this.limitbalance) {
super.withdraw(limitbalance);
}

else {
System.out.println("bank limit has been exceed");
}
}
//method calling
public String s() {
return super.s()+"bank Limit"+limitbalance;
}
}
//Bank class
 class Bank {

public static void main(String[] args) {
// TODO Auto-generated method stub
Account accounts[]=new Account[2];//object creation
accounts[0]=new SavingAccount(1,1.45);
accounts[0]=new CurrentAccount(2,30);
//declaration of for loop
for(int i=0;i<accounts.length;i++)
{
if(accounts[i]instanceof SavingAccount )
{
SavingAccount account=(SavingAccount) accounts[i];
System.out.println(account.getint());
}}}}