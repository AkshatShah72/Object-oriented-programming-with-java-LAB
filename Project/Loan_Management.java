import java.util.*;
import java.io.*;
class BOI_gnr{
 String name,acc_type;
 int Acc_num,Acc_Balance,accHolderPhoneNo;
 double NetWorth=50000;
 int no_of_ac=0;
 double loan_sanctioned=0;
 BOI_gnr(){
 }
 BOI_gnr(String name,int acc_num,int Acc_Balance,String a_t,int accHolderPhoneNo){
 this.name=n;
 this.Acc_num=acc_num;
 this.Acc_Balance=balance;
 this.acc_type=a_t;
 this.accHolderPhoneNo= accHolderPhoneNo;
NetWorth = NetWorth + Acc_Balance;
 no_of_ac+=1;
 }
} // end class
class create_account extends BOI_gnr{
 create_account(){
 super();
 }
 void insert(String n,int acc_num,String a_t){ // input user name, account number and type 
 name=n;
 acc_type=a_t;
 Acc_num=acc_num; // generate random account number 
 Acc_Balance=1000;
 } 
 void display_details(){
 System.out.println("Depositor Name :" +name);
 System.out.println("Account Number : "+Acc_num);
 System.out.println("Account Balance : "+Acc_Balance);
 System.out.println("Account Type : "+acc_type);
 }
 void deposit(int acc_num,int money){ 
 Acc_Balance=money; 
 }
 
 int withdraw(int withd){
 Acc_Balance=Acc_Balance-withd;
 return Acc_Balance;
 }
void loan_check(int amt){
 if ((amt < 2*this.Acc_bal) && (this.loan_Sanctioned < NetWorth)){
 System.out.println("Your request for loan is approved.");
 NetWorth = NetWorth - amt;
 this.loan_Sanctioned+=amt;
 }
 else{
 System.out.println("Your request for the loan is rejected.");
 }
 }
 void repay_loan(int repay_amt){
 NetWorth+=repay_amt;
 this.loan_Sanctioned-=repay_amt;
 if (repay_amt>this.loan_Sanctioned){
 int diff = repay_amt - this.loan_Sanctioned;
 this.Acc_bal+=diff;
 this.count+=1;
 } else if (repay_amt == this.loan_Sanctioned) {
 this.count+=1;
 }
 else {
 int amtleft = this.loan_Sanctioned - repay_amt; //error
 this.count+=1;
 System.out.println("Amt left to pay is "+amtleft);
 }
 
} // end class 
public class Main {
 public static void main(String args[]){
 String user_name=null,type;
 type = null;
 int balance=0,tmp=0;
 int withd=0,cb=0;
// to generate Random Account Number 
int aNumber = 0; 
aNumber = (int)((Math.random() * 90000000)+10000000); // random generate 9 digit a/c number
 create_account user = new create_account("user",0,0,"savings",0); // initilaize --
name,acc_number,Balance,Type
 
 Scanner in = new Scanner(System.in);
 Scanner strng=new Scanner(System.in);
 int userChoice;
 boolean quit = false;
 do {
 System.out.println("*Welcome to gandhinagar branch of BOI*\n\n");
 System.out.println("1. Create Account");
 System.out.println("2. Deposit money");
 System.out.println("3. Withdraw money");
 System.out.println("4. Check balance");
 System.out.println("5. Apply for loan");
 System.out.println("6. Loan pay details");
 System.out.println("7. Display Account Details");
 System.out.println("0. to quit: \n");
 System.out.print("Enter Your Choice : ");
 userChoice = in.nextInt();
 switch (userChoice) {
 
 case 1:
 System.out.print("Enter your Name : ");
 user_name=strng.nextLine(); 
 System.out.print("Enter Account Type : ");
 type=in.next();
 System.out.println("Enter phone No to be registered:");
 int num=in.nextInt();
 user.insert(user_name, aNumber, type); // inserted 
 System.out.println("\n\tYour Account Details\n\tDont Forget Account Number\n");
 System.out.println("**************************"); 
 user.display_details();
 break;
 
 case 2: // deposit
 System.out.print("Enter your account Number : ");
 tmp=in.nextInt();
 if(tmp==user.Acc_num){
 System.out.print("Enter Amount Of Money : ");
 balance=in.nextInt();
 user.Acc_Balance=balance;
 System.out.println("\t Successfully Deposited.");
 } 
 else
 System.out.println("Wrong Account Number."); 
 
 break; 
 
 case 3: // withdraw money 
 System.out.print("Enter your account Number : ");
 tmp=in.nextInt();
 
 if(tmp==user.Acc_num){ 
 if(user.Acc_Balance==0)
 System.out.print("Your Account is Empty.");
 
 else{
 System.out.print("Enter Amount Of Money : "); 
 withd=in.nextInt(); 
 
 if(withd>user.Acc_Balance){
 System.out.print("Enter Valid Amount of Money : ");
 withd=in.nextInt();
 }
 else
 cb= user.withdraw(withd);
 System.out.println("Your Current Balance : "+cb); 
 }
 }
 else
 System.out.println("Wrong Account Number."); 
 break;
 
 case 4: // check balance 
 System.out.print("Enter your Account Number : ");
 tmp=in.nextInt();
 
 if(tmp==user.Acc_num){
 System.out.println("Your Current Balance : "+user.Acc_Balance);
 }
 else
 System.out.println("Wrong Account Number."); 
 break;
 
 case 5:
 System.out.println("Enter the type of field for which you want loan:");
 String field_type=strng.nextLine();
 System.out.println("Enter the amount for loan:");
 int amt=in.nextInt();
 case 6:
System.out.println("Your acc_bal is "+this.Acc_bal);
 System.out.println("No. of installments made: "+this.count);
 case 7: // display all info 
 System.out.print("Enter your Account Number :");
 tmp=in.nextInt(); 
 if(tmp==user.Acc_num){ 
 user.display_details(); 
 }else
 System.out.println("Wrong Account Number.");
 
 break;
 case 0:
 quit = true;
 break;
 default:
 System.out.println("Wrong Choice.");
 break;
 }
 System.out.println("\n");
 } while (!quit);
 System.out.println("Thanks !");
 
 } // end main function 
 void Inspection_Bank(){
 System.out.println("Networth of the Bank: \n"+NetWorth);
 System.out.println("Number of active accounts:\n "+No_of_Acc);
 System.out.println("Total loan amt sanctioned till date:\n "+this.loan_Sanctioned); }
}
}
