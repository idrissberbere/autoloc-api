package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {

    private IClientService clientService;

    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        return clientService.FindAll();
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientService.AddClient(client);
    }

    @PutMapping("/modify-client")
    public Client updateClient(@RequestBody Client client) {
        return clientService.UpdateClient(client);
    }

    @DeleteMapping("/remove-client/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}