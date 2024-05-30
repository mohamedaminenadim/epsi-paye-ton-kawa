package com.epsi.mspr.payetonkawa.clients;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService {
    public ClientsRepository repository;

    public List<ClientEntity> getAllClients() {
        return repository.findAllClients();
    }

    public ClientEntity getClientByID(String id) {
        return repository.findClientByID(id);
    }

    public ClientEntity getClientByFullName(String name, String familyName) {
        return repository.findClientByFullName(name, familyName);
    }
    public ClientEntity postClient(ClientEntity clientEntity) {
        return repository.addClient(clientEntity);
    }
    public ClientEntity patchClient(String id, ClientEntity clientEntity) {
        return repository.updateClient(id, clientEntity);
    }
    public ClientEntity deleteClient(String id) {
        return repository.deleteClient(id);
    }
}
