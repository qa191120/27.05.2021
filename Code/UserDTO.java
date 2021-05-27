package com.example.demo;

public class UserDTO {

    public UserDTO() {
    }
    public int id;
    public String name;
    public String username;
    public String email;
    public AddressDTO address;

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
