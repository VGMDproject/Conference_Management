package BackEnd;
import java.util.ArrayList;

//same as author

public class ProgramChair extends User{
	
	private static final long serialVersionUID = -8295240069655172405L;
		//private String myUser;
		private String myPCUsername;
		ArrayList<Paper> myPaperArrayList;
		Data myData;
		//Data myData;
		
		public ProgramChair() {
			myData = new Data();
		//	myPCUsername =this.getUserName();	
		//	PCflag = false;
		}
		
		private void setStatusConference() {
			
		}
		public void setSubprogramchair(String theSubProName, Conference theConf) {
			 myData = myData.getData(theSubProName, theConf);
			 SubprogramChair spc = new SubprogramChair();
			 myData.setRole(spc);
		}
		//
		private void setStatusPaper() {
		}
		//view all the list 
		public void viewPapers() {
			ArrayList<Paper> temp =myData.getConf().showConfPapa();
			for (int i = 0; i < temp.size(); i++) {
				System.out.println(temp.get(i).getAuthorName() + " " +temp.get(i).getConference().toString() );
			}
		}
		public String toString(){
			return "Program Chair";
		}
		

}
