package saveourcar.soc;

/**
 * Created by Craigg on 16/04/2016.
 */
public class InsuranceCompany {
    private int imageId;
    private String name;

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public InsuranceCompany(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return name;
    }
}
