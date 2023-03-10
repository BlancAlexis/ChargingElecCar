package fr.ablanc.chargingPoint.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fields {

    @SerializedName("coordinates")
    @Expose
    private List<Double> coordinates;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("host_id")
    @Expose
    private Integer hostId;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("minimum_nights")
    @Expose
    private Integer minimumNights;
    @SerializedName("availability_365")
    @Expose
    private Integer availability365;
    @SerializedName("last_review")
    @Expose
    private String lastReview;
    @SerializedName("room_type")
    @Expose
    private String roomType;
    @SerializedName("number_of_reviews")
    @Expose
    private Integer numberOfReviews;
    @SerializedName("neighbourhood")
    @Expose
    private String neighbourhood;
    @SerializedName("column_20")
    @Expose
    private String column20;
    @SerializedName("column_19")
    @Expose
    private String column19;
    @SerializedName("column_10")
    @Expose
    private Integer column10;
    @SerializedName("calculated_host_listings_count")
    @Expose
    private Integer calculatedHostListingsCount;
    @SerializedName("updated_date")
    @Expose
    private String updatedDate;
    @SerializedName("reviews_per_month")
    @Expose
    private Double reviewsPerMonth;
    @SerializedName("name")
    @Expose
    private String name;

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getMinimumNights() {
        return minimumNights;
    }

    public void setMinimumNights(Integer minimumNights) {
        this.minimumNights = minimumNights;
    }

    public Integer getAvailability365() {
        return availability365;
    }

    public void setAvailability365(Integer availability365) {
        this.availability365 = availability365;
    }

    public String getLastReview() {
        return lastReview;
    }

    public void setLastReview(String lastReview) {
        this.lastReview = lastReview;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getColumn20() {
        return column20;
    }

    public void setColumn20(String column20) {
        this.column20 = column20;
    }

    public String getColumn19() {
        return column19;
    }

    public void setColumn19(String column19) {
        this.column19 = column19;
    }

    public Integer getColumn10() {
        return column10;
    }

    public void setColumn10(Integer column10) {
        this.column10 = column10;
    }

    public Integer getCalculatedHostListingsCount() {
        return calculatedHostListingsCount;
    }

    public void setCalculatedHostListingsCount(Integer calculatedHostListingsCount) {
        this.calculatedHostListingsCount = calculatedHostListingsCount;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Double getReviewsPerMonth() {
        return reviewsPerMonth;
    }

    public void setReviewsPerMonth(Double reviewsPerMonth) {
        this.reviewsPerMonth = reviewsPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fields.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coordinates");
        sb.append('=');
        sb.append(((this.coordinates == null) ? "<null>" : this.coordinates));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("hostId");
        sb.append('=');
        sb.append(((this.hostId == null) ? "<null>" : this.hostId));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null) ? "<null>" : this.city));
        sb.append(',');
        sb.append("minimumNights");
        sb.append('=');
        sb.append(((this.minimumNights == null) ? "<null>" : this.minimumNights));
        sb.append(',');
        sb.append("availability365");
        sb.append('=');
        sb.append(((this.availability365 == null) ? "<null>" : this.availability365));
        sb.append(',');
        sb.append("lastReview");
        sb.append('=');
        sb.append(((this.lastReview == null) ? "<null>" : this.lastReview));
        sb.append(',');
        sb.append("roomType");
        sb.append('=');
        sb.append(((this.roomType == null) ? "<null>" : this.roomType));
        sb.append(',');
        sb.append("numberOfReviews");
        sb.append('=');
        sb.append(((this.numberOfReviews == null) ? "<null>" : this.numberOfReviews));
        sb.append(',');
        sb.append("neighbourhood");
        sb.append('=');
        sb.append(((this.neighbourhood == null) ? "<null>" : this.neighbourhood));
        sb.append(',');
        sb.append("column20");
        sb.append('=');
        sb.append(((this.column20 == null) ? "<null>" : this.column20));
        sb.append(',');
        sb.append("column19");
        sb.append('=');
        sb.append(((this.column19 == null) ? "<null>" : this.column19));
        sb.append(',');
        sb.append("column10");
        sb.append('=');
        sb.append(((this.column10 == null) ? "<null>" : this.column10));
        sb.append(',');
        sb.append("calculatedHostListingsCount");
        sb.append('=');
        sb.append(((this.calculatedHostListingsCount == null) ? "<null>" : this.calculatedHostListingsCount));
        sb.append(',');
        sb.append("updatedDate");
        sb.append('=');
        sb.append(((this.updatedDate == null) ? "<null>" : this.updatedDate));
        sb.append(',');
        sb.append("reviewsPerMonth");
        sb.append('=');
        sb.append(((this.reviewsPerMonth == null) ? "<null>" : this.reviewsPerMonth));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}