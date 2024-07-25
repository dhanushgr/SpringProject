package com.dhanush.springproject.model;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data /*
       * This annotation is from lombok library, it helps to reduce boiler plate code.
       * Lombok automatically generates the getters, setters, equals(), hashCode(),
       * and *toString() methods for the below fields
       */
@Entity
@Table(name = "payload")
public class load {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private UUID shipperId;

    @Column(name = "loadingPoint")
    private String loadingPoint;

    @Column(name = "unloadingPoint")
    private String unloadingPoint;

    @Column(name = "productType")
    private String productType;

    @Column(name = "truckType")
    private String truckType;

    @Column(name = "noOfTrucks")
    private int noOfTrucks;

    @Column(name = "weight")
    private int weight;

    @Column(name = "comment")
    private String comment;

    @Column(name = "date")
    private LocalDate date;

    // constructor
    public load(UUID shipperId, String loadingPoint, String unloadingPoint, String productType, String truckType,
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
