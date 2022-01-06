package ksmart41_teamtest.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.InvoiceReason;
import ksmart41_teamtest.dto.SwIsListCode;
import ksmart41_teamtest.service.InvoiceReasonService;
import ksmart41_teamtest.service.SwIsListService;

@Controller
@RequestMapping("/sw/code")
public class SwCodeController {
	private static final Logger log = LoggerFactory.getLogger(SwCodeController.class);
	
	/*유경 */
	@Autowired
	private InvoiceReasonService invoiceReasonService;
	/*유경 */
	@Autowired
	private SwIsListService swIsListService;
	
	@GetMapping("/addBusinessCode")
	public String addBusinessCode() {
		return "sw/code/addBusinessCode";
	}
	
	@GetMapping("/selectBusinessCode")
	public String selectBusinessCode() {
		return "sw/code/selectBusinessCode";
	}
	
	@GetMapping("/addLocalCode")
	public String addLocalCode() {
		return "sw/code/addLocalCode";
	}
	
	@GetMapping("/selectLocalCode")
	public String selectLocalCode() {
		return "sw/code/selectLocalCode";
	}
	
	
	@GetMapping("/addInvoiceReasonCode")
	public String addInvoiceReasonCode() {
		
		return "sw/code/addInvoiceReasonCode";
	}
	
	/*유경 개발사 세금계산서 사유코드 조회 - 안쓸듯 */
	@GetMapping("/selectInvoiceReasonCode")
	public String selectInvoiceReasonCode(Model model) {
		List<InvoiceReason> invoiceReason = invoiceReasonService.getInvoiceReasonList();
		model.addAttribute("title", "세금계산서수정 사유 코드 조회");
		model.addAttribute("invoiceReason", invoiceReason);
		System.out.println(invoiceReason + "<-- controller");
		return "sw/code/selectInvoiceReasonCode";
	}
	
	/*유경 개발사 손익계정과목 등록 -> 수정*/
	@PostMapping("/addIsListCode")
	public String modifyIsListCode(SwIsListCode swIsListCode) {
		 log.info("정보 : {}", swIsListCode );
		//계정사용여부수정
		swIsListService.modifyIsListCode(swIsListCode);
		return "redirect:/sw/code/selectIsListCode";
	}
	
	
	/*유경 개발사 손익계정과목 등록 -> 수정으로 바꿀 예정*/
	@GetMapping("/addIsListCode")
	public String modifyIsListCode(@RequestParam(value="swIsCode", required = false) String swIsCode
            ,Model model, HttpServletResponse response,HttpServletRequest request) throws IOException {
		//System.out.println("swIsCode :"+ swIsCode);
		SwIsListCode swIsCodeInfo = swIsListService.getSwIsCodeBySwIsListCode(swIsCode);
		List<SwIsListCode> swIsListCode = swIsListService.getSwIsListCode();
		response.setContentType("text/html; charset=UTF-8");
		if(swIsCode != null && !"".equals(swIsCode) && "Y".equals(swIsCodeInfo.getSwIsAmend()) ) {
			model.addAttribute("swIsCodeInfo", swIsCodeInfo);
			model.addAttribute("swIsListCode", swIsListCode);
			swIsCodeInfo.getSwIsAmend();

		}else if("N".equals(swIsCodeInfo.getSwIsAmend())){
            PrintWriter out = response.getWriter();
            out.println("<script>alert('수정할 수 없는 계정과목입니다.'); history.go(-1);</script>");
            out.flush();
            out.close();
		}
		return "sw/code/addIsListCode";
	}
	
	/*유경 개발사 손익계정과목 조회*/
	@GetMapping("/selectIsListCode")
	public String selectIsListCode(Model model) {
		List<SwIsListCode> swIsListCode = swIsListService.getSwIsListCode();
		model.addAttribute("title", "손익계정과목 조회");
		model.addAttribute("swIsListCode", swIsListCode);
		System.out.println(swIsListCode + "controller");
		return "sw/code/selectIsListCode";
	}
	
	@GetMapping("/addContractStateCode")
	public String addContractStateCode() {
		return "sw/code/addContractStateCode";
	}
	
	@GetMapping("/selectContractStateCode")
	public String selectContractStateCode() {
		return "sw/code/selectContractStateCode";
	}
	
	@GetMapping("/addPaymentStateCode")
	public String addPaymentStateCode() {
		return "sw/code/addPaymentStateCode";
	}
	
	@GetMapping("/selectPaymentStateCode")
	public String selectPaymentStateCode() {
		return "sw/code/selectPaymentStateCode";
	}
	
	@GetMapping("/addContractRefundStateCode")
	public String addContractRefundStateCode() {
		return "sw/code/addContractRefundStateCode";
	}
	
	@GetMapping("/selectContractRefundStateCode")
	public String selectContractRefundStateCode() {
		return "sw/code/selectContractRefundStateCode";
	}
	
	

}
