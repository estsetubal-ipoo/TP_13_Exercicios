package ex2;

import java.util.HashSet;
import java.util.Set;

public class App {
    private Set<Account> registeredAccounts;

    public App() {
        registeredAccounts = new HashSet<>();
    }

    public boolean removeAccount(String username) {
        // Podemos aproveitar o critério de igualdade para que o Set
        // faça automaticamente a remoção.
        Account fake = new Account(username, "", false);
        boolean success = registeredAccounts.remove(fake);
        return success;

        // Caso contrário, teríamos de descobrir a conta que possui
        // o username especificado e removê-la manualmente (código comentado).
        /*for(ex2.Account account : registeredAccounts) {
            if(account.getUsername().equalsIgnoreCase(username)) {
                registeredAccounts.remove(account);
                return true;
            }
        }

        return false;*/
    }

    /**
     * Register a new account.
     * @param account the account to register
     * @return <code>true</code> if success; <code>false</code>
     * if there already exists an account with the same username
     */
    public boolean registerAccount(Account account) {
        // A verificação de contas terem o mesmo
        // username será feita através do método
        // ex2.Account.equals(...)
        boolean success = registeredAccounts.add(account);
        return success;
    }

    public int getNumberOfRegisteredAccounts() {
        return registeredAccounts.size();
    }

    public String toString() {
        String out = String.format("App[numberAccounts=%d \n", getNumberOfRegisteredAccounts());

        for(Account account : registeredAccounts) {
            out += "\t" + account /*.toString()*/ + "\n";
        }

        out += "]";
        return out;
    }
}
