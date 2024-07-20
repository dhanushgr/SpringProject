package com.dhanush.springproject1.model;

import java.text.SimpleDateFormat;


public class load {

    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private int weight;
    private long shipperId;
    private SimpleDateFormat Date;

    /**
     * 
     */
    public load() {

    }


    public load (String loadingPoint, String unloadingpoint, String productType, String truckType, String noOfTrucks, int weight, int shipperID, SimpleDateFormat Date ){
        this.loadingPoint = "delhi";
        this.unloadingPoint = "jaipur";
        this.productType = "chemicals";
        this.truckType = "canter";
        this.noOfTrucks = 1;
        this.weight = 100;
        this.shipperId = 01;
        //this.Date = 09-09-2024; 
    }


    public String getLoadingPoint() {
        return loadingPoint;
    }


    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }


    public String getUnloadingPoint() {
        return unloadingPoint;
    }


    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }


    public String getProductType() {
        return productType;
    }


    public void setProductType(String productType) {
        this.productType = productType;
    }


    public String getTruckType() {
        return truckType;
    }


    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }


    public int getNoOfTrucks() {
        return noOfTrucks;
    }


    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public long getShipperId() {
        return shipperId;
    }


    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }


    public SimpleDateFormat getDate() {
        return Date;
    }


    public void setDate(SimpleDateFormat date) {
        Date = date;
    }

    /* 

    @Override
    public String toString() {
        
    }

    */
    


}
