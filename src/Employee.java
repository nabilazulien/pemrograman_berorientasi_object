public abstract class Employee implements Payable {
    protected String employeeId;
    protected String name;
    protected String position;
    protected double baseSalary;
    protected double transportAllowance;
    protected double overtimeRate;
    protected double wifeAllowance;
    protected double childAllowance;
    public Employee(String employeeId, String name, String position, double baseSalary, double transportAllowance, double overtimeRate, double wifeAllowance, double childAllowance) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.transportAllowance = transportAllowance;
        this.overtimeRate = overtimeRate;
        this.wifeAllowance = wifeAllowance;
        this.childAllowance = childAllowance;
    }
    @Override
    public double calculateSalary() {
        int lateHours = Math.max(0, 7 - getCheckIn());
        int earlyOutHours = Math.max(0, getCheckOut() - 16);
        double salary = baseSalary - (100000 * lateHours) + (100000 * earlyOutHours);
        int overtimeHours = calculateOvertime();
        salary += overtimeHours * overtimeRate;
        salary += transportAllowance + wifeAllowance + (getChildCount() * childAllowance);
        return salary;
    }
    protected abstract int getCheckIn();
    protected abstract int getCheckOut();
    protected abstract int calculateOvertime();
    protected abstract int getChildCount();
}
