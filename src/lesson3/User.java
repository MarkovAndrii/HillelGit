package lesson3;

import java.util.Objects;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String gender;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public User(String name, String surname, String email, String password, String gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public User(String name, String surname, String email, String password, String gender, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;   //проверка ссилок сравниваемих обьектов
        if (obj == null || getClass() != obj.getClass())
            return false;  //проверка - что обьект не нулевой/принадлежность к одному классу
        User user = (User) obj;
        return name.equals(user.name) && surname.equals(user.surname)
                && email.equals(user.email) && password.equals(user.password)
                && gender.equals(user.gender) && country.equals(user.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, password, gender, country);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void read(String text) { // Принимает текст, ничего не возвращает, выводит сообщение принятое в консоль
        System.out.println(text);
    }

    public void write() {      //Ничего не принимает, просто считывает текст с клавиатуры и выводит его в консоль как результат
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        read(line);
    }
}