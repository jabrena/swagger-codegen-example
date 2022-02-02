package com.jab.ms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountsController {

    private final AccountService accountService;

    public AccountsController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(path = "/accounts")
    public String getAccounts(Model model) {
        var list = accountService.getOwners();
        list.stream().forEach(System.out::println);
        //model.addAttribute("accounts", accountService.getOwners());
        return "list";
    }
}
