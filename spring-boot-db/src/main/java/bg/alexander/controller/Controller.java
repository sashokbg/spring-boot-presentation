package bg.alexander.controller;

import bg.alexander.model.Model;
import bg.alexander.model.ModelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private ModelRepository repo;

    public Controller(ModelRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/model/{id}")
    public Model getModel(@PathVariable Long id){
        return repo.findOne(id);
    }
}
