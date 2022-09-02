package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordValidatorTest {
    @Test
    public void whenPasswordIsNull() throws IllegalArgumentException {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate(null);
                });
        assertThat(exception.getMessage()).isEqualTo("Password is null.");
    }

    @Test
    public void whenLengthIsIncorrect() {
        InvalidPasswordException exception = assertThrows(
                InvalidPasswordException.class,
                () -> {
                    PasswordValidator.validate("sdsdasasaasdadadads");
                });
        assertThat(exception.getMessage()).isEqualTo(
                "The password length cannot be less than 8 or more than 32 characters.");
    }

    @Test
    public void whenUpperCaseIsMissing() {
        InvalidPasswordException exception = assertThrows(
                InvalidPasswordException.class,
                () -> {
                    PasswordValidator.validate("sdsdasasaasdadadads");
                });
        assertThat(exception.getMessage()).isEqualTo(
                "The password must contain uppercase character.");
    }

    @Test
    public void whenPasswordCorrect() throws InvalidPasswordException {
        String expected = "Pswr12+qw";
        String result = PasswordValidator.validate("Pswr12+qw");
        assertThat(result).isEqualTo(expected);
    }

}