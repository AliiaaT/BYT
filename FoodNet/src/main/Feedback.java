package main;

public class Feedback {
    private Restaurant restaurant;
    private String feedbackText;
    private String type;

    User user = new User();

    public Feedback(Restaurant restaurant, String feedbackText, String type) {
        this.restaurant = restaurant;
        this.feedbackText = feedbackText;
        this.type = type;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "restaurant=" + restaurant +
                ", feedbackText='" + feedbackText + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
