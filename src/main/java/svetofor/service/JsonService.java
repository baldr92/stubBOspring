package svetofor.service;

import org.springframework.stereotype.Service;

@Service
public class JsonService {
        public String respJson(String inn) {
            String response = "{\n" +
                    "\t  \"data\": \n" +
                    "\t  {\n" +
                    "\t\t\"Requisites\": {\n" +
                    "\t\t\t\"Inn\": \"" + inn +"\",\n" +
                    "\t\t\t\"Kpp\": \"343501001\",\n" +
                    "\t\t\t\"Ogrn\": \"1143435005922\"\n" +
                    "\t\t},\n" +
                    "\t\t\"Rating\": {\n" +
                    "\t\t\t\"Type\": 3 \n" +
                    "\t\t}\n" +
                    "\t  },\n" +
                    "\t  \"errors\": \n" +
                    "       {\n" +
                    "           \"message\": [\"Something went wrong. Fix it!\"]\n" +
                    "       }\n" +
                    "}";
        return response;
        }


}
