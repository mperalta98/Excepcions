package com.company;

public class Main {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {


        Client client = null;
        try {
            client = new Client("nom", "cognom", "dni");
        } catch (BankClientException e) {
            e.printStackTrace();
        }


        CompteEstalvi ce1 = new CompteEstalvi("cuenta1");

        try {
            ce1.treure(20);
        } catch (BankAccountException e) {
            e.printStackTrace();
        }

        ce1.addUser(client);

        try {
            ce1.removeUser("dni");
        } catch (BankAccountException e) {
            e.printStackTrace();
        }


    }
}


