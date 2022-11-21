package ge.softgen.softlab.tutorials.validators;

import ge.softgen.softlab.tutorials.Validator;
import ge.softgen.softlab.tutorials.exceptions.ValidatorException;

import java.util.List;

public class ValidatorService {
    public static void Validate(List<Validator> validators) throws ValidatorException {
        for (Validator validator : validators) {
            if(!validator.isValid()) {
                throw new ValidatorException(validator.getErrorMessage());
            }
        }

    }
}
