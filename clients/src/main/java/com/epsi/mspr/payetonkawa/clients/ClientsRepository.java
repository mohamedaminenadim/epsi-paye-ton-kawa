package com.epsi.mspr.payetonkawa.clients;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract interface ClientsRepository extends CrudRepository<ClientEntity, Integer> {
    List<ClientEntity> findAllClients();
    ClientEntity findClientByID(String id);
    ClientEntity findClientByFullName(String name, String familyName);
    ClientEntity addClient(ClientEntity clientEntity);
    ClientEntity updateClient(String id, ClientEntity clientEntity);
    ClientEntity deleteClient(String id);
}
