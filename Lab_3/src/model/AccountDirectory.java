/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import java.util.Date;

import java.util.ArrayList;


/**
 *
 * @author kaush
 */
public class AccountDirectory {
    private ArrayList<Account> accountlist;

    public AccountDirectory() {
        //ArrayList<Account>accountlist;
        
        this.accountlist = new ArrayList<Account>();
        
    }
    
    public ArrayList<Account> getAccountlist() {
        return accountlist;
    }

    public void setAccountlist(ArrayList<Account> accountlist) {
        this.accountlist = accountlist;
    }
    
    public Account addAccount()
    {
        Account account = new Account();
        accountlist.add(account);
        return account;
        
    }
    
    public void deleteAccount(Account account)
    {
        accountlist.remove(account);
        
    }
    
    public Account searchAccount(String accountNumber){
        
        for(Account account: accountlist)
        {
            if(account.getAccountNumber().equals(accountNumber))
            {
                return account;
            }
        }
        return null;
        
        
    }
    
    
    
        
}
