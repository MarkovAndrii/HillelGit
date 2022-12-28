package lesson25;

import lesson25.model.Account;
import lesson25.model.Client;
import lesson25.model.Status;
import lesson25.service.AccountService;
import lesson25.service.ClientService;
import lesson25.service.StatusService;

public class Main {
    public static void main(String[] args) {

        ClientService clientService = new ClientService();
        Client client = new Client();

        //create client
//        client.setName("Eric");
//        client.setAge(42);
//        client.setEmail("ric3@gmail.com");
//        client.setPhone(56556565656L);
//        clientService.create(client);

        //update client
//        Client clientById = clientService.getById(15);
//        clientById.setName("James");
//        clientById.setAge(45);
//        clientById.setEmail("j@gmail.com");
//        clientById.setPhone(00777777777L);
//        clientService.update(clientById);

        //get client by id
//        Client clientById = clientService.getById(14);
//        System.out.println(clientById);

        //delete client
//        Client clientForDelete = clientService.getById(15);
//        clientService.delete(clientForDelete);

        StatusService statusService = new StatusService();
        Status status = new Status();

        //create status
//        status.setAlias("NEW");
//        status.setDescription("base services");
//        statusService.create(status);

        //update status
//        Status statusById = statusService.getById(7);
//        statusById.setAlias("NEW55");
//        statusById.setDescription("like+)");
//        statusService.update(statusById);

        //get status by id
//        Status statusById = statusService.getById(5);
//        System.out.println(statusById);

        //delete status
//        Status statusForDelete = statusService.getById(7);
//        statusService.delete(statusForDelete);

        AccountService accountService = new AccountService();
        Account account = new Account();

        //create account
//        account.setClientId(15);
//        account.setNumber("111645990");
//        account.setValue(570.15F);
//        accountService.create(account);

        //update account
//        Account accountById = accountService.getById(15);
//        accountById.setClientId(25);
//        accountById.setNumber("5555555555");
//        accountById.setValue(970.5F);
//        accountService.update(accountById);

        //get account by id
//        Account accountById = accountService.getById(6);
//        System.out.println(accountById);

        //delete account
//        Account accountForDelete = accountService.getById(15);
//        accountService.delete(accountForDelete);

        //get client by phone
        Client clientByPhone = clientService.getByPhone(888000L);
        System.out.println(clientByPhone);
    }
}
