package com.project.ServiceImpl;

import com.project.Repositories.FacebookAccountRepository;
import com.project.Services.FacebookAccountService;
import com.project.entities.FacebookAccount;
import org.springframework.stereotype.Service;

@Service
public class FacebookAccountServiceImpl implements FacebookAccountService{

    private FacebookAccountRepository fbAccRepo;


    @Override
    public void save(FacebookAccount fbAccount) {
        this.fbAccRepo.saveAndFlush(fbAccount);
    }
}
