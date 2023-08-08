package model.entity;

public class User {
    private long id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String fin;
    private String phoneNumb;
    private Card card;

    public User(long id, String name, String surname, String username, String password, String fin, String phoneNumb, Card card) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.fin = fin;
        this.phoneNumb = phoneNumb;
        this.card = card;
    }

    public User() {
    }

    public User(Card card) {
        this.card = card;
    }

    public long getId() {
        return id;
    }



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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fin='" + fin + '\'' +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", card=" + card +
                '}';
    }
}
