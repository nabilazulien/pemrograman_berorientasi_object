public class Teknisi extends Employee {
    private int checkIn;
    private int checkOut;
    private int childCount;
    public Teknisi(String employeeId, String name, int checkIn, int checkOut, int childCount) {
        super(employeeId, name, "TKN", 3000000, 500000, 5000, 200000, 150000);
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
