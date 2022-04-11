package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!");
        return "hello";
        // resources -> templates -> hello.html
        // 컨트롤러에서 리턴값으로 문자를 반환하면 뷰 리졸버가 화면을 찾아서 처리한다.
    }

    // view라는 템플릿이 있는 방식... 그걸 조작하는.
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    // 코딩한대로 그대로 보내주는 느낌?
    @GetMapping("hello-string")
    @ResponseBody // http의 body부에 이 데이터를 직접 넣어주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name; // hello spring
    }

    // 기본적으로 json으로 세팅되어 있음.. json 형태로 사용하는게 좋음
    @GetMapping("hello-api")
    @ResponseBody // 객체가 오면 json방식으로 데이터를 만들어서 전달하겠다는게 기본원칙
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
