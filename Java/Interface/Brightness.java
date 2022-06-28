interface BrightnessControl {
    abstract void increaseBrightness();
    void decreaseBrightness();
}
class TV implements BrightnessControl {
    public void increaseBrightness() {
        System.out.println("TV: Increase Brightness");
    }
    public void decreaseBrightness() {
        System.out.println("TV: Decrease Brightness");
    }
}
class VDU implements BrightnessControl {
    public void increaseBrightness() {
        System.out.println("VDU: Increase Brightness");
    }
    public void decreaseBrightness() {
        System.out.println("VDU: Decrease Brightness");
    }
}
class Brightness {
    public static void main(String[] args) {
        BrightnessControl tv = new TV();
        BrightnessControl vdu = new VDU();
        tv.increaseBrightness();
        tv.decreaseBrightness();
        vdu.increaseBrightness();
        vdu.decreaseBrightness();
    }
}