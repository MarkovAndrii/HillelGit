package lesson8.service;

import lesson8.entity.Client;
import lesson8.util.CheckParameters;

public class TransactionService {

    public static void sendMoney(Client client, String clientAccountId) {
        CheckParameters.compareClient(client.getClientAccountId(), clientAccountId);
    }
}
