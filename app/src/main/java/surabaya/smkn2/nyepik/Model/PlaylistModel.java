package surabaya.smkn2.nyepik.Model;

public class PlaylistModel {

    private String judul;
    private int image;
    private String urlImage;

    public PlaylistModel(String judul, int image, String urlImage) {
        this.judul = judul;
        this.image = image;
        this.urlImage = urlImage;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
