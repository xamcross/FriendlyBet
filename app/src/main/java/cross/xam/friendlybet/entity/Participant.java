package cross.xam.friendlybet.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmytro_korniienko on 3/11/16.
 */
public class Participant {

    private Long id;

    private String firstName;

    private String lastName;

    private String login;

    private String password;

    private Account account;

    private List<Bet> bets = new ArrayList<>();

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void placeBet(Bet newBet){
        if (newBet != null) {
            bets.add(newBet);
            System.out.println("Bet \"" + newBet.getTitle() + "\" successfully placed");
        }
    }
}