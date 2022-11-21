package ge.softgen.softlab.tutorials.validators;

import static org.junit.jupiter.api.Assertions.*;

class ISODateValidatorTest {

    @org.junit.jupiter.api.Test
    void isValid_is_null() {
        var validator = new ISODateValidator(null);
        assertFalse(validator.isValid());
    }
    @org.junit.jupiter.api.Test
     void isValid_is_empty() {
        var validator = new ISODateValidator("");
        assertFalse(validator.isValid());
    }
    @org.junit.jupiter.api.Test
    void isValid_is_invalid_separator() {
        var validator = new ISODateValidator("1382.12.03");
        assertFalse(validator.isValid());
    }
    @org.junit.jupiter.api.Test
    void isValid_is_invalid_length() {
        var validator = new ISODateValidator("1382-2-3");
        assertFalse(validator.isValid());
    }

    @org.junit.jupiter.api.Test
    void isValid_has_letters() {
        var validator = new ISODateValidator("dddd-ff-gg");
        assertFalse(validator.isValid());
    }
}