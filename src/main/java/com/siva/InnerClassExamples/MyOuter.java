package com.siva.InnerClassExamples;

import org.apache.log4j.Logger;

public class MyOuter {
	private int x =3;
	public void getInner()
	{
		Inner i = new Inner();
		i.seeInner();
	}

	class Inner{
		Logger logger = Logger.getLogger(getClass());
		public void seeInner()
		{
			logger.info(x);
			logger.info("inner instance:"+this);
			logger.info("outer instance:"+MyOuter.this);
			
			
		}
		
	}
	public static void main(String[] args) {
		MyOuter.Inner inner = new MyOuter().new Inner();
		inner.seeInner();;
	}
}
