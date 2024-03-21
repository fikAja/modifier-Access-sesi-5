// Contoh kelas PayEmployee dengan modifier access public
public class PayEmployee {
    // Properti nama dengan modifier access private
    private String name;
    
    // Constructor dengan modifier access public
    public PayEmployee(String name) {
        this.name = name;
    }
    
    // Metode untuk menampilkan nama karyawan bank dengan modifier access public
    public void displayEmployeeName() {
        System.out.println("Nama karyawan bank: " + name);
    }
    
    // Metode untuk memberikan bonus kepada karyawan dengan modifier access public
    public void giveBonus(double bonusAmount) {
        System.out.println("Memberikan bonus sebesar " + bonusAmount + " kepada karyawan " + name);
    }
}