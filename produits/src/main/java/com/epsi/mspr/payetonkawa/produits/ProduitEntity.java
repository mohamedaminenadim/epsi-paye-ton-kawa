package com.epsi.mspr.payetonkawa.produits;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "produits")
@RequiredArgsConstructor
@Getter
@Setter
public class ProduitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long produitID;

    @Column(name = "name")
    private String name;

    @OneToOne
    @Column(name = "details")
    private ProduitDetails details;

    @Column(name = "creation_date", nullable=false)
    private LocalDateTime createdAt;

    @Column(name = "stock")
    private Integer stock;

}
