package com.mc;

import com.mc.sea.Fish;
import com.mc.sea.Sea;
import com.mc.sea.Shark;

public class Test1 {
	
	public static void main(String[] args) {
		
		// 물고기 만들기
		Fish fish1 = new Fish("물고기1");
		Fish fish2 = new Fish("물고기2");
		
		// 상어 만들기
		Shark shark1 = new Shark("상어1");
		Shark shark2 = new Shark("상어2");
		
		System.out.println("물고기는 총 " + Sea.count + "마리 이다.");
		
	}

}
