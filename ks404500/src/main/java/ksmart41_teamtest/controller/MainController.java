package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
   
   /**
    * @Controller 를 정의한 클래스들의 메소드릐 반환열이 String인 경우 프로젝트 화면파일의 논리적 경로가 된다.
    * @return String -> 논리 이름만 쓴다.(ex:src/main/resources/templates+ "논리이름명" + .html)
    */
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