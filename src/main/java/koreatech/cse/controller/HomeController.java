package koreatech.cse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     //어노테이션, 압축된 기능, 이 한 줄로 인해서 이 친구가 컨트롤러 기능을 하는 것을 나타냄
@RequestMapping("/")    //수많은 Request 중에서 홈주소에 반응할거다.
public class HomeController {

    @RequestMapping     //아무것도 안써있음 > 바로 실행
    public String home(Model model) {
        model.addAttribute("textFromController", "World");
        return "hello";
    }
}