package Builder;

public interface Builder {
    Builder setSize(double size);
    Builder setWindows(int windows);
    Builder setWallColor(String color);
    Builder setHasEnsuite(boolean hasEnsuite);
    Builder setHasBalcony(boolean hasBalcony);
    Bedroom build();
}

// Exercise 4a: Concrete Builder
class BedroomBuilder implements Builder {
    private double size;
    private int windows;
    private String wallColor = "White"; // Giá trị mặc định (Default value)
    private boolean hasEnsuite;
    private boolean hasBalcony;

    public Builder setSize(double size) {
        this.size = size;
        return this; // Trả về chính nó để gọi phương thức liên tiếp (Chaining)
    }

    public Builder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public Builder setWallColor(String color) {
        this.wallColor = color;
        return this;
    }

    public Builder setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
        return this;
    }

    public Builder setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
        return this;
    }

    public Bedroom build() {
        return new Bedroom(size, windows, wallColor, hasEnsuite, hasBalcony, null, null, null);
    }
}
