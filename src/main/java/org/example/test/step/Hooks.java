package org.example.test.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@NetBanking")
    public void netBankingSetup(){
        System.out.println("********************");
        System.out.println("Setup the entries in the NetBanking DB");
    }

    @Before("@Mortgage")
    public void mortgageSetup(){
        System.out.println("Setup the entries in the Mortgage DB");
    }

    @After
    public void tearDown(){
        System.out.println("Clear the entries");
    }
}
