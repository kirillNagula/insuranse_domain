package by.nagula.insuranse_domain.service;

import by.nagula.insuranse_domain.entity.Policy;
import by.nagula.insuranse_domain.repository.PolicyRepository;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl implements PolicyService {
    private final PolicyRepository policyRepository;

    public PolicyServiceImpl(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @Override
    public void sava(Policy policy) {
        policyRepository.save(policy);
    }

    @Override
    public Policy getById(long id) {
        return policyRepository.getOne(id);
    }
}
