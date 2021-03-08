package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV2;

public class FilleWriter_06 {
	
	public static void main(String[] args) {
		
		String fileNums = "src/com/callor/shop/files/nums_rnd.txt";
		
		RndServiceImplV2 rService = new RndServiceImplV2();
		
		rService.makeRnd();
		rService.saveFileRnd();
	}

}
