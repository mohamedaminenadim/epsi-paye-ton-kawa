package com.epsi.mspr.payetonkawa.produits;

import lombok.Data;

@Data
public class ProduitEntity {
    private static final long uid = 0L;
    private String name;
    private double unitaryPrice;
    private int quantity;
    private ProduitType type;
}
