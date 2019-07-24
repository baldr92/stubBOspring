package svetofor.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import svetofor.service.JsonService;

import java.util.ArrayList;

@RestController
public class BOcontroller {
    JsonService jsonService;
    public BOcontroller(JsonService jsonService){
        this.jsonService = jsonService;
    }


    //Endpoint for get query svetofor
    @RequestMapping(value = "/agent/briefSummary2",   produces = "application/json")
    @ResponseBody
    public String respGetJson(@RequestParam(value ="key") String key,
                              @RequestParam(value ="ogrns", required = false) String ogrns,
                              @RequestParam(value ="inns") String inns,
                              @RequestParam(value ="clientId") String clientId,
                              @RequestParam(value ="source") String source){
        JsonService service = new JsonService();
        ogrns = inns;
        String response = service.respJson(inns);
        System.out.println(response);
        return response;
    }
//?key=ea17f429189225647c13b874bb7a55d82a1301b0&ogrns=&inns={inns}&clientid=0&source=1
}