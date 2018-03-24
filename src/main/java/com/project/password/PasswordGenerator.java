package com.project.password;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {

    public PasswordGenerator() {}

    public String passwordGenerator(){
        Random random = new Random();

        String[] letters = {"A", "B","C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] digits ={"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            int letterIndex = random.nextInt(letters.length );
            int digitIndex = random.nextInt(digits.length );

            String letter = letters[letterIndex];
            String digit = digits[digitIndex];
            if(i % 10 == 0){

                sb.append(letter.toLowerCase());
            }
            sb.append(letter);
            sb.append(digit);
        }

        return sb.toString();
    }
}
