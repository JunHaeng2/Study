package helllo.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // Rest API , 문자를 반환할수있음
// Controller 같은 경우는 ModelAndView를 반환해버리니까.. !
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // log.info(" info log = " + name);

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info(" info log = {}", name);
        log.warn(" warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}
