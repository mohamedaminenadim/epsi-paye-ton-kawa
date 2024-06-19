package com.epsi.mspr.payetonkawa.produits;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class ProduitDetails {

    @Id
    private long id;

    @Column(name="price")
    private Double price;

    @Column(name="description")
    private String description;

    @Column(name="color")
    private String color;
}
