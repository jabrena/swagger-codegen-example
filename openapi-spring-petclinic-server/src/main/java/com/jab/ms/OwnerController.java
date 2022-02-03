package com.jab.ms;

import com.jab.ms.openapi.gen.api.OwnerApi;
import com.jab.ms.openapi.gen.model.OwnerDto;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api")
public class OwnerController implements OwnerApi {

    @Override
    public ResponseEntity<List<OwnerDto>> listOwners(String lastName, String ifNoneMatch) {
        var owner = new OwnerDto();
        owner.setFirstName("Demo");
        return ResponseEntity.ok().body(List.of(owner));
    }

}
