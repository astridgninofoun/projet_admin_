package sn.esmt.admin_.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin_.dao.AppRoleRepository;
import sn.esmt.admin_.entities.AppRoleEntity;

import java.util.List;
@RestController
@RequestMapping(value = "/roles")
@AllArgsConstructor
public class AppRoleController {
    private AppRoleRepository appRoleRepository;

    //fonction qui insere dans la base de données
    @PostMapping(path = "/save")//post Request

    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }

    //fonction qui retourne la liste des Roles
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }

    @GetMapping(path = "/login")
    public AppRoleEntity login(@RequestParam int id){
        return appRoleRepository.findById(id);
    }
}
