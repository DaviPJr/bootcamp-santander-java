package dio.projeto_springWeb.controller;

import dio.projeto_springWeb.model.Usuario;
import dio.projeto_springWeb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getUser(@PathVariable("username") String username){
        return userRepository.findByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        userRepository.save(usuario);
    }
    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        userRepository.save(usuario);
    }
}
