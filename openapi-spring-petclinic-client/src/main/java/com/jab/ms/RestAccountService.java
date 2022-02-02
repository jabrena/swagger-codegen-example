package com.jab.ms;

import com.jab.ms.openapi.gen.api.OwnerApi;
import com.jab.ms.openapi.gen.client.ApiClient;
import com.jab.ms.openapi.gen.model.OwnerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestAccountService implements AccountService {

    private final OwnerApi ownerApi;
    private final ApiClient apiClient;

    public RestAccountService(ApiClient apiClient) {
        this.apiClient = apiClient;
        this.ownerApi = new OwnerApi(apiClient);
    }

    @Override
    public List<OwnerDto> getOwners() {
        return ownerApi.listOwners("Demo", "");
    }
}
