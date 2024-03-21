// Contoh kelas PayAccount dengan modifier access public
public class PayAccount {
    // Properti saldo dengan modifier access private
    private double balance;
    
    // Constructor dengan modifier access public
    public PayAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    // Metode untuk menampilkan saldo dengan modifier access public
    public void displayBalance() {
        System.out.println("Saldo saat ini: " + balance);
    }
    
    // Metode untuk menyetorkan uang dengan modifier access public
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Berhasil menyetorkan " + amount + " ke akun.");
        } else {
            System.out.println("Jumlah yang disetorkan harus lebih besar dari 0.");
        }
    }
    
    // Metode untuk menarik uang dengan modifier access public
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Berhasil menarik " + amount + " dari akun.");
        } else {
            System.out.println("Jumlah yang ditarik harus lebih besar dari 0 dan tidak melebihi saldo.");
        }
    }
}