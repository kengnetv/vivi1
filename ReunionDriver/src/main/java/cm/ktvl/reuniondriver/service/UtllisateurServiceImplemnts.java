package cm.ktvl.reuniondriver.service;

import cm.ktvl.reuniondriver.entites.Utilisateur;
import cm.ktvl.reuniondriver.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtllisateurServiceImplemnts implements UtilisateurService{
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }
}
