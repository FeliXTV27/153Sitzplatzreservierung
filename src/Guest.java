public class Guest {
    private String firstName;
    private String surName;
    private String street;
    private String plzTown;
    private String bdate;
    private String tel;
    private String telMobile;
    private String email;

    public Guest(int id, String firstName, String surName, String street, String plzTown, String bdate, String tel, String telMobile, String email) {
    }

    public Guest() {

    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlzTown() {
        return plzTown;
    }

    public void setPlzTown(String plzTown) {
        this.plzTown = plzTown;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTelMobile() {
        return telMobile;
    }

    public void setTelMobile(String telMobile) {
        this.telMobile = telMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
