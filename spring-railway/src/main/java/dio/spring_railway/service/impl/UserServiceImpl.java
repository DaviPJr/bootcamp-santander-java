package dio.spring_railway.service.impl;

import dio.spring_railway.domain.model.User;
import dio.spring_railway.domain.repository.UserRepository;
import dio.spring_railway.service.UserService;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
