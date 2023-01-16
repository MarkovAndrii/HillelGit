package lesson29;

import lesson29.entity.Account;
import lesson29.entity.Client;
import lesson29.entity.Status;
import lesson29.service.AccountService;
import lesson29.service.ClientService;
import lesson29.service.StatusService;
import lesson29.util.HibernateConfig;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        try {
            ClientService clientService = new ClientService();
            Client client = new Client();

            //create client
//        client.setName("Anna");
//        client.setAge(21);
//        client.setPhone(5071285785L);
//        client.setEmail("anna@gmail.com");
//        client.setAbout("new");
//        clientService.create(client);

            //update client
//        Client clientById = clientService.getById(5);
//        clientById.setName("Bred");
//        clientById.setAge(41);
//        clientById.setPhone(93137777267L);
//        clientById.setEmail("b@gmail.com");
//        clientService.update(clientById);

            //get client by id
//        Client clientById = clientService.getById(1);

            //delete client
//        Client clientForDelete = clientService.getById(5);
//        clientService.delete(clientForDelete);

            StatusService statusService = new StatusService();
            Status status = new Status();

            //create status
//        status.setAlias("VIP");
//        status.setDescription("vip services");
//        statusService.create(status);

            //update status
//        Status statusById = statusService.getById(3);
//        statusById.setAlias("NEW55");
//        statusById.setDescription("like+)");
//        statusService.update(statusById);

            //get status by id
//        Status statusById = statusService.getById(2);

            //delete status
//        Status statusForDelete = statusService.getById(3);
//        statusService.delete(statusForDelete);

            AccountService accountService = new AccountService();
            Account account = new Account();

            //create account
//            account.setClientId(10);
//            account.setNumber("455645517");
//            account.setValue(60F);
//            accountService.create(account);

            //update account
//        Account accountById = accountService.getById(34);
//        accountById.setClientId(25);
//        accountById.setNumber("5555555555");
//        accountById.setValue(990F);
//        accountService.update(accountById);

            //get account by id
//        Account accountById = accountService.getById(2);
//        System.out.println(accountById);

            //delete account
//        Account accountForDelete = accountService.getById(34);
//        accountService.delete(accountForDelete);

            //get client by phone
//        Client clientByPhone = clientService.getByPhone(5071285785L);

        }catch (Exception e){
            logger.error("main", e);
        }
    }
}
