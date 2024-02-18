public class HRD extends Employee {
    private int checkIn;
    private int checkOut;
    private int childCount;
    public HRD(String employeeId, String name, int checkIn, int checkOut, int childCount) {
        super(employeeId, name, "HRD", 5000000, 750000, 7500, 250000, 190000);
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
