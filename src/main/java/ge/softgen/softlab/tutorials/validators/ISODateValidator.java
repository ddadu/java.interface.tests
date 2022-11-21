package ge.softgen.softlab.tutorials.validators;

import ge.softgen.softlab.tutorials.Validator;

public class ISODateValidator implements Validator {
    private final String date;

    public ISODateValidator(String date) {
        this.date = date;
    }

    @Override
    public boolean isValid() {
        //1982-12-03
        if(date == null) {
            return false;
        }
        if(date.length() != 10){
            return false;
        }
        String[] segments = date.split("-");
        if(segments.length != 3){
            return false;
        }
        if(segments[0].length() != 4
                || segments[1].length() != 2
                || segments[2].length() != 2){
            return false;
        }
        try {
            Integer.parseInt(segments[0]);
            Integer.parseInt(segments[1]);
            Integer.parseInt(segments[2]);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String getErrorMessage() {
        return "Birth Date is not valid ";
    }

}

