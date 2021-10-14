package ai.ecma.apppayme.service;


import ai.ecma.apppayme.json.PaycomRequestForm;
import net.minidev.json.JSONObject;

public interface IPaycomService {

    JSONObject payWithPaycom(PaycomRequestForm requestForm, String auth);


}
