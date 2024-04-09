package ToStringEqualsHashcode;

public enum CreditCards {
    CREDIT_CARDS_VISA("Classic","Ivan Ivanov"),
    CREDIT_CARDS_MASTERCARD("Gold","Petr Petrov");

    private String title;
    private String nameoncard;
    CreditCards(String title, String nameoncard) {
        this.title = title;
        this.nameoncard = nameoncard;
    }
    public String getTitle() {
        return title;
    }
    public String getNameoncard() {
        return nameoncard;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setNameoncard(String nameoncard) {
        this.nameoncard = nameoncard;
    }
}
