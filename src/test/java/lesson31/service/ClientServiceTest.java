package lesson31.service;

import lesson31.entity.Client;
import lesson31.exception.WrongClientException;
import lesson31.util.HibernateConfig;
import lombok.SneakyThrows;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {

    private ClientService clientService = new ClientService();

    @BeforeEach
    void setUp() {
        System.out.println("run before each test");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("run before all tests");
    }

    @AfterEach
    void tearDown() {
        System.out.println("run after each test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("run after all tests");
    }

    @SneakyThrows
    @Test
    void createWithValidClientInfoShouldPass() {
        Client client = new Client();
        client.setName("Tim5");
        client.setAge(35);
        client.setPhone(5551389995L);
        client.setEmail("test15@email.com");
        clientService.create(client);
        assertTrue(client.getId() > 0);

        Client clientFromDB = clientService.getById(client.getId());
        assertEquals(client.getEmail(), clientFromDB.getEmail());
        System.out.println("Test well done");
    }

    @Test
    void createWithLongNameShouldThrowException() {
        Client client = new Client();
        client.setName("Tim21677777777777777777");
        WrongClientException wrongClientException =
                assertThrows(WrongClientException.class, () -> clientService.create(client));

        assertEquals("client name or email is incorrect", wrongClientException.getMessage());
    }

    @Test
    void createWithIncorrectEmailShouldThrowException() {
        Client client = new Client();
        client.setName("Tim222");
        client.setEmail("test2email.com");
        WrongClientException wrongClientException =
                assertThrows(WrongClientException.class, () -> clientService.create(client));

        assertEquals("client name or email is incorrect", wrongClientException.getMessage());
    }
}