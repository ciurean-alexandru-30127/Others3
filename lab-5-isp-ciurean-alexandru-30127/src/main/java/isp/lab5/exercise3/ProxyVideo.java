package isp.lab5.exercise3;


class ProxyVideo implements Playable {

    private ColorVideo colorVideo;
    private String fileName;
    private BlackAndWhiteVideo blackAndWhiteVideo;
    private String type;

    public ProxyVideo(String fileName, String type) {
        this.fileName = fileName;
        this.type = type;
    }

    @Override
    public void play() {
        if (type == "colorVideo") {
            if (colorVideo == null) {
                colorVideo = new ColorVideo(fileName);
            }
            colorVideo.play();
        } else if (type == "blackAndWhiteVideo") {
            if (blackAndWhiteVideo == null) {
                blackAndWhiteVideo = new BlackAndWhiteVideo(fileName);
            }
            blackAndWhiteVideo.play();
        }

    }


}


