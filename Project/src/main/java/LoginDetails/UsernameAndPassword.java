package LoginDetails;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class UsernameAndPassword {

    HashMap<String,String> info = new HashMap<String,String>();

    public UsernameAndPassword(){

        File readerUser = new File("Username.txt");
        File readerPassword = new File("Password.txt");
        Scanner readUser = null;
        Scanner readPass = null;
        try {
            readPass = new Scanner(readerPassword);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            readUser = new Scanner(readerUser);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(readUser.hasNextLine() && readPass.hasNextLine()){
            String usernames = readUser.nextLine();
            String passwords = readPass.nextLine();
            info.put(usernames,passwords);
        }
        readUser.close();


    }

    public HashMap getInfo(){
        return info;
    }

}
