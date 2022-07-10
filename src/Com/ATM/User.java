package Com.ATM;

import java.util.ArrayList;

public class User {
    /**
     *Usrs first Name and last Name
     */
    private String firstName;
    private String lastName;
    /**
     * Users Universal unique id
     */
    private String uuid;
    /**
     * pin for account stored using hash
     */
    private byte pinHash;
    private ArrayList <Account> accounts;



}
