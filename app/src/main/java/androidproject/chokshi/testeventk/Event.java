package androidproject.chokshi.testeventk;


import java.util.Date;

public class Event {
    private String title;
    private Date eventDate;
    private String imgUrl;
    private double latitude;
    private double longitude;

    public Event(String title, Date eventDate, String imgUrl, double latitude,  double longitude) {
        this.title = title;
        this.eventDate = eventDate;
        this.imgUrl = imgUrl;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
