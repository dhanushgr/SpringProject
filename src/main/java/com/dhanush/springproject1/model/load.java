package com.dhanush.springproject1.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data /*
       * This annotation is from lombok package, it helps to reduce boiler plate code.
       * Lombok automatically generates the getters, setters, equals(), hashCode(),
       * and *toString() methods for the below fields
       */
@Entity
public class load {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shipperId;

    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private int weight;
    private String comment;
    private LocalDate date;

    public load(long shipperId, String loadingPoint, String unloadingPoint, String productType, String truckType,
            int noOfTrucks, int weight, String comment, LocalDate date) {
        super();
        this.shipperId = shipperId;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.date = date;
    }

    public load() {
        super();
    }

}
