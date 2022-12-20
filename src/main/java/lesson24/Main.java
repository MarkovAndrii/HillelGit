package lesson24;

import lesson24.entity.Account;
import lesson24.entity.Client;
import lesson24.entity.Status;
import lesson24.service.AccountService;
import lesson24.service.ClientService;
import lesson24.service.StatusService;
import lesson24.util.Database;

import java.sql.Connection;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Test CRUD for Client
        ClientService clientService = new ClientService();

//        List<Client> clients = clientService.getAll();
//        clients.forEach(System.out::println);

//        Client client = new Client("Molly","molly@gmail.com", 13577753498L, "next client");
//        clientService.create(client);

//        Client updateCLient = new Client("Molly)", "molly@mail.com", 13577753555L, "change data");
//        clientService.update(updateCLient, "molly@gmail.com");

//        clientService.delete(12);

        //Test CRUD for Status
        StatusService statusService = new StatusService();

//        List<Status> statuses = statusService.getAll();
//        statuses.forEach(System.out::println);

//        Status status = new Status("NEW", "full check");
//        statusService.create(status);

//        Status updateStatus = new Status("NEW++", "everything is good");
//        statusService.update(updateStatus,"NEW");

//        statusService.delete(4);

        //Test CRUD for Account
        AccountService accountService = new AccountService();

//        List<Account> accounts = accountService.getAll();
//        accounts.forEach(System.out::println);

//        Account account = new Account(15,"1233333", 55.55F);
//        accountService.create(account);

//        Account updateAccount = new Account(25, "777", 99.0F);
//        accountService.update(updateAccount, "1233333");

//        accountService.delete("1233333");

        // Task4. Добавить метод для поиска Client по номеру телефона в соответствующий сервис;
//        clientService.getByPhone(13577753555L);

        // Task5. Добавить метод для получения number из Account, где value > переданного значения;
//        accountService.getByNumber(1000);

        // Task6. Добавить метод для получения всех Clients где id клиент = client_id таблицы сущности Accounts;
//        List<Client> clientList = clientService.getByIdAccount();
//        clientList.forEach(System.out::println);

        // Task7. Добавить метод для получения значений clients.name, clients.email, statuses.alias
        // из таблицы клиентов(Clients) и из таблицы статусов(Statuses) используя join 3х таблиц
        // и где возраст пользователей старше 18 лет. (Если возраста нет, надо что-то сделать чтобы был)
        clientService.getByNameMailAlias(); // Before the task - added a column AGE to the table CLIENTS
    }
}
