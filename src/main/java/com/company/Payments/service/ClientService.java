package com.company.Payments.service;

import com.company.Payments.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    Client getById(Long id);
    Client save(Client client);
}
