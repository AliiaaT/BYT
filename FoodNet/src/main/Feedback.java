package main;

public class Feedback {
    private Restaurant restaurant;
    private String feedbackText;
    private String type;

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
}
