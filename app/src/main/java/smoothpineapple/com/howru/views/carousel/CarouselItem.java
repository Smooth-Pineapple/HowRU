package smoothpineapple.com.howru.views.carousel;

public class CarouselItem {
    private final int id;
    private final String name;
    private final int image;

    public CarouselItem(int id, String name, int image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
