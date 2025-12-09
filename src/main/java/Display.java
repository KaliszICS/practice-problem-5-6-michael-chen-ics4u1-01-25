public class Display {
    private double sizeInches;
    private String resolution;
    protected boolean isOn = false;

    public Display(double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = resolution;
    }

    public double getSizeInches() {
        return sizeInches;
    }

    public String getResolution() {
        return resolution;
    }

    public String turnOn() {
        this.isOn = true;
        return "Display turned on. " + this.sizeInches + "-inch, " + this.resolution;
    }

    public String turnOff() {
        this.isOn = false;
        return "Display turned off.";
    }

    @Override
    public String toString() {
        return "Display: " + this.sizeInches + " inches, Resolution: " + this.resolution;
    }
}