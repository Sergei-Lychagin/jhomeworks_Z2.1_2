public class Main {
    public static void main(String[] args) throws Exception {
float deposit = 300.90f;
float contribution = 1200.50f;
float balance = deposit + contribution;

if (balance > 1000) {
    
int bonus = (int)(balance/100);
    balance = balance + bonus;
    System.out.println("Ваш бонус");
    System.out.println(bonus);
    }
else {balance = balance;}

System.out.println(balance);
        
    }
}
