public class Processor {
    private String model;
    private double speedGHz;

    public Processor(String model, double speedGHz) {
        this.model = model;
        this.speedGHz = speedGHz;
    }

    public String getModel() {
        return model;
    }

    public double getSpeedGHz() {
        return speedGHz;
    }

    public String processTask(String task) {
        return "Processing task: " + task + " with " + this.model + " at " + this.speedGHz + " GHz";
    }

    @Override
    public String toString() {
        return "Processor: " + this.model + ", Speed: " + this.speedGHz + " GHz";
    }
}
