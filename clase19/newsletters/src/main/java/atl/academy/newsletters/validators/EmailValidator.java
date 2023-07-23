package atl.academy.newsletters.validators;

public class EmailValidator {

    public boolean esValido(String email){
        if (contieneArroba(email) && contieneEspacio(email) && contienePunto(email)){
            return true;
        }
        return false;
    }
    public boolean contieneArroba(String email) {

        if (!email.contains("@")) {
            return false;
        }
        return true;
    }
    public boolean contieneEspacio(String email){
        if (email.contains(" ")){
            return false;
        }
        return true;
    }

    public boolean contienePunto(String email){
        if (!email.contains(".")){
            return false;
        }
        return true;
    }
}
