package svetofor.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import svetofor.service.JsonService;

@RestController
public class BOcontroller {
    JsonService jsonService;
    public BOcontroller(JsonService jsonService){
        this.jsonService = jsonService;
    }


    //Endpoint for get query svetofor
    @RequestMapping(value = "/office/api/v2/{InnOrOgrn}/rating",   produces = "application/json")
    //@ResponseBody
    public String respGetJson(@PathVariable (value="InnOrOgrn") String InnOrOgrn,
                           @RequestParam (value = "ClientId") String clientId){
        JsonService service = new JsonService();
        String response = service.respJson(InnOrOgrn);
        System.out.println(response);
        return response;
    }



    //Endpoint for POST query
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void respPostJson(){

    }


}


