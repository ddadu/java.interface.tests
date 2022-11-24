package ge.softgen.softlab.tutorials.validators;

import ge.softgen.softlab.tutorials.Validator;

public class GenderValidator implements Validator {
    private final String gender;

    public GenderValidator(String gender) {
        this.gender = gender;
    }


    @Override
    public boolean isValid() {
        if (gender == null) {
            return false;
        }
        return false;
    }


    @Override
    public String getErrorMessage() {
        return "Gender is not valid ";
    }
}
