package ex2;

import java.util.Objects;

public class Account {
    private final String username;
    private final String name;
    private final boolean isPayedAccount;

    public Account(String username, String name, boolean isPayedAccount) {
        this.username = username;
        this.name = name;
        this.isPayedAccount = isPayedAccount;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public boolean isPayedAccount() {
        return isPayedAccount;
    }

    public String toString() {
        return String.format("Account[username=%s, name=%s, payed=%s]",
                username, name, (isPayedAccount ? "Yes" : "No") );
    }

    public boolean equals(Object o) {
        if(this == o) return true; //é o mesmo objeto?!
        if(o == null || this.getClass() != o.getClass()) return false; //tipos diferentes?

        // são iguais se tiverem o mesmo username; caso contrário, não.
        Account other = (Account) o;
        return this.username.equalsIgnoreCase(other.username);
    }

    public int hashCode() {
        return Objects.hashCode(this.username);
    }
}
