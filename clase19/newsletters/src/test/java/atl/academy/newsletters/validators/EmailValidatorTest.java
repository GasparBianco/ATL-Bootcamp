package atl.academy.newsletters.validators;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmailValidatorTest {

    @Test
    public void elEmailTieneQueTenerArroba(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.contieneArroba("asas");
        assertFalse(resultado);

    }
    @Test
    public void elEmailNoTieneQueTenerEspacio(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.contieneEspacio("a sas");
        assertFalse(resultado);

    }

    @Test
    public void elEmailTieneQueTenerPunto(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.contienePunto("asdasfd");
        assertFalse(resultado);
    }

}


