package com.epsi.mspr.payetonkawa.clients;

import com.epsi.mspr.payetonkawa.commandes.Commande;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "clients")
@RequiredArgsConstructor
@Getter
@Setter
public class ClientEntity {
    private static final long uid = 0L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long clientID;
    private String firstName;
    private String familyName;
    private final String name = String.format("%s %s", firstName, familyName);
    private String username;
    @OneToOne
    private ClientAddress address;
    private LocalDateTime createdAt;
    @OneToMany
    private List<Commande> commandes;



}
