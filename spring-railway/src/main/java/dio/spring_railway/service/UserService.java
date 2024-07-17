package dio.spring_railway.service;

import dio.spring_railway.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
