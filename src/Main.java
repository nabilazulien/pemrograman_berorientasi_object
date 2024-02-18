public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor("SPV001", "John Doe", 8, 17, 2);
        System.out.println("Total Gaji Supervisor: " + supervisor.calculateSalary());

        HRD hrd = new HRD("HRD001", "Jane Smith", 7, 18, 1);
        System.out.println("Total Gaji HRD: " + hrd.calculateSalary());

        Teknisi teknisi = new Teknisi("TKN001", "Michael Johnson", 7, 17, 0);
        System.out.println("Total Gaji Teknisi: " + teknisi.calculateSalary());

        Karyawan karyawan = new Karyawan("KRY001", "Alice Brown", 8, 16, 3);
        System.out.println("Total Gaji Karyawan: " + karyawan.calculateSalary());
    }
}
