package ba.terawatt.etsmostar;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Emir on 28.8.2017.
 */
public class ParcelableForGalleryItems implements Parcelable {
    private String ID;
    private String imageURL;
    private String name;
    private String urlForShare;
    public ParcelableForGalleryItems(Parcel parcel){
        this.ID = parcel.readString();
        this.imageURL = parcel.readString();
        this.name = parcel.readString();
        this.urlForShare = parcel.readString();
    }
    public ParcelableForGalleryItems(String ID, String imageURL, String name, String URLForShare){
        this.ID = ID;
        this.imageURL = imageURL;
        this.name = name;
        this.urlForShare = URLForShare;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(ID);
            parcel.writeString(imageURL);
            parcel.writeString(name);
            parcel.writeString(urlForShare);

    }


    public static Creator<ParcelableForGalleryItems> getCREATOR() {
        return CREATOR;
    }

    public static final Parcelable.Creator<ParcelableForGalleryItems> CREATOR = new Parcelable.Creator<ParcelableForGalleryItems>(){
        @Override
        public ParcelableForGalleryItems createFromParcel(Parcel parcel) {
            return new ParcelableForGalleryItems(parcel);
        }

        @Override
        public ParcelableForGalleryItems[] newArray(int i) {
            return new ParcelableForGalleryItems[i];
        }
    };



    public String getImageURL(){return imageURL;}
    public String getID(){return ID;}
    public String getName(){return name;}
    public String getURLForShare(){return  urlForShare;}
}
