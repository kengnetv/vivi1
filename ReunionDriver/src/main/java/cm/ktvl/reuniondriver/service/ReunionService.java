package cm.ktvl.reuniondriver.service;

import cm.ktvl.reuniondriver.dto.ReunionDto;
import cm.ktvl.reuniondriver.entites.Reunion;

public interface ReunionService {
    ReunionDto save(ReunionDto reunion);// modifier les methodes dans ReunionService pour retourner des DTO
    ReunionDto findById(Long id);
    void deleteAll();


    // ajouter la methode ConvertEntitytoDto a l'interface service
    ReunionDto converEntitytoDto(Reunion reunion);

    Reunion converDtotoEntity(ReunionDto  reunionDto);
}
