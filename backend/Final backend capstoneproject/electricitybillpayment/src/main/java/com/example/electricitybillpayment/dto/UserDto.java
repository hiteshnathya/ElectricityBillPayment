package com.example.electricitybillpayment.dto;

public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String meterNumber;
    private String boardState;
    private String city;

    public UserDto() {}

    public UserDto(Long id, String firstName, String lastName, String email, String password, String meterNumber, String boardState, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.meterNumber = meterNumber;
        this.boardState = boardState;
        this.city = city;
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

    public String getMeterNumber() { 
        return meterNumber; 
    }

    public void setMeterNumber(String meterNumber) { 
        this.meterNumber = meterNumber; 
    }

    public String getBoardState() { 
        return boardState; 
    }

    public void setBoardState(String boardState) { 
        this.boardState = boardState; 
    }

    public String getCity() { 
        return city; 
    }

    public void setCity(String city) { 
        this.city = city; 
    }
}