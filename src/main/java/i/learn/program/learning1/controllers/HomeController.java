package i.learn.program.learning1.controllers;

import i.learn.program.learning1.Database.ShopList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private ShopList shopList = new ShopList();

    @GetMapping(value = "/")
    public String shop(Model model) {
    return "shop";
    }
    @GetMapping(value = "/list")
    public String list(Model model) {
        model.addAttribute("product", shopList.getProducts());
        return "list";
    }
    @GetMapping(value = "/description")
    public String description(@RequestParam("index") int index, Model model) {
        model.addAttribute("zat",shopList.getProducts().get(index));
        return "description";
    }
    @GetMapping(value = "/list1")
    public String list1(Model model) {
        model.addAttribute("product1", shopList.getProducts1());
        return "list1";
    }
    @GetMapping(value = "/description1")
    public String description1(@RequestParam("index") int index, Model model) {
        model.addAttribute("zat",shopList.getProducts1().get(index));
        return "description1";
    }
    @GetMapping(value = "/list2")
    public String list2(Model model) {
        model.addAttribute("product2", shopList.getProducts2());
        return "list2";
}
    @GetMapping(value = "/description2")
    public String description2(@RequestParam("index") int index, Model model) {
        model.addAttribute("zat",shopList.getProducts2().get(index));
        return "description2";
    }
    @GetMapping(value = "/list3")
    public String list3(Model model) {
        model.addAttribute("product3", shopList.getProducts3());
        return "list3";
    }
    @GetMapping(value = "/description3")
    public String description3(@RequestParam("index") int index, Model model) {
        model.addAttribute("zat",shopList.getProducts3().get(index));
        return "description3";
    }
    @GetMapping(value = "/list4")
    public String list4(Model model) {
        model.addAttribute("product4", shopList.getProducts4());
        return "list4";
    }
    @GetMapping(value = "/description4")
    public String description4(@RequestParam("index") int index, Model model) {
        model.addAttribute("zat",shopList.getProducts4().get(index));
        return "description4";
    }

}
