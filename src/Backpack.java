public class Backpack {
    private String brand;
    private int volume;
    
    // Constructor
    public Backpack(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String capacity() {
        if (volume >= 50) {
            return "large";
        } else if (volume >= 20) {
            return "medium";
        } else {
            return "light";
        }
    }
}