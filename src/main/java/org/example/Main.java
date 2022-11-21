package org.example;

import ge.softgen.softlab.tutorials.exceptions.ValidatorException;
import ge.softgen.softlab.tutorials.validators.IDValidator;
import ge.softgen.softlab.tutorials.validators.ISODateValidator;
import ge.softgen.softlab.tutorials.validators.ValidatorService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        var scanner = new Scanner(System.in);
        System.out.print("ID: ");
        var id = scanner.next();
        System.out.print("BirthDate: ");
        var birthDate = scanner.next();
        try {
            ValidatorService.Validate(List.of (
                    new IDValidator(id),
                    new ISODateValidator(birthDate)));
            System.out.println(" Input is valid");
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        }

    }
}