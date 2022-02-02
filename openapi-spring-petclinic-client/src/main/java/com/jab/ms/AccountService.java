package com.jab.ms;

import com.jab.ms.openapi.gen.model.OwnerDto;

import java.util.List;

public interface AccountService {

    List<OwnerDto> getOwners();
}
