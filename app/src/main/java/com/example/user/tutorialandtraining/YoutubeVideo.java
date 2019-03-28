package com.example.user.tutorialandtraining;

/**
 * Created by User on 1/16/2019.
 */

public class YoutubeVideo {
    String videourl;

    public YoutubeVideo()
    {

    }

    public YoutubeVideo(String videourl)
    {
        this.videourl=videourl;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }
}
