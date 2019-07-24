package svetofor.service;

import org.springframework.stereotype.Service;

@Service
public class JsonService {
        public String respJson(String inn) {
            String response = "[  \n" +
                    "   {  \n" +
                    "      \"inn\":\""+inn+"\",\n" +
                    "      \"ogrn\":\"1087799008967\",\n" +
                    "      \"shortName\":\"Фонд Константина Хабенского\",\n" +
                    "      \"fullName\":\"Благотворительный Фонд Константина Хабенского\",\n" +
                    "      \"kpp\":\"770901001\",\n" +
                    "      \"version\":\"000000087E40000F-0000000000000000\",\n" +
                    "      \"summary\":{  \n" +
                    "         \"yellow\":1,\n" +
                    "         \"green\":6\n" +
                    "      }\n" +
                    "   }\n" +
                    "]";
        return response;
        }


}
