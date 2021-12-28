package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
   
   // main index
   @GetMapping("/")
   public String mainIndex() {
      return "main-index";
   }
   
   // sw개발사 메인 페이지
   @GetMapping("/sw/index-sw")
   public String indexSw() {
      return "sw/index-sw";
   }
   
   // 쇼핑몰 메인 페이지
   @GetMapping("/shop/index-shop")
   public String indexShop() {
      return "shop/index-shop";
   }

}