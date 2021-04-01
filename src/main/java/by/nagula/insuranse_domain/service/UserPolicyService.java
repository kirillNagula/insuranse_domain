package by.nagula.insuranse_domain.service;

import by.nagula.insuranse_domain.dto.UserPolicyDto;
import by.nagula.insuranse_domain.entity.Policy;
import by.nagula.insuranse_domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserPolicyService {
    @Autowired
    private UserService userService;

    public void save(UserPolicyDto dto){
        if (userService.getUser(dto.getFirstName(), dto.getLastName()) != null){
            User user = userService.getUser(dto.getFirstName(), dto.getLastName());
            List<Policy> personalPolicy = user.getPersonalPolicy();
            personalPolicy.add(new Policy(dto.getTypeOfProperty(),dto.getInsuranceType()));
            userService.save(user);

        } else {
            User user = new User();
            user.setLastName(dto.getLastName());
            user.setFirstName(dto.getFirstName());
            List<Policy> policyList = new ArrayList<>();
            policyList.add(new Policy(dto.getTypeOfProperty(), dto.getInsuranceType()));
            user.setPersonalPolicy(policyList);
            userService.save(user);
        }
    }
}
