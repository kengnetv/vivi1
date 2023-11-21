package cm.ktvl.reuniondriver.api;

import cm.ktvl.reuniondriver.entites.Utilisateur;
import cm.ktvl.reuniondriver.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService;
@PostMapping("/save")
    Utilisateur save (@RequestBody Utilisateur utilisateur){

        return utilisateurService.save(utilisateur);

}
}