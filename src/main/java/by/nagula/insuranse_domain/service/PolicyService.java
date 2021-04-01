package by.nagula.insuranse_domain.service;

import by.nagula.insuranse_domain.entity.Policy;

public interface PolicyService {
    void sava(Policy policy);
    Policy getById(long id);
}
