public class Uzaylilar extends Sprite {

    private final int INITIAL_X = 300;

    public Uzaylilar(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("./alien.png");
        getImageDimensions();
    }

	public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}