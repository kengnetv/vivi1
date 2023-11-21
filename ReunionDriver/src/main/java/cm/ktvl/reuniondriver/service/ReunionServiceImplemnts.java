package cm.ktvl.reuniondriver.service;

import cm.ktvl.reuniondriver.dto.ReunionDto;
import cm.ktvl.reuniondriver.entites.Reunion;
import cm.ktvl.reuniondriver.repository.ReunionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReunionServiceImplemnts implements ReunionService{
    @Autowired
    ReunionRepository reunionRepository;
    @Override
    public ReunionDto save(ReunionDto reunionDto) {
        return converEntitytoDto(reunionRepository.save(converDtotoEntity(reunionDto)) );

    }

    @Override
    public ReunionDto findById(Long id) {
        return converEntitytoDto(reunionRepository.findById(id).get());
    }

    @Override
    public void deleteAll() {
         reunionRepository.deleteAll();

    }

    @Override
    public ReunionDto converEntitytoDto(Reunion reunion) {

        return ReunionDto.builder()
                .date(reunion.getDate())
                .logo(reunion.getLogo())
                .nom(reunion.getNom())
                .lieu(reunion.getLieu())
                .build();
    }

    @Override
    public Reunion converDtotoEntity(ReunionDto reunionDto) {
        return Reunion.builder()
                .date(reunionDto.getDate())
                .logo(reunionDto.getLogo())
                .nom(reunionDto.getNom())
                .lieu(reunionDto.getLieu())
                .build();
    }
}
