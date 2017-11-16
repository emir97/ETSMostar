package ba.terawatt.etsmostar.CustomItems;

/**
 * Created by Emir on 27.7.2017.
 */
public class EventItem {
    private String ID;
    private String heading;
    private String dateStart, location;
    private String author;
    private String uploadDate;
    private String imageURL;

    public EventItem(String ID, String heading, String dateStart, String location, String author, String uploadDate, String imageURL) {
        this.ID = ID;
        this.heading = heading;
        this.dateStart = dateStart;
        this.location = location;
        this.author = author;
        this.uploadDate = uploadDate;
        this.imageURL = imageURL;
    }

    public String getID() {
        return ID;
    }

    public String getHeading() {
        return heading;
    }

    public String getDateStart() {
        return dateStart;
    }

    public String getlocation() {
        return location;
    }

    public String getAuthor() {
        return author;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
