package cz.upce.fei.cv01.controller;

import cz.upce.fei.cv01.dto.SimpleBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
10.c
    @Controller je běžná anotace, která se používá k označení třídy jako Spring MVC Controller
    @RestController je speciální ovladač používaný ve webových službách RESTFul a je ekvivalentem @Controller + @ResponseBody.
 */

@RestController
//@RequestMapping("api/v1")
public class HelloController {

    @GetMapping("")
    public String helloWorld() {
        return "Hello world from Spring Boot application.";
    }

    @GetMapping("path/{message}")
    public String getParamFromURI(@PathVariable  String message) {
        return "Test text is: " + message;
    }

    @PostMapping("request-body")
    public String postController(@RequestBody SimpleBody body) {
        return body.toString();
    }
}


/*
16.d
    YAML syntaxe se vyznačuje zejména odsazejím a poté dvojicí klíč:hodnota
        př.:
        configurations:
            name: Ingress
            value: data/input

    JSON syntaxe přidává závorky a retezce se píší do uvozovek
        př.:
        "configurations":[
            {
               "name": "Ingress",
               "value": "data/input"
            }

    XML syntaxe se podobá HTML kódu kde je každá hodnota zanořena mezi počáteční a koncový tag
        př.:
        <Configurations>
            <Config>
              <Name>Ingress</Name>
              <Value>data/input</Value>
            </Config>
 */