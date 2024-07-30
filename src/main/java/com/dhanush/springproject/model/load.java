package com.dhanush.springproject.model;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

      /* @Data : could be used (for reference)
       * This annotation is from lombok library, it helps to "reduce boiler plate code".
       * Lombok automatically generates the getters, setters, equals(), hashCode(),
       * and toString() methods for the below fields
       */

@Entity
@Table(name = "payload")
public class load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "loadingPoint", nullable = false)
    private String loadingPoint;

    @Column(name = "unloadingPoint", nullable = false)
    private String unloadingPoint;

    @Column(name = "productType", nullable = false)
    private String productType;

    @Column(name = "truckType", nullable = false)
    private String truckType;

    @Column(name = "noOfTrucks", nullable = false)
    private int noOfTrucks;

    @Column(name = "weight", nullable = false)
    private int weight;

    @JdbcTypeCode(SqlTypes.VARCHAR)
    @Column(columnDefinition="VARCHAR", name = "comment")
    private Optional<String> comment;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    @Column(name = "shipperId")
    private UUID shipperId;


    public load() {
        super();
    }

    
    //Constructor
    public load(Long id, String loadingPoint, String unloadingPoint, String productType, String truckType,
            int noOfTrucks, int weight, Optional<String> comment, LocalDate date, UUID shipperId) {
        this.id = id;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.date = date;
        this.shipperId = shipperId;
    }


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public Optional<String> getComment() {
        return comment;
    }

    public void setComment(Optional<String> comment) {
        this.comment = comment;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public UUID getShipperId() {
        return shipperId;
    }

    public void setShipperId(UUID shipperId) {
        this.shipperId = shipperId;
    }

    //toString() method
    @Override
    public String toString() {
        return "load [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
                + ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
                + ", weight=" + weight + ", comment=" + comment + ", date=" + date + ", shipperId=" + shipperId + "]";
    }  

}