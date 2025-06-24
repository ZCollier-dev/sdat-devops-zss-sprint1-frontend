package org.example.Model;

public class Passenger {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNum;

    public Passenger() {}
    
    public Passenger(Long id, String firstName, String lastName, String phoneNum) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Passenger: " + firstName + lastName + "Phone Number: " + phoneNum;
    }
}
