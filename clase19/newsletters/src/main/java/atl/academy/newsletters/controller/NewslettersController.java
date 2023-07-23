package atl.academy.newsletters.controller;

import atl.academy.newsletters.models.Cliente;
import atl.academy.newsletters.repository.EmailRepository;
import atl.academy.newsletters.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewslettersController {

    @Autowired
    private EmailRepository repositorioDeEmails;
    @PostMapping("/api/newsletters")
    public String registrar(@RequestBody Cliente cliente){

        String email = cliente.getEmail();

        EmailValidator emailValidator = new EmailValidator();
        if (emailValidator.esValido(email)){

            repositorioDeEmails.guardarEmail(email);
            return "todo ok";
            }
        return "El mail ingresado no es valido";
    }

    @PostMapping ("/api/newsletters/unsuscribe")
    public String eliminar(@RequestBody Cliente cliente){

        String email = cliente.getEmail();
        repositorioDeEmails.eliminarEmail(email);
        return "todo ok";
    }

}

