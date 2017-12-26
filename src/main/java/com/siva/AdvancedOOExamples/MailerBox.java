package com.siva.AdvancedOOExamples;

public class MailerBox implements Box ,Mailer{
   private Box box ;
    public MailerBox(Box box) {
    	this.box=box;
    	
	// TODO Auto-generated constructor stub
}
	@Override
	public void pack() {
		// TODO Auto-generated method stub
		logger.info("pack box");
	}

	@Override
	public void seal() {
		// TODO Auto-generated method stub
		logger.info("seal box");
		
	}
	public void addPostage() {
		logger.info("affix stamps");
		}
		public void ship() {
		logger.info("put in mail box");
		}

}
