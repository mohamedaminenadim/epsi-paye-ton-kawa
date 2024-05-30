package com.epsi.mspr.payetonkawa.clients;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/customers")
public class ClientsController {

    public ClientsService clientsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ClientEntity> getAllClients() {
        return clientsService.getAllClients();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ClientEntity getClient(@PathVariable String id) {
        return clientsService.getClientByID(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ClientEntity getClient(@RequestBody ClientEntity clientEntity) {
        return clientsService.postClient(clientEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ClientEntity getClient(@PathVariable String id, @RequestBody ClientEntity clientEntity) {
        return clientsService.patchClient(id, clientEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ClientEntity deleteClient(@PathVariable String id) {
        return clientsService.deleteClient(id);
    }


}
