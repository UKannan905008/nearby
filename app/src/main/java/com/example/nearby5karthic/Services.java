package com.example.nearby5karthic;

public class Services {
    private String servicedetails;
    private int image;

    public Services(String servicedetails, int image) {
        this.servicedetails = servicedetails;
        this.image = image;
    }

    public String getServicedetails() {

        return servicedetails;
    }

    public void setServicedetails(String servicedetails) {

        this.servicedetails = servicedetails;
    }

    public int getImage() {

        return image;
    }

    public void setImage(int image) {

        this.image = image;
    }
}
