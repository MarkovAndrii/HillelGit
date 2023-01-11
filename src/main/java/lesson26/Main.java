package lesson26;

import lesson26.entity.Client;
import lesson26.entity.House;
import lesson26.entity.Passport;
import lesson26.entity.Role;
import lesson26.service.ClientService;
import lesson26.service.RoleService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // One-To-One
        ClientService clientService = new ClientService();

        Client client = new Client();
        client.setName("Tom");
        client.setEmail("tom@mail.com");
        client.setPhone(555251655522L);
        client.setAge(37);

        Passport passport = new Passport();
        passport.setNumber("GR248777");
        passport.setClient(client);
        client.setPassport(passport);

        // One-To-Many
        House house = new House();
        house.setAddress("Lviv");


        // Many-To-Many
        RoleService roleService = new RoleService();

        HashSet<Role> roles = new HashSet<>();
        Role role = new Role(1, "MANAGER");
        roles.add(role);

        client.setRoles(roles);

        roleService.save(role);
        clientService.save(client, house);
    }
}
