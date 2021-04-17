package com.example.demo1.utils;

public class Csrf {

        public  String generate(int size)
        {
            StringBuilder token = new StringBuilder();
            for (int i = 0; i < size; i++) {
                int random = (int)(Math.random() * 10000) % 127;
                while (random < 40) {
                    random += 40;
                }
                token.append(Character.toString((char) random));
            }
            return token.toString();
        }
    }


