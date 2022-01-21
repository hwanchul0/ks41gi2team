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
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.Code;
import ksmart41_teamtest.dto.InvoiceReason;
import ksmart41_teamtest.dto.SwIsListCode;
import ksmart41_teamtest.service.CodeService;
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
	//환철
	private CodeService codeService;
	public SwCodeController(CodeService codeService) {
		this.codeService = codeService;
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
	
	
	// [환철]SW 계약상태 코드 등록
	@GetMapping("/addContractStateCode")
	public String addContractStateCode(Model model) {
		model.addAttribute("title","계약상태 코드 등록");
		return "sw/code/addContractStateCode";
	}
	@PostMapping("/addContractStateCode")
	public String addContractStateCode(Code contractStateCode) {
		codeService.addContractStateCode(contractStateCode);
		return "redirect:/sw/code/selectContractStateCode";
	}
	// [환철]SW 계약상태 코드 등록 - 중복체크
	@PostMapping("/contractCodeCheck")
	@ResponseBody
	public boolean contractCodeCheck(@RequestParam(value = "contractStateCode", required = false)String contractStateCode) {
		boolean contractStateCodeResult = false;
		int codeCheck = codeService.contractCodeCheck(contractStateCode);
		if(codeCheck > 0) {
			contractStateCodeResult = true;
		}
		return contractStateCodeResult;
	}
	// [환철]SW 계약상태 코드 조회
	@GetMapping("/selectContractStateCode")
	public String selectContractStateCode(Model model) {
		List<Code> selectContractStateCode = codeService.selectContractStateCode();
		model.addAttribute("title","계약상태 코드 조회");
		model.addAttribute("selectContractStateCode",selectContractStateCode);
		return "sw/code/selectContractStateCode";
	}
	@RequestMapping("/deleteContractStateCode")
	public @ResponseBody int deleteContractStateCode(Code ContractStateCode) {
		log.info("계약상태코드 삭제 페이지 ========={}:",ContractStateCode);
		return codeService.deleteContractStateCode(ContractStateCode);
	}
	

	// [환철]SW 환불상태 코드 등록
	@GetMapping("/addContractRefundStateCode")
	public String addContractRefundStateCode(Model model) {
		model.addAttribute("title","환불상태 코드 등록");
		return "sw/code/addContractRefundStateCode";
	}
	@PostMapping("/addContractRefundStateCode")
	public String addContractRefundStateCode(Code refundStateCode) {
		codeService.addContractRefundStateCode(refundStateCode);
		return "redirect:/sw/code/selectContractRefundStateCode";
	}
	// [환철] 환불상태 코드 중복체크
	@PostMapping("/refundCodeCheck")
	@ResponseBody
	public boolean refundCodeCheck(@RequestParam(value = "refundStateCode", required = false)String refundStateCode) {
		boolean refundStateCodeResult = false;
		int codeCheck = codeService.refundCodeCheck(refundStateCode);
		if(codeCheck > 0) {
			refundStateCodeResult = true;
		}
		return refundStateCodeResult;
	}
	// [환철]SW 환불상태 코드 조회
	@GetMapping("/selectContractRefundStateCode")
	public String selectContractRefundStateCode(Model model) {
		List<Code> selectContractRefundStateCode = codeService.selectContractRefundStateCode();
		model.addAttribute("title","환불상태 코드 조회");
		model.addAttribute("selectContractRefundStateCode",selectContractRefundStateCode);
		return "sw/code/selectContractRefundStateCode";
	}
	// [환철] 환불상태 코드 삭제
	@RequestMapping("/deleteRefundStateCode")
	public @ResponseBody int deleteRefundStateCode(Code RefundStateCode) {
		log.info("환불상태코드 삭제 페이지 ========={}:",RefundStateCode);
		return codeService.deleteRefundStateCode(RefundStateCode);
	}
	
	// [환철]SW 결제상태 코드 등록
	@GetMapping("/addPaymentStateCode")
	public String addPaymentStateCode(Model model) {
		model.addAttribute("title","SW 결제상태 코드 등록");
		return "sw/code/addPaymentStateCode";
	}
	@PostMapping("/addPaymentStateCode")
	public String addPaymentStateCode(Code paymentStateCode) {
		String paymentcode = paymentStateCode.getPaymentStateCode();
		if(paymentcode != null && !"".equals(paymentcode)) {
			codeService.addPaymentStateCode(paymentStateCode);
		}
		return "redirect:/sw/code/selectPaymentStateCode";
	}
	// [환철]SW 결제상태 코드 등록 - 중복체크
	@PostMapping("/paymentCodeCheck")
	@ResponseBody
	public boolean PaymentCodeCheck(@RequestParam(value = "paymentStateCode", required = false)String paymentStateCode) {
		boolean checkResult = false;
		int codeCheck = codeService.PaymentCodeCheck(paymentStateCode);
		if(codeCheck > 0) {
			checkResult = true;
		}
		return checkResult;
	}
	
	// [환철]SW 결제상태 코드 조회
	@GetMapping("/selectPaymentStateCode")
	public String selectPaymentStateCode(Model model) {
		List<Code> paymentlist = codeService.selectPaymentStateCode();
		model.addAttribute("title", "결제 상태 코드 조회");
		model.addAttribute("paymentlist", paymentlist);
		return "sw/code/selectPaymentStateCode";
	}
	//[환철] 결제상태 코드 삭제 
	@RequestMapping("/deletePaymentStateCode")
	public @ResponseBody int deletePaymentStateCode(Code PaymentStateCode) {
		log.info("결제상태코드 삭제 페이지 ========={}:",PaymentStateCode);
		return codeService.deletePaymentStateCode(PaymentStateCode);
	}
	
	

}
