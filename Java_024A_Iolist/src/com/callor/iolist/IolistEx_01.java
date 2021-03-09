package com.callor.iolist;

import com.callor.iolist.service.IolistService;
import com.callor.iolist.service.impl.IolistServiceImplV1;

public class IolistEx_01 {
	
	public static void main(String[] args) {
		
		IolistService ioSerive = new IolistServiceImplV1();
		
		ioSerive.loadDataFromFile();
		ioSerive.iolistSum();
		ioSerive.printIolist();
	}

}
