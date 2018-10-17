package surabaya.smkn2.nyepik.Model;

public class ContentModel {
    private int MainImage;
    private int CircleImage;
    private String JudulVideo;
    private String KeteranganVideo;

    public ContentModel(int mainImage, int circleImage, String judulVideo, String keteranganVideo) {
        MainImage = mainImage;
        CircleImage = circleImage;
        JudulVideo = judulVideo;
        KeteranganVideo = keteranganVideo;
    }

    public int getMainImage() {
        return MainImage;
    }

    public void setMainImage(int mainImage) {
        MainImage = mainImage;
    }

    public int getCircleImage() {
        return CircleImage;
    }

    public void setCircleImage(int circleImage) {
        CircleImage = circleImage;
    }

    public String getJudulVideo() {
        return JudulVideo;
    }

    public void setJudulVideo(String judulVideo) {
        JudulVideo = judulVideo;
    }

    public String getKeteranganVideo() {
        return KeteranganVideo;
    }

    public void setKeteranganVideo(String keteranganVideo) {
        KeteranganVideo = keteranganVideo;
    }
}
