package cm.ktvl.reuniondriver.api;

import cm.ktvl.reuniondriver.dto.ReunionDto;
import cm.ktvl.reuniondriver.service.ReunionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Reunion")

public class ReunionController {
    @Autowired
    ReunionService reunionService;
    @PostMapping("/save")
    ReunionDto save(@RequestBody ReunionDto reunionDto){
        return  reunionService.save(reunionDto);
    }

    @GetMapping("/findById")
    ReunionDto findById(@PathVariable Long id) {
        return reunionService.findById(id);
    }
    @DeleteMapping("/deleteAll")
    void deleteAll(){
        reunionService.deleteAll();
    }
}
