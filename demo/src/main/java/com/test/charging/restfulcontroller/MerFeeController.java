package com.test.charging.restfulcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.common.json.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hnapay.settle.configruator.enums.AlgTypeEmun;
import com.hnapay.settle.configruator.enums.ReturnFeeEnum;
import com.hnapay.settle.configruator.request.MerFeeInfoRequest;
import com.hnapay.settle.configruator.service.IMerFeeInfoService;
import com.hnapay.sis.charging.request.MerComputeFeeRequest;
import com.hnapay.sis.charging.service.MerCalculateFeeService;

@RestController
@RequestMapping("/test")
public class MerFeeController {
	@Autowired
	private MerCalculateFeeService service;
	@Autowired
	private IMerFeeInfoService configService;
	
	@PostMapping(value="/merChargingFee")
	public String chargingMercFee(@RequestBody MerComputeFeeRequest request) {
		System.out.println("The Request Params Class is:"+request.getClass().getName());
		System.out.println("Params: "+request);
		System.out.println("request accessed");
		return service.calculateFee(request).toString();
	}
	
	@PostMapping(value="/merConfigFee")
	public String configMercFee(@RequestBody MerFeeInfoRequest request) {
		System.out.println("The Request Params Class is:"+request.getClass().getName());
		System.out.println("Params: "+request);
		System.out.println("request accessed");
		return configService.feeIfo(request).toString();
	}
	
	public static void main(String[] arg) {
		System.out.println("test");
		MerFeeInfoRequest merFeeInfoRequest = new MerFeeInfoRequest();
		
		merFeeInfoRequest.setMerId("123");
		merFeeInfoRequest.setMerName("234");
		merFeeInfoRequest.setCustomerId("455");
		merFeeInfoRequest.setProdId("123456");
		merFeeInfoRequest.setProcName("235678");
		merFeeInfoRequest.setBankId("23");
		merFeeInfoRequest.setFeeType("223");
		merFeeInfoRequest.setOrigFeeType(AlgTypeEmun.D_RATE_VALUE);
		merFeeInfoRequest.setReturnFlag(ReturnFeeEnum.Return);
		merFeeInfoRequest.setList(new ArrayList());
		merFeeInfoRequest.setDateBegin("20181021");
		merFeeInfoRequest.setDateEnd("20181022");
		merFeeInfoRequest.setCrtDate("20181023");
		String jsonStr = (new Gson()).toJson(merFeeInfoRequest);
		System.out.println(jsonStr);

		
	}

}
