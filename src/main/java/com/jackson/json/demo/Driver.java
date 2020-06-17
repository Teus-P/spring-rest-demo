package com.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args){

        try{
            ObjectMapper mapper = new ObjectMapper();
            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println("First name: " + student.getFirstName());
            System.out.println("Last name: " + student.getLastName());

            System.out.println("Street: " + student.getAddress().getStreet());
            System.out.println("City: " + student.getAddress().getCity());

            for (String lang: student.getLanguages()){
                System.out.println(lang);
            }

        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
