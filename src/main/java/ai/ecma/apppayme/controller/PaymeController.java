package ai.ecma.apppayme.controller;

import ai.ecma.apppayme.json.PaycomRequestForm;
import ai.ecma.apppayme.service.IPaycomService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/payme")
@RestController
public class PaymeController {
    @Autowired
    private IPaycomService ipaycomService;

    @PostMapping
    JSONObject post(@RequestBody PaycomRequestForm requestForm,
                    @RequestHeader("Authorization") String authorization) {
        return ipaycomService.payWithPaycom(requestForm, authorization);
    }
}