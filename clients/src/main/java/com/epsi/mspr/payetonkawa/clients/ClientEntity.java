package com.epsi.mspr.payetonkawa.clients;

//import com.epsi.mspr.payetonkawa.commandes.Commande;
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
    @Column(name = "first_name", nullable=false)
    private String firstName;
    @Column(name = "family_name", nullable=false)
    private String familyName;
    private final String fullName = String.format("%s %s", firstName, familyName);
    @Column(name = "username", nullable=false)
    private String username;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "address")
    private ClientAddress address;
    @Column(name = "creation_date", nullable=false)
    private LocalDateTime createdAt;
//    @OneToMany
//    @Column(name = "commandes", nullable=false)
//    private List<Commande> commandes;



}
