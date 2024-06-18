package com.epsi.mspr.payetonkawa.commandes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CommandeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long commandeID;
}
