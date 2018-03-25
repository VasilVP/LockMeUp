package com.project.Terminal;

import com.project.Email.Email;
import com.project.password.PasswordGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import java.io.File;

@Component
public class Terminal implements CommandLineRunner {



    @Override
    public void run(String... strings) throws Exception {
        /*PasswordGenerator pass = new PasswordGenerator();
        for (int i = 0; i < 10; i++) {

            String password = pass.passwordGenerator();
            System.out.println(password);
        }
*/

        //String projectPath = System.getProperty("user.dir");
        //String htmlPath = "\\src\\main\\java\\com\\project\\views\\index.html";


        //String launchPath = projectPath + htmlPath;
        //Email.sendEmailTo("trollaway111@gmail.com", "subject", "text");

        Runtime rTime = Runtime.getRuntime();
        String url = "F:\\HACKATON\\LockMeUp\\src\\main\\java\\com\\project\\views\\index.html";

        String browser = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe ";
        Process pc = rTime.exec(browser + url);
        pc.waitFor();


    }
}
