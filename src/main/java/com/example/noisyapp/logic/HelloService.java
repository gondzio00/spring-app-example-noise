package com.example.noisyapp.logic;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hi(){
        return new String("HI!");
    }

}
