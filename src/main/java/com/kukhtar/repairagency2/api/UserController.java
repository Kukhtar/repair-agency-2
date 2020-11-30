package com.kukhtar.repairagency2.api;

import com.kukhtar.repairagency2.model.User;
import com.kukhtar.repairagency2.repo.UserRepo;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepo userRepo;

    @GetMapping(value = "/users")
    @ApiOperation(value = "Get users")
    public List<User> getUsers (){
        return userRepo.findAll();
    }
}
