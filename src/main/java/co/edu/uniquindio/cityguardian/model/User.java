package co.edu.uniquindio.cityguardian.model;

public class User {
     //var
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String password;
    private Boolean active;
    private UserRol role;

    //builder

    public User(String id, String name, String lastName, String email, String phone, String address, String city, String password, Boolean active, UserRol role) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.password = password;
        this.active = active;
        this.role = role;
    }
    //empty builder
    public User(){}

    //methods

    public static void register(){
    }

    public static void login(){
    }

    public static void editProfile(){
    }

    public static void deleteAccount(){
    }

    public static void recoveryPassword(){
    }

    public static void changePassword(String newPassword){
    }

    //getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public UserRol getRole() {
        return role;
    }

    public void setRole(UserRol role) {
        this.role = role;
    }
}
