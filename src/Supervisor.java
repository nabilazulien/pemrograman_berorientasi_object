public class Supervisor extends Employee {
    private int checkIn;
    private int checkOut;
    private int childCount;
    public Supervisor(String employeeId, String name, int checkIn, int checkOut, int childCount) {
        super(employeeId, name, "SPV", 10000000, 1000000, 10000, 300000, 200000);
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
