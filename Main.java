// Contoh kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek PayAccount
        PayAccount account = new PayAccount(3000);
        
        // Menampilkan saldo awal
        System.out.println("Saldo awal:");
        account.displayBalance();
        
        // Menyetorkan uang ke akun
        account.deposit(700);
        // Menarik uang dari akun
        account.withdraw(300);
        
        // Menampilkan saldo setelah transaksi
        System.out.println("Saldo setelah transaksi:");
        account.displayBalance();
        
        // Membuat objek PayEmployee
        PayEmployee employee = new PayEmployee("Taufik");
        
        // Menampilkan nama karyawan Pay
        employee.displayEmployeeName();
        
        // Memberikan bonus kepada karyawan
        employee.giveBonus(100);
    }
}