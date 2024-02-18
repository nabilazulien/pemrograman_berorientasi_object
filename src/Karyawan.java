public class Karyawan extends Employee {
    private int checkIn;
    private int checkOut;
    private int childCount;
    public Karyawan(String employeeId, String name, int checkIn, int checkOut, int childCount) {
        super(employeeId, name, "KRY", 1500000, 250000, 5000, 200000, 130000);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.childCount = childCount;
    }
    @Override
    protected int getCheckIn() {
        return checkIn;
    }
    @Override
    protected int getCheckOut() {
        return checkOut;
    }
    @Override
    protected int calculateOvertime() {
        return Math.max(0, checkOut - 16);
    }
    @Override
    protected int getChildCount() {
        return childCount;
    }
}
